package com.suboat.contrib.rpc;

import lombok.Data;

// rpc链接参数
@Data
public class RpcConnConfig {

	public String host = "localhost";

	public int port = 8190;

	public int timeout = 30000;

}
