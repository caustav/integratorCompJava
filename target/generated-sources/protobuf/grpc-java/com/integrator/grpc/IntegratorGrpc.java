package com.integrator.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: integrator.proto")
public final class IntegratorGrpc {

  private IntegratorGrpc() {}

  public static final String SERVICE_NAME = "com.integrator.grpc.Integrator";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.integrator.grpc.Module,
      com.integrator.grpc.RegisterResponse> METHOD_REGISTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.integrator.grpc.Integrator", "Register"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.integrator.grpc.Module.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.integrator.grpc.RegisterResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.integrator.grpc.StartRequest,
      com.integrator.grpc.StartResponse> METHOD_START =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.integrator.grpc.Integrator", "Start"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.integrator.grpc.StartRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.integrator.grpc.StartResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.integrator.grpc.SaveChainRequest,
      com.integrator.grpc.SaveChainResponse> METHOD_SAVE_CHAIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.integrator.grpc.Integrator", "SaveChain"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.integrator.grpc.SaveChainRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.integrator.grpc.SaveChainResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntegratorStub newStub(io.grpc.Channel channel) {
    return new IntegratorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntegratorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IntegratorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IntegratorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IntegratorFutureStub(channel);
  }

  /**
   */
  public static abstract class IntegratorImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.integrator.grpc.Module request,
        io.grpc.stub.StreamObserver<com.integrator.grpc.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER, responseObserver);
    }

    /**
     */
    public void start(com.integrator.grpc.StartRequest request,
        io.grpc.stub.StreamObserver<com.integrator.grpc.StartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_START, responseObserver);
    }

    /**
     */
    public void saveChain(com.integrator.grpc.SaveChainRequest request,
        io.grpc.stub.StreamObserver<com.integrator.grpc.SaveChainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_CHAIN, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.integrator.grpc.Module,
                com.integrator.grpc.RegisterResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            METHOD_START,
            asyncUnaryCall(
              new MethodHandlers<
                com.integrator.grpc.StartRequest,
                com.integrator.grpc.StartResponse>(
                  this, METHODID_START)))
          .addMethod(
            METHOD_SAVE_CHAIN,
            asyncUnaryCall(
              new MethodHandlers<
                com.integrator.grpc.SaveChainRequest,
                com.integrator.grpc.SaveChainResponse>(
                  this, METHODID_SAVE_CHAIN)))
          .build();
    }
  }

  /**
   */
  public static final class IntegratorStub extends io.grpc.stub.AbstractStub<IntegratorStub> {
    private IntegratorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegratorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegratorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegratorStub(channel, callOptions);
    }

    /**
     */
    public void register(com.integrator.grpc.Module request,
        io.grpc.stub.StreamObserver<com.integrator.grpc.RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void start(com.integrator.grpc.StartRequest request,
        io.grpc.stub.StreamObserver<com.integrator.grpc.StartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_START, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveChain(com.integrator.grpc.SaveChainRequest request,
        io.grpc.stub.StreamObserver<com.integrator.grpc.SaveChainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_CHAIN, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IntegratorBlockingStub extends io.grpc.stub.AbstractStub<IntegratorBlockingStub> {
    private IntegratorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegratorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegratorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegratorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.integrator.grpc.RegisterResponse register(com.integrator.grpc.Module request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER, getCallOptions(), request);
    }

    /**
     */
    public com.integrator.grpc.StartResponse start(com.integrator.grpc.StartRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_START, getCallOptions(), request);
    }

    /**
     */
    public com.integrator.grpc.SaveChainResponse saveChain(com.integrator.grpc.SaveChainRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_CHAIN, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IntegratorFutureStub extends io.grpc.stub.AbstractStub<IntegratorFutureStub> {
    private IntegratorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegratorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegratorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegratorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.integrator.grpc.RegisterResponse> register(
        com.integrator.grpc.Module request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.integrator.grpc.StartResponse> start(
        com.integrator.grpc.StartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_START, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.integrator.grpc.SaveChainResponse> saveChain(
        com.integrator.grpc.SaveChainRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_CHAIN, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_START = 1;
  private static final int METHODID_SAVE_CHAIN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntegratorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntegratorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.integrator.grpc.Module) request,
              (io.grpc.stub.StreamObserver<com.integrator.grpc.RegisterResponse>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((com.integrator.grpc.StartRequest) request,
              (io.grpc.stub.StreamObserver<com.integrator.grpc.StartResponse>) responseObserver);
          break;
        case METHODID_SAVE_CHAIN:
          serviceImpl.saveChain((com.integrator.grpc.SaveChainRequest) request,
              (io.grpc.stub.StreamObserver<com.integrator.grpc.SaveChainResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class IntegratorDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.integrator.grpc.IntegratorOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IntegratorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntegratorDescriptorSupplier())
              .addMethod(METHOD_REGISTER)
              .addMethod(METHOD_START)
              .addMethod(METHOD_SAVE_CHAIN)
              .build();
        }
      }
    }
    return result;
  }
}
