package com.suboat.contrib.ctrl.context;

import com.suboat.contrib.ctrl.JwtTokenBase;
import com.suboat.contrib.ctrl.JwtTokenProvider;
import com.suboat.contrib.error.Rest;
import graphql.schema.DataFetchingEnvironment;
import graphql.servlet.context.GraphQLServletContext;
import io.jsonwebtoken.Claims;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class ContextAuth extends JwtTokenBase {

	// true: 是工作人员/管理员
	public Boolean isStaff;

	// 复制每个值
	public void update(ContextAuth contextAuth) {
		if (contextAuth == null) {
			return;
		}
		this.exp = contextAuth.exp;
		this.cre = contextAuth.cre;
		this.uid = contextAuth.uid;
		this.level = contextAuth.level;
		this.ip = contextAuth.ip;
		this.id = contextAuth.id;
		this.psw = contextAuth.psw;
		this.isStaff = contextAuth.isStaff;
	}

	// 从token中取状态
	private void updateSelfByToken(@NotNull String token, String cate) throws Exception {
		if (token == null || token.length() == 0) {
			throw new Rest.ParamInvalid("token");
		}
		if (token.startsWith("Bearer ")) {
			token = token.substring(7);
		}

		// 解析token
		Claims claims = new JwtTokenProvider(cate).validateToken(token);

		// 解读token信息
		ContextAuth contextAuth = new ContextAuth();
		contextAuth.uid = (String) claims.get("uid");
		update(contextAuth);
	}

	private void updateSelfByEnv(@NotNull DataFetchingEnvironment env, String cate) throws Exception {
		if (env == null) {
			throw new NullPointerException();
		}
		// 尝试从token读取
		GraphQLServletContext context = env.getContext();
		HttpServletRequest httpServletRequest = context.getHttpServletRequest();
		String token = httpServletRequest.getHeader("Authorization"); // 正确的key
		if (token == null || token.length() == 0) {
			token = httpServletRequest.getHeader("Authentication"); // 兼容key
		}
		updateSelfByToken(token, cate);
	}

	public ContextAuth() {
	}

	// 初次验证
	public ContextAuth(@NotNull DataFetchingEnvironment env, String token, String cate) throws Exception {
		// 取上下文
		ContextAuth contextAuth = Objects.requireNonNull(Context.GetAuth(env));
		// 验证token
		if (token != null && token.length() > 0) {
			updateSelfByToken(token, cate);
		}
		else {
			updateSelfByEnv(env, cate);
		}
		// 验证是否成功
		if (this.uid == null || this.uid.length() == 0) {
			throw new Rest.TokenInvalid("未知错误");
		}
		// 更新上下文
		contextAuth.update(this);
	}

	// 复用验证
	public ContextAuth(@NotNull DataFetchingEnvironment env) throws Exception {
		ContextAuth contextAuth = Objects.requireNonNull(Context.GetAuth(env));
		if (contextAuth.uid == null || contextAuth.uid.length() == 0) {
			throw new Rest.TokenInvalid("未知错误");
		}
		// 复用验证
		update(contextAuth);
	}

}
