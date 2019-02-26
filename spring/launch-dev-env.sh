#!/usr/bin/env bash
set -e
docker-compose -f .docker/docker-compose.yml run --rm --service-ports spring
