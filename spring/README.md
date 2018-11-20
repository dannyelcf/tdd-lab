# TDD Lab - Spring

This repository contains my studies and experiments of TDD development using Spring framework.

### Development Environment

To manage my development environment I use [docker-compose](https://docs.docker.com/compose).
See the my `Dockerfile` and `docker-compose.yml` in `.docker` folder.

To initialize the development environment run `launch-dev-env.sh` shell script into 
`tdd-lab/spring` folder.

```
~/.../tdd-lab/spring$ sh launch-dev-env.sh
```

That will create a docker container with a volume mapping the current folder 
(`~/.../tdd-lab/spring`) to `/tdd-lab/spring` folder in the container.

```
/tdd-lab/spring # 
```
