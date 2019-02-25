# TDD Lab - Java EE 6

This repository contains my studies and experiments of TDD development using Java EE 6 platform.

### Development Environment

To manage my development environment I use [docker-compose](https://docs.docker.com/compose).
See the my `Dockerfile` and `docker-compose.yml` in `.docker` folder.

To initialize the development environment run `launch-dev-env.sh` shell script into 
`tdd-lab/javaee6` folder.

```
~/.../tdd-lab/javaee6$ sh launch-dev-env.sh
```

That will create a docker container with a volume mapping the current folder 
(`~/.../tdd-lab/javaee6`) to `/tdd-lab/javaee6` folder in the container.

```
/tdd-lab/javaee6 # 
```
