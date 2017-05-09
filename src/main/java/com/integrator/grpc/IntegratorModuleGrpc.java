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
public class IntegratorModuleGrpc {

  private IntegratorModuleGrpc() {}

  public static final String SERVICE_NAME = "com.integrator.grpc.IntegratorModule";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ExecuteRequest,
      ExecuteResponse> METHOD_EXECUTE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.integrator.grpc.IntegratorModule", "Execute"),
          io.grpc.protobuf.ProtoUtils.marshaller(ExecuteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ExecuteResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntegratorModuleStub newStub(io.grpc.Channel channel) {
    return new IntegratorModuleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntegratorModuleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IntegratorModuleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IntegratorModuleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IntegratorModuleFutureStub(channel);
  }

  /**
   */
  public static abstract class IntegratorModuleImplBase implements io.grpc.BindableService {

    /**
     */
    public void execute(ExecuteRequest request,
        io.grpc.stub.StreamObserver<ExecuteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_EXECUTE,
            asyncUnaryCall(
              new MethodHandlers<
                ExecuteRequest,
                ExecuteResponse>(
                  this, METHODID_EXECUTE)))
          .build();
    }
  }

  /**
   */
  public static final class IntegratorModuleStub extends io.grpc.stub.AbstractStub<IntegratorModuleStub> {
    private IntegratorModuleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegratorModuleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected IntegratorModuleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegratorModuleStub(channel, callOptions);
    }

    /**
     */
    public void execute(ExecuteRequest request,
        io.grpc.stub.StreamObserver<ExecuteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXECUTE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IntegratorModuleBlockingStub extends io.grpc.stub.AbstractStub<IntegratorModuleBlockingStub> {
    private IntegratorModuleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegratorModuleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected IntegratorModuleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegratorModuleBlockingStub(channel, callOptions);
    }

    /**
     */
    public ExecuteResponse execute(ExecuteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXECUTE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IntegratorModuleFutureStub extends io.grpc.stub.AbstractStub<IntegratorModuleFutureStub> {
    private IntegratorModuleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegratorModuleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected IntegratorModuleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegratorModuleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ExecuteResponse> execute(
        ExecuteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXECUTE, getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntegratorModuleImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IntegratorModuleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE:
          serviceImpl.execute((ExecuteRequest) request,
              (io.grpc.stub.StreamObserver<ExecuteResponse>) responseObserver);
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
        METHOD_EXECUTE);
  }

}
