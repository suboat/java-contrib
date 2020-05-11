#!/bin/bash
#thrift -r --gen java -out library/src/main/java/ rpcbase.thrift
thrift -r --gen java -out library/src/main/java/ user.thrift
thrift -r --gen java -out library/src/main/java/ wallet.thrift
thrift -r --gen java -out library/src/main/java/ mall.thrift
