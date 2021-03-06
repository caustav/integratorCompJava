// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: integrator.proto

package com.integrator.grpc;

/**
 * Protobuf type {@code com.integrator.grpc.Component}
 */
public  final class Component extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.integrator.grpc.Component)
    ComponentOrBuilder {
  // Use Component.newBuilder() to construct.
  private Component(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Component() {
    name_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Component(
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
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              paramsInput_ = com.google.protobuf.MapField.newMapField(
                  ParamsInputDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<String, DataType>
            paramsInput = input.readMessage(
                ParamsInputDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            paramsInput_.getMutableMap().put(paramsInput.getKey(), paramsInput.getValue());
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              paramsOutput_ = com.google.protobuf.MapField.newMapField(
                  ParamsOutputDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<String, DataType>
            paramsOutput = input.readMessage(
                ParamsOutputDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            paramsOutput_.getMutableMap().put(paramsOutput.getKey(), paramsOutput.getValue());
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return IntegratorOuterClass.internal_static_com_integrator_grpc_Component_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetParamsInput();
      case 3:
        return internalGetParamsOutput();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return IntegratorOuterClass.internal_static_com_integrator_grpc_Component_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Component.class, Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile Object name_;
  /**
   * <code>optional string name = 1;</code>
   */
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMSINPUT_FIELD_NUMBER = 2;
  private static final class ParamsInputDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, DataType> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, DataType>newDefaultInstance(
                IntegratorOuterClass.internal_static_com_integrator_grpc_Component_ParamsInputEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                DataType.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      String, DataType> paramsInput_;
  private com.google.protobuf.MapField<String, DataType>
  internalGetParamsInput() {
    if (paramsInput_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ParamsInputDefaultEntryHolder.defaultEntry);
    }
    return paramsInput_;
  }

  public int getParamsInputCount() {
    return internalGetParamsInput().getMap().size();
  }
  /**
   * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
   */

  public boolean containsParamsInput(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    return internalGetParamsInput().getMap().containsKey(key);
  }
  /**
   * Use {@link #getParamsInputMap()} instead.
   */
  @Deprecated
  public java.util.Map<String, DataType> getParamsInput() {
    return getParamsInputMap();
  }
  /**
   * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
   */

  public java.util.Map<String, DataType> getParamsInputMap() {
    return internalGetParamsInput().getMap();
  }
  /**
   * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
   */

  public DataType getParamsInputOrDefault(
      String key,
      DataType defaultValue) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, DataType> map =
        internalGetParamsInput().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
   */

  public DataType getParamsInputOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, DataType> map =
        internalGetParamsInput().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int PARAMSOUTPUT_FIELD_NUMBER = 3;
  private static final class ParamsOutputDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, DataType> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, DataType>newDefaultInstance(
                IntegratorOuterClass.internal_static_com_integrator_grpc_Component_ParamsOutputEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                DataType.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      String, DataType> paramsOutput_;
  private com.google.protobuf.MapField<String, DataType>
  internalGetParamsOutput() {
    if (paramsOutput_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ParamsOutputDefaultEntryHolder.defaultEntry);
    }
    return paramsOutput_;
  }

  public int getParamsOutputCount() {
    return internalGetParamsOutput().getMap().size();
  }
  /**
   * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
   */

  public boolean containsParamsOutput(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    return internalGetParamsOutput().getMap().containsKey(key);
  }
  /**
   * Use {@link #getParamsOutputMap()} instead.
   */
  @Deprecated
  public java.util.Map<String, DataType> getParamsOutput() {
    return getParamsOutputMap();
  }
  /**
   * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
   */

  public java.util.Map<String, DataType> getParamsOutputMap() {
    return internalGetParamsOutput().getMap();
  }
  /**
   * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
   */

  public DataType getParamsOutputOrDefault(
      String key,
      DataType defaultValue) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, DataType> map =
        internalGetParamsOutput().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
   */

  public DataType getParamsOutputOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, DataType> map =
        internalGetParamsOutput().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (java.util.Map.Entry<String, DataType> entry
         : internalGetParamsInput().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, DataType>
      paramsInput = ParamsInputDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      output.writeMessage(2, paramsInput);
    }
    for (java.util.Map.Entry<String, DataType> entry
         : internalGetParamsOutput().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, DataType>
      paramsOutput = ParamsOutputDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      output.writeMessage(3, paramsOutput);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<String, DataType> entry
         : internalGetParamsInput().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, DataType>
      paramsInput = ParamsInputDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, paramsInput);
    }
    for (java.util.Map.Entry<String, DataType> entry
         : internalGetParamsOutput().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, DataType>
      paramsOutput = ParamsOutputDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, paramsOutput);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Component)) {
      return super.equals(obj);
    }
    Component other = (Component) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && internalGetParamsInput().equals(
        other.internalGetParamsInput());
    result = result && internalGetParamsOutput().equals(
        other.internalGetParamsOutput());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetParamsInput().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMSINPUT_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParamsInput().hashCode();
    }
    if (!internalGetParamsOutput().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMSOUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParamsOutput().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Component parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Component parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Component parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Component parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Component parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Component parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Component parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Component parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Component parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Component parseFrom(
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
  public static Builder newBuilder(Component prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.integrator.grpc.Component}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.integrator.grpc.Component)
      ComponentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return IntegratorOuterClass.internal_static_com_integrator_grpc_Component_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetParamsInput();
        case 3:
          return internalGetParamsOutput();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableParamsInput();
        case 3:
          return internalGetMutableParamsOutput();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return IntegratorOuterClass.internal_static_com_integrator_grpc_Component_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Component.class, Builder.class);
    }

    // Construct using com.integrator.grpc.Component.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      internalGetMutableParamsInput().clear();
      internalGetMutableParamsOutput().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return IntegratorOuterClass.internal_static_com_integrator_grpc_Component_descriptor;
    }

    public Component getDefaultInstanceForType() {
      return Component.getDefaultInstance();
    }

    public Component build() {
      Component result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Component buildPartial() {
      Component result = new Component(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.paramsInput_ = internalGetParamsInput();
      result.paramsInput_.makeImmutable();
      result.paramsOutput_ = internalGetParamsOutput();
      result.paramsOutput_.makeImmutable();
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
      if (other instanceof Component) {
        return mergeFrom((Component)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Component other) {
      if (other == Component.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      internalGetMutableParamsInput().mergeFrom(
          other.internalGetParamsInput());
      internalGetMutableParamsOutput().mergeFrom(
          other.internalGetParamsOutput());
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
      Component parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Component) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        String, DataType> paramsInput_;
    private com.google.protobuf.MapField<String, DataType>
    internalGetParamsInput() {
      if (paramsInput_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParamsInputDefaultEntryHolder.defaultEntry);
      }
      return paramsInput_;
    }
    private com.google.protobuf.MapField<String, DataType>
    internalGetMutableParamsInput() {
      onChanged();;
      if (paramsInput_ == null) {
        paramsInput_ = com.google.protobuf.MapField.newMapField(
            ParamsInputDefaultEntryHolder.defaultEntry);
      }
      if (!paramsInput_.isMutable()) {
        paramsInput_ = paramsInput_.copy();
      }
      return paramsInput_;
    }

    public int getParamsInputCount() {
      return internalGetParamsInput().getMap().size();
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
     */

    public boolean containsParamsInput(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetParamsInput().getMap().containsKey(key);
    }
    /**
     * Use {@link #getParamsInputMap()} instead.
     */
    @Deprecated
    public java.util.Map<String, DataType> getParamsInput() {
      return getParamsInputMap();
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
     */

    public java.util.Map<String, DataType> getParamsInputMap() {
      return internalGetParamsInput().getMap();
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
     */

    public DataType getParamsInputOrDefault(
        String key,
        DataType defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, DataType> map =
          internalGetParamsInput().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
     */

    public DataType getParamsInputOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, DataType> map =
          internalGetParamsInput().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParamsInput() {
      getMutableParamsInput().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
     */

    public Builder removeParamsInput(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      getMutableParamsInput().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, DataType>
    getMutableParamsInput() {
      return internalGetMutableParamsInput().getMutableMap();
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
     */
    public Builder putParamsInput(
        String key,
        DataType value) {
      if (key == null) { throw new NullPointerException(); }
      if (value == null) { throw new NullPointerException(); }
      getMutableParamsInput().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsInput = 2;</code>
     */

    public Builder putAllParamsInput(
        java.util.Map<String, DataType> values) {
      getMutableParamsInput().putAll(values);
      return this;
    }

    private com.google.protobuf.MapField<
        String, DataType> paramsOutput_;
    private com.google.protobuf.MapField<String, DataType>
    internalGetParamsOutput() {
      if (paramsOutput_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParamsOutputDefaultEntryHolder.defaultEntry);
      }
      return paramsOutput_;
    }
    private com.google.protobuf.MapField<String, DataType>
    internalGetMutableParamsOutput() {
      onChanged();;
      if (paramsOutput_ == null) {
        paramsOutput_ = com.google.protobuf.MapField.newMapField(
            ParamsOutputDefaultEntryHolder.defaultEntry);
      }
      if (!paramsOutput_.isMutable()) {
        paramsOutput_ = paramsOutput_.copy();
      }
      return paramsOutput_;
    }

    public int getParamsOutputCount() {
      return internalGetParamsOutput().getMap().size();
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
     */

    public boolean containsParamsOutput(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetParamsOutput().getMap().containsKey(key);
    }
    /**
     * Use {@link #getParamsOutputMap()} instead.
     */
    @Deprecated
    public java.util.Map<String, DataType> getParamsOutput() {
      return getParamsOutputMap();
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
     */

    public java.util.Map<String, DataType> getParamsOutputMap() {
      return internalGetParamsOutput().getMap();
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
     */

    public DataType getParamsOutputOrDefault(
        String key,
        DataType defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, DataType> map =
          internalGetParamsOutput().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
     */

    public DataType getParamsOutputOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, DataType> map =
          internalGetParamsOutput().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParamsOutput() {
      getMutableParamsOutput().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
     */

    public Builder removeParamsOutput(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      getMutableParamsOutput().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, DataType>
    getMutableParamsOutput() {
      return internalGetMutableParamsOutput().getMutableMap();
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
     */
    public Builder putParamsOutput(
        String key,
        DataType value) {
      if (key == null) { throw new NullPointerException(); }
      if (value == null) { throw new NullPointerException(); }
      getMutableParamsOutput().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .com.integrator.grpc.DataType&gt; paramsOutput = 3;</code>
     */

    public Builder putAllParamsOutput(
        java.util.Map<String, DataType> values) {
      getMutableParamsOutput().putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.integrator.grpc.Component)
  }

  // @@protoc_insertion_point(class_scope:com.integrator.grpc.Component)
  private static final Component DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Component();
  }

  public static Component getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Component>
      PARSER = new com.google.protobuf.AbstractParser<Component>() {
    public Component parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Component(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Component> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Component> getParserForType() {
    return PARSER;
  }

  public Component getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

