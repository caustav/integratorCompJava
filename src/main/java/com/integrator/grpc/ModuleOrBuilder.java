// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: integrator.proto

package com.integrator.grpc;

public interface ModuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.integrator.grpc.Module)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string moduleId = 1;</code>
   */
  String getModuleId();
  /**
   * <code>optional string moduleId = 1;</code>
   */
  com.google.protobuf.ByteString
      getModuleIdBytes();

  /**
   * <code>optional string url = 2;</code>
   */
  String getUrl();
  /**
   * <code>optional string url = 2;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  java.util.List<Component>
      getComponentsList();
  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  Component getComponents(int index);
  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  int getComponentsCount();
  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  java.util.List<? extends ComponentOrBuilder>
      getComponentsOrBuilderList();
  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  ComponentOrBuilder getComponentsOrBuilder(
          int index);
}
