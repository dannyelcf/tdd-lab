# TDD Lab

This repository contains my study experiments of Java TDD development.

### Used Commands

Run the code below to create the `@mvn` function in your current shell section.
The `@mvn` function run the `mvn` command inside a docker container using
`maven:3.5.4-jdk-8-alpine` image.

``` sh
    source setup-env
```

Run the code below to create `tdd-1` maven project in your current directory.

``` sh
    @mvn archetype:generate -DgroupId=com.github.dannyelcf.tdd -DartifactId=tdd-1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Enter in `tdd-1` directory and run all tests.

``` sh
    cd tdd-1
    @mvn clean test
```