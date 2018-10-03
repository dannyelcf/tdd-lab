# TDD Lab

This repository contains my study experiments of Java TDD development.

### Requirements

To manage environment variables of this project I use [direnv](https://github.com/direnv/direnv).

To run all codes of this project I use maven command inside a docker container. 
See the content of `direnv/mvn.sh` to know how I do that.

To run all unit tests of a project inside a docker container you should execute 
the following in project folder.

``` sh
$ $mvn clean test
```

Note that `$mvn` is using rather than `mvn`. See the content of `.envrc` to see 
how I created `$mvn` environment variable.
