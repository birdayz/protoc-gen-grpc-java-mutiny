package de.nerden.grpc.examples.mutiny.generated;

import static de.nerden.grpc.examples.mutiny.generated.HelloServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: HelloService.proto")
public final class MutinyHelloServiceGrpc {
    private MutinyHelloServiceGrpc() {}

    public static MutinyHelloServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyHelloServiceStub(channel);
    }

    
    public static final class MutinyHelloServiceStub extends io.grpc.stub.AbstractStub<MutinyHelloServiceStub> {
        private HelloServiceGrpc.HelloServiceStub delegateStub;

        private MutinyHelloServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = HelloServiceGrpc.newStub(channel);
        }

        private MutinyHelloServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = HelloServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyHelloServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyHelloServiceStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<de.nerden.grpc.examples.mutiny.generated.HelloResponse> hello(de.nerden.grpc.examples.mutiny.generated.HelloRequest request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::hello);
        }

    }

    
    public static abstract class HelloServiceImplBase implements io.grpc.BindableService {


        
        public io.smallrye.mutiny.Uni<de.nerden.grpc.examples.mutiny.generated.HelloResponse> hello(de.nerden.grpc.examples.mutiny.generated.HelloRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            de.nerden.grpc.examples.mutiny.generated.HelloServiceGrpc.getHelloMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            de.nerden.grpc.examples.mutiny.generated.HelloRequest,
                                            de.nerden.grpc.examples.mutiny.generated.HelloResponse>(
                                            this, METHODID_HELLO)))
                    .build();
        }
    }

    private static final int METHODID_HELLO = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final HelloServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_HELLO:
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((de.nerden.grpc.examples.mutiny.generated.HelloRequest) request,
                            (io.grpc.stub.StreamObserver<de.nerden.grpc.examples.mutiny.generated.HelloResponse>) responseObserver,
                            serviceImpl::hello);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}