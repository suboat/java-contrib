#!/bin/bash
thrift -r --gen java:generated_annotations=suppress -out library/src/main/java/ user.thrift
thrift -r --gen java:generated_annotations=suppress -out library/src/main/java/ wallet.thrift
thrift -r --gen java:generated_annotations=suppress -out library/src/main/java/ mall.thrift
./format.sh
git checkout HEAD -- library/src/main/java/com/suboat/contrib/rpc/base/Error.java
