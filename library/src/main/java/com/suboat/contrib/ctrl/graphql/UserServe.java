package com.suboat.contrib.ctrl.graphql;

import com.suboat.contrib.rpc.RpcConnConfig;
import com.suboat.contrib.rpc.user.UserService;
import lombok.Data;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class UserServe {

	private static final Logger log = LoggerFactory.getLogger(UserServe.class);

	// 默认公共参数
	public static RpcConnConfig Config;

	private TTransport transport;

	private UserService.Client client;

	private RpcConnConfig config;

	public UserServe() {
		syncConfig();
	}

	//
	public UserServe(RpcConnConfig cfg) {
		config = cfg;
		syncConfig();
	}

	//
	public UserServe(String addr) {
		config = new RpcConnConfig();
		config.host = addr;
		config.timeout = 30000;
		syncConfig();
	}

	private void syncConfig() {
		if (Config == null && config != null) {
			Config = config;
		}
		if (config == null && Config != null) {
			config = Config;
		}
		if (config == null) {
			config = new RpcConnConfig();
			config.host = "localhost";
			config.port = 8190;
			config.timeout = 30000;
		}
	}

	public UserService.Client getClient() {
		if (transport != null && client != null) {
			return client;
		}
		try {
			log.info("rpc-user conn {}:{} open", config.host, config.port);
			transport = new TSocket(config.host, config.port, config.timeout);
			// 协议要和服务端一致
			TProtocol protocol = new TBinaryProtocol(transport);
			transport.open();
			client = new UserService.Client(protocol);
		}
		catch (TTransportException e) {
			e.printStackTrace();
		}
		return client;
	}

	// 关闭链接
	public void close() {
		if (transport == null) {
			return;
		}
		log.info("rpc-user conn {}:{} close", config.host, config.port);
		transport.close();
		transport = null;
		client = null;
	}

}
