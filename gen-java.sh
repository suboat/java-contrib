#!/bin/bash
thrift -r --gen java -out library/src/main/java/ rpcbase.thrift
