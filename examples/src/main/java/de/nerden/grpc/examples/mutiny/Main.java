package de.nerden.grpc.examples.mutiny;

import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException, InterruptedException {

    var server = ServerBuilder.forPort(8080).addService(new HelloServiceImpl()).addService(
        ProtoReflectionService.newInstance()).build();
    server.start();
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      server.shutdown();
    }));
    server.awaitTermination();
  }

}
