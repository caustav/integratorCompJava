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
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: integrator.proto")
public class IntegratorGrpc {

  private IntegratorGrpc() {}

  public static final String SERVICE_NAME = "com.integrator.grpc.Integrator";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<Module,
      RegisterResponse> METHOD_REGISTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.integrator.grpc.Integrator", "Register"),
          io.grpc.protobuf.ProtoUtils.marshaller(Module.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(RegisterResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<StartRequest,
      StartResponse> METHOD_START =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.integrator.grpc.Integrator", "Start"),
          io.grpc.protobuf.ProtoUtils.marshaller(StartRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(StartResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<SaveChainRequest,
      SaveChainResponse> METHOD_SAVE_CHAIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.integrator.grpc.Integrator", "SaveChain"),
          io.grpc.protobuf.ProtoUtils.marshaller(SaveChainRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(SaveChainResponse.getDefaultInstance()));

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
    public void register(Module request,
        io.grpc.stub.StreamObserver<RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER, responseObserver);
    }

    /**
     */
    public void start(StartRequest request,
        io.grpc.stub.StreamObserver<StartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_START, responseObserver);
    }

    /**
     */
    public void saveChain(SaveChainRequest request,
        io.grpc.stub.StreamObserver<SaveChainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_CHAIN, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER,
            asyncUnaryCall(
              new MethodHandlers<
                Module,
                RegisterResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            METHOD_START,
            asyncUnaryCall(
              new MethodHandlers<
                StartRequest,
                StartResponse>(
                  this, METHODID_START)))
          .addMethod(
            METHOD_SAVE_CHAIN,
            asyncUnaryCall(
              new MethodHandlers<
                SaveChainRequest,
                SaveChainResponse>(
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

    @Override
    protected IntegratorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegratorStub(channel, callOptions);
    }

    /**
     */
    public void register(Module request,
        io.grpc.stub.StreamObserver<RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void start(StartRequest request,
        io.grpc.stub.StreamObserver<StartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_START, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveChain(SaveChainRequest request,
        io.grpc.stub.StreamObserver<SaveChainResponse> responseObserver) {
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

    @Override
    protected IntegratorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegratorBlockingStub(channel, callOptions);
    }

    /**
     */
    public RegisterResponse register(Module request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER, getCallOptions(), request);
    }

    /**
     */
    public StartResponse start(StartRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_START, getCallOptions(), request);
    }

    /**
     */
    public SaveChainResponse saveChain(SaveChainRequest request) {
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

    @Override
    protected IntegratorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegratorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<RegisterResponse> register(
        Module request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StartResponse> start(
        StartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_START, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SaveChainResponse> saveChain(
        SaveChainRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_CHAIN, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_START = 1;
  private static final int METHODID_SAVE_CHAIN = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntegratorImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IntegratorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((Module) request,
              (io.grpc.stub.StreamObserver<RegisterResponse>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((StartRequest) request,
              (io.grpc.stub.StreamObserver<StartResponse>) responseObserver);
          break;
        case METHODID_SAVE_CHAIN:
          serviceImpl.saveChain((SaveChainRequest) request,
              (io.grpc.stub.StreamObserver<SaveChainResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_REGISTER,
        METHOD_START,
        METHOD_SAVE_CHAIN);
  }

}
