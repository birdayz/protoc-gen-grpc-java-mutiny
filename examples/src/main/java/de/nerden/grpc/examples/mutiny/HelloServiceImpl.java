package de.nerden.grpc.examples.mutiny;

import de.nerden.grpc.examples.mutiny.generated.HelloRequest;
import de.nerden.grpc.examples.mutiny.generated.HelloResponse;
import de.nerden.grpc.examples.mutiny.generated.MutinyHelloServiceGrpc;
import io.smallrye.mutiny.Uni;

public class HelloServiceImpl extends MutinyHelloServiceGrpc.HelloServiceImplBase {

  @Override
  public Uni<HelloResponse> hello(HelloRequest request) {
    return Uni.createFrom().item(HelloResponse.newBuilder().setGreeting("Test-greeting").build());
  }

}
