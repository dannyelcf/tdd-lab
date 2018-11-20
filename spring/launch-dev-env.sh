#!/usr/bin/env bash -e
docker-compose -f .docker/docker-compose.yml run --rm --service-ports spring
