#!/bin/bash
thrift -r --gen java:generated_annotations=suppress -out library/src/main/java/ user.thrift
thrift -r --gen java:generated_annotations=suppress -out library/src/main/java/ wallet.thrift
thrift -r --gen java:generated_annotations=suppress -out library/src/main/java/ mall.thrift
