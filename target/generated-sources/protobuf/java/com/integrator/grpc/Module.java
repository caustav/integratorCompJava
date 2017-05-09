// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: integrator.proto

package com.integrator.grpc;

/**
 * Protobuf type {@code com.integrator.grpc.Module}
 */
public  final class Module extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.integrator.grpc.Module)
    ModuleOrBuilder {
  // Use Module.newBuilder() to construct.
  private Module(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Module() {
    moduleId_ = "";
    url_ = "";
    components_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Module(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            moduleId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            url_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              components_ = new java.util.ArrayList<com.integrator.grpc.Component>();
              mutable_bitField0_ |= 0x00000004;
            }
            components_.add(
                input.readMessage(com.integrator.grpc.Component.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        components_ = java.util.Collections.unmodifiableList(components_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.integrator.grpc.IntegratorOuterClass.internal_static_com_integrator_grpc_Module_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.integrator.grpc.IntegratorOuterClass.internal_static_com_integrator_grpc_Module_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.integrator.grpc.Module.class, com.integrator.grpc.Module.Builder.class);
  }

  private int bitField0_;
  public static final int MODULEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object moduleId_;
  /**
   * <code>string moduleId = 1;</code>
   */
  public java.lang.String getModuleId() {
    java.lang.Object ref = moduleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      moduleId_ = s;
      return s;
    }
  }
  /**
   * <code>string moduleId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getModuleIdBytes() {
    java.lang.Object ref = moduleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      moduleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object url_;
  /**
   * <code>string url = 2;</code>
   */
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <code>string url = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPONENTS_FIELD_NUMBER = 3;
  private java.util.List<com.integrator.grpc.Component> components_;
  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  public java.util.List<com.integrator.grpc.Component> getComponentsList() {
    return components_;
  }
  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  public java.util.List<? extends com.integrator.grpc.ComponentOrBuilder> 
      getComponentsOrBuilderList() {
    return components_;
  }
  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  public int getComponentsCount() {
    return components_.size();
  }
  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  public com.integrator.grpc.Component getComponents(int index) {
    return components_.get(index);
  }
  /**
   * <code>repeated .com.integrator.grpc.Component components = 3;</code>
   */
  public com.integrator.grpc.ComponentOrBuilder getComponentsOrBuilder(
      int index) {
    return components_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getModuleIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, moduleId_);
    }
    if (!getUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, url_);
    }
    for (int i = 0; i < components_.size(); i++) {
      output.writeMessage(3, components_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getModuleIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, moduleId_);
    }
    if (!getUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, url_);
    }
    for (int i = 0; i < components_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, components_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.integrator.grpc.Module)) {
      return super.equals(obj);
    }
    com.integrator.grpc.Module other = (com.integrator.grpc.Module) obj;

    boolean result = true;
    result = result && getModuleId()
        .equals(other.getModuleId());
    result = result && getUrl()
        .equals(other.getUrl());
    result = result && getComponentsList()
        .equals(other.getComponentsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MODULEID_FIELD_NUMBER;
    hash = (53 * hash) + getModuleId().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    if (getComponentsCount() > 0) {
      hash = (37 * hash) + COMPONENTS_FIELD_NUMBER;
      hash = (53 * hash) + getComponentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.integrator.grpc.Module parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.integrator.grpc.Module parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.integrator.grpc.Module parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.integrator.grpc.Module parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.integrator.grpc.Module parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.integrator.grpc.Module parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.integrator.grpc.Module parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.integrator.grpc.Module parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.integrator.grpc.Module parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.integrator.grpc.Module parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.integrator.grpc.Module prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.integrator.grpc.Module}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.integrator.grpc.Module)
      com.integrator.grpc.ModuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.integrator.grpc.IntegratorOuterClass.internal_static_com_integrator_grpc_Module_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.integrator.grpc.IntegratorOuterClass.internal_static_com_integrator_grpc_Module_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.integrator.grpc.Module.class, com.integrator.grpc.Module.Builder.class);
    }

    // Construct using com.integrator.grpc.Module.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getComponentsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      moduleId_ = "";

      url_ = "";

      if (componentsBuilder_ == null) {
        components_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        componentsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.integrator.grpc.IntegratorOuterClass.internal_static_com_integrator_grpc_Module_descriptor;
    }

    public com.integrator.grpc.Module getDefaultInstanceForType() {
      return com.integrator.grpc.Module.getDefaultInstance();
    }

    public com.integrator.grpc.Module build() {
      com.integrator.grpc.Module result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.integrator.grpc.Module buildPartial() {
      com.integrator.grpc.Module result = new com.integrator.grpc.Module(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.moduleId_ = moduleId_;
      result.url_ = url_;
      if (componentsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          components_ = java.util.Collections.unmodifiableList(components_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.components_ = components_;
      } else {
        result.components_ = componentsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.integrator.grpc.Module) {
        return mergeFrom((com.integrator.grpc.Module)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.integrator.grpc.Module other) {
      if (other == com.integrator.grpc.Module.getDefaultInstance()) return this;
      if (!other.getModuleId().isEmpty()) {
        moduleId_ = other.moduleId_;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (componentsBuilder_ == null) {
        if (!other.components_.isEmpty()) {
          if (components_.isEmpty()) {
            components_ = other.components_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureComponentsIsMutable();
            components_.addAll(other.components_);
          }
          onChanged();
        }
      } else {
        if (!other.components_.isEmpty()) {
          if (componentsBuilder_.isEmpty()) {
            componentsBuilder_.dispose();
            componentsBuilder_ = null;
            components_ = other.components_;
            bitField0_ = (bitField0_ & ~0x00000004);
            componentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getComponentsFieldBuilder() : null;
          } else {
            componentsBuilder_.addAllMessages(other.components_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.integrator.grpc.Module parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.integrator.grpc.Module) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object moduleId_ = "";
    /**
     * <code>string moduleId = 1;</code>
     */
    public java.lang.String getModuleId() {
      java.lang.Object ref = moduleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moduleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string moduleId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getModuleIdBytes() {
      java.lang.Object ref = moduleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moduleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string moduleId = 1;</code>
     */
    public Builder setModuleId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      moduleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string moduleId = 1;</code>
     */
    public Builder clearModuleId() {
      
      moduleId_ = getDefaultInstance().getModuleId();
      onChanged();
      return this;
    }
    /**
     * <code>string moduleId = 1;</code>
     */
    public Builder setModuleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      moduleId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <code>string url = 2;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string url = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string url = 2;</code>
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string url = 2;</code>
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string url = 2;</code>
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.integrator.grpc.Component> components_ =
      java.util.Collections.emptyList();
    private void ensureComponentsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        components_ = new java.util.ArrayList<com.integrator.grpc.Component>(components_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.integrator.grpc.Component, com.integrator.grpc.Component.Builder, com.integrator.grpc.ComponentOrBuilder> componentsBuilder_;

    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public java.util.List<com.integrator.grpc.Component> getComponentsList() {
      if (componentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(components_);
      } else {
        return componentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public int getComponentsCount() {
      if (componentsBuilder_ == null) {
        return components_.size();
      } else {
        return componentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public com.integrator.grpc.Component getComponents(int index) {
      if (componentsBuilder_ == null) {
        return components_.get(index);
      } else {
        return componentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public Builder setComponents(
        int index, com.integrator.grpc.Component value) {
      if (componentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureComponentsIsMutable();
        components_.set(index, value);
        onChanged();
      } else {
        componentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public Builder setComponents(
        int index, com.integrator.grpc.Component.Builder builderForValue) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        components_.set(index, builderForValue.build());
        onChanged();
      } else {
        componentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public Builder addComponents(com.integrator.grpc.Component value) {
      if (componentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureComponentsIsMutable();
        components_.add(value);
        onChanged();
      } else {
        componentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public Builder addComponents(
        int index, com.integrator.grpc.Component value) {
      if (componentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureComponentsIsMutable();
        components_.add(index, value);
        onChanged();
      } else {
        componentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public Builder addComponents(
        com.integrator.grpc.Component.Builder builderForValue) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        components_.add(builderForValue.build());
        onChanged();
      } else {
        componentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public Builder addComponents(
        int index, com.integrator.grpc.Component.Builder builderForValue) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        components_.add(index, builderForValue.build());
        onChanged();
      } else {
        componentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public Builder addAllComponents(
        java.lang.Iterable<? extends com.integrator.grpc.Component> values) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, components_);
        onChanged();
      } else {
        componentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public Builder clearComponents() {
      if (componentsBuilder_ == null) {
        components_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        componentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public Builder removeComponents(int index) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        components_.remove(index);
        onChanged();
      } else {
        componentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public com.integrator.grpc.Component.Builder getComponentsBuilder(
        int index) {
      return getComponentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public com.integrator.grpc.ComponentOrBuilder getComponentsOrBuilder(
        int index) {
      if (componentsBuilder_ == null) {
        return components_.get(index);  } else {
        return componentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public java.util.List<? extends com.integrator.grpc.ComponentOrBuilder> 
         getComponentsOrBuilderList() {
      if (componentsBuilder_ != null) {
        return componentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(components_);
      }
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public com.integrator.grpc.Component.Builder addComponentsBuilder() {
      return getComponentsFieldBuilder().addBuilder(
          com.integrator.grpc.Component.getDefaultInstance());
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public com.integrator.grpc.Component.Builder addComponentsBuilder(
        int index) {
      return getComponentsFieldBuilder().addBuilder(
          index, com.integrator.grpc.Component.getDefaultInstance());
    }
    /**
     * <code>repeated .com.integrator.grpc.Component components = 3;</code>
     */
    public java.util.List<com.integrator.grpc.Component.Builder> 
         getComponentsBuilderList() {
      return getComponentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.integrator.grpc.Component, com.integrator.grpc.Component.Builder, com.integrator.grpc.ComponentOrBuilder> 
        getComponentsFieldBuilder() {
      if (componentsBuilder_ == null) {
        componentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.integrator.grpc.Component, com.integrator.grpc.Component.Builder, com.integrator.grpc.ComponentOrBuilder>(
                components_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        components_ = null;
      }
      return componentsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.integrator.grpc.Module)
  }

  // @@protoc_insertion_point(class_scope:com.integrator.grpc.Module)
  private static final com.integrator.grpc.Module DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.integrator.grpc.Module();
  }

  public static com.integrator.grpc.Module getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Module>
      PARSER = new com.google.protobuf.AbstractParser<Module>() {
    public Module parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Module(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Module> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Module> getParserForType() {
    return PARSER;
  }

  public com.integrator.grpc.Module getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

