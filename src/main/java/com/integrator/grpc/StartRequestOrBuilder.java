// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: integrator.proto

package com.integrator.grpc;

public interface StartRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.integrator.grpc.StartRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string chainId = 1;</code>
   */
  String getChainId();
  /**
   * <code>optional string chainId = 1;</code>
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>optional .com.integrator.grpc.Component startComponent = 2;</code>
   */
  boolean hasStartComponent();
  /**
   * <code>optional .com.integrator.grpc.Component startComponent = 2;</code>
   */
  Component getStartComponent();
  /**
   * <code>optional .com.integrator.grpc.Component startComponent = 2;</code>
   */
  ComponentOrBuilder getStartComponentOrBuilder();
}