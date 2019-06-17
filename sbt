#!/usr/bin/env bash

WORK_DIR=$(dirname $0)
pushd ${WORK_DIR}
LAUNCHER_PATH=$(pwd)/project/sbt-launch.jar
chmod a+x ${LAUNCHER_PATH}
java -jar ${LAUNCHER_PATH}
popd
