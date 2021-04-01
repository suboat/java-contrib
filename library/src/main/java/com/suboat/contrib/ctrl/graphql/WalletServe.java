package com.suboat.contrib.ctrl.graphql;

import com.suboat.contrib.rpc.RpcConnConfig;
import com.suboat.contrib.rpc.wallet.WalletService;
import lombok.Data;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class WalletServe {

	private static final Logger log = LoggerFactory.getLogger(WalletServe.class);

	// 默认公共参数
	public static RpcConnConfig Config;

	private TTransport transport;

	private WalletService.Client client;

	private RpcConnConfig config;

	public WalletServe() {
		syncConfig();
	}

	//
	public WalletServe(RpcConnConfig cfg) {
		config = cfg;
		syncConfig();
	}

	//
	public WalletServe(String addr) {
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
			config.port = 8494;
			config.timeout = 30000;
		}
	}

	public WalletService.Client getClient() {
		if (transport != null && client != null) {
			return client;
		}
		try {
			log.info("rpc-wallet conn {}:{} open", config.host, config.port);
			if (config.framed) {
				transport = new TFramedTransport(new TSocket(config.host, config.port, config.timeout));
			}
			else {
				transport = new TSocket(config.host, config.port, config.timeout);
			}
			// 协议要和服务端一致
			TProtocol protocol = new TBinaryProtocol(transport);
			transport.open();
			client = new WalletService.Client(protocol);
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
		log.info("rpc-wallet conn {}:{} close", config.host, config.port);
		transport.close();
		transport = null;
		client = null;
	}

}
