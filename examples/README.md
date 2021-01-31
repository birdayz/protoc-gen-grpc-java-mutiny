# Mutiny gRPC example

Run src/main/java/..../Main.java and try out with grpcurl:
```
grpcurl -plaintext localhost:8080 de.nerden.grpc.examples.mutiny.HelloService.hello
{
  "greeting": "Test-greeting"
}
```