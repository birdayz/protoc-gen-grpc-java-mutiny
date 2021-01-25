# protoc-gen-java-grpc-mutiny

Binary for quarkus' protoc compile plugin for custom grpc bindings using [Mutiny](https://smallrye.io/smallrye-mutiny/), so it can be directly used with protoc.

Gratefully using Quarkus' code [generator](https://github.com/quarkusio/quarkus/blob/master/extensions/grpc/protoc/src/main/java/io/quarkus/grpc/protoc/plugin/MutinyGrpcGenerator.java).

## Configuring GraalVM

GraalVM is used to build the binary. The protoc compiler plugin uses lots of reflection, so a dedicated reflection config for GraalVM is required.
A shell script with the following content can be used to run the compiler plugin from its JAR, to profile reflection calls:

```
#!/bin/bash

java -agentlib:native-image-agent=config-output-dir=/tmp -jar protoc-gen-grpc-java-mutiny/target/protoc-gen-grpc-java-mutiny-1.0-SNAPSHOT.jar $@
```

This outputs /tmp/reflect-config.json.