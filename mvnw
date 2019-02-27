#!/usr/bin/env bash
set -e

cd javaee6/reservation; ./mvnw $*; EXIT_CODE=$?; cd ../../; if [[ $EXIT_CODE != 0 ]]; then exit $EXIT_CODE; fi
cd spring/reservation; ./mvnw $*; EXIT_CODE=$?; cd ../../; if [[ $EXIT_CODE != 0 ]]; then exit $EXIT_CODE; fi