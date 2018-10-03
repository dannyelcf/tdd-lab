#!/bin/bash

docker run -it --rm --name tdd-lab \
-v "$HOME/.m2":/root/.m2 \
-v "$(pwd)":/tmp/tdd-lab \
-w /tmp/tdd-lab \
maven:3.5.4-jdk-8-alpine \
mvn "$@"
