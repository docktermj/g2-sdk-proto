// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2engine.proto

package com.senzing.g2.engine.grpc.G2Engine;

/**
 * Protobuf type {@code g2engine.WhyRecordsRequest}
 */
public final class WhyRecordsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:g2engine.WhyRecordsRequest)
    WhyRecordsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WhyRecordsRequest.newBuilder() to construct.
  private WhyRecordsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WhyRecordsRequest() {
    dataSourceCode1_ = "";
    recordID1_ = "";
    dataSourceCode2_ = "";
    recordID2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WhyRecordsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WhyRecordsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            dataSourceCode1_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            recordID1_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dataSourceCode2_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            recordID2_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyRecordsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyRecordsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest.class, com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest.Builder.class);
  }

  public static final int DATASOURCECODE1_FIELD_NUMBER = 1;
  private volatile java.lang.Object dataSourceCode1_;
  /**
   * <code>string dataSourceCode1 = 1;</code>
   * @return The dataSourceCode1.
   */
  @java.lang.Override
  public java.lang.String getDataSourceCode1() {
    java.lang.Object ref = dataSourceCode1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataSourceCode1_ = s;
      return s;
    }
  }
  /**
   * <code>string dataSourceCode1 = 1;</code>
   * @return The bytes for dataSourceCode1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataSourceCode1Bytes() {
    java.lang.Object ref = dataSourceCode1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataSourceCode1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECORDID1_FIELD_NUMBER = 2;
  private volatile java.lang.Object recordID1_;
  /**
   * <code>string recordID1 = 2;</code>
   * @return The recordID1.
   */
  @java.lang.Override
  public java.lang.String getRecordID1() {
    java.lang.Object ref = recordID1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recordID1_ = s;
      return s;
    }
  }
  /**
   * <code>string recordID1 = 2;</code>
   * @return The bytes for recordID1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecordID1Bytes() {
    java.lang.Object ref = recordID1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recordID1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATASOURCECODE2_FIELD_NUMBER = 3;
  private volatile java.lang.Object dataSourceCode2_;
  /**
   * <code>string dataSourceCode2 = 3;</code>
   * @return The dataSourceCode2.
   */
  @java.lang.Override
  public java.lang.String getDataSourceCode2() {
    java.lang.Object ref = dataSourceCode2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataSourceCode2_ = s;
      return s;
    }
  }
  /**
   * <code>string dataSourceCode2 = 3;</code>
   * @return The bytes for dataSourceCode2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataSourceCode2Bytes() {
    java.lang.Object ref = dataSourceCode2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataSourceCode2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECORDID2_FIELD_NUMBER = 4;
  private volatile java.lang.Object recordID2_;
  /**
   * <code>string recordID2 = 4;</code>
   * @return The recordID2.
   */
  @java.lang.Override
  public java.lang.String getRecordID2() {
    java.lang.Object ref = recordID2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recordID2_ = s;
      return s;
    }
  }
  /**
   * <code>string recordID2 = 4;</code>
   * @return The bytes for recordID2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecordID2Bytes() {
    java.lang.Object ref = recordID2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recordID2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataSourceCode1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataSourceCode1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordID1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recordID1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataSourceCode2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dataSourceCode2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordID2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, recordID2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataSourceCode1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dataSourceCode1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordID1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recordID1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataSourceCode2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dataSourceCode2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordID2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, recordID2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest)) {
      return super.equals(obj);
    }
    com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest other = (com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest) obj;

    if (!getDataSourceCode1()
        .equals(other.getDataSourceCode1())) return false;
    if (!getRecordID1()
        .equals(other.getRecordID1())) return false;
    if (!getDataSourceCode2()
        .equals(other.getDataSourceCode2())) return false;
    if (!getRecordID2()
        .equals(other.getRecordID2())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATASOURCECODE1_FIELD_NUMBER;
    hash = (53 * hash) + getDataSourceCode1().hashCode();
    hash = (37 * hash) + RECORDID1_FIELD_NUMBER;
    hash = (53 * hash) + getRecordID1().hashCode();
    hash = (37 * hash) + DATASOURCECODE2_FIELD_NUMBER;
    hash = (53 * hash) + getDataSourceCode2().hashCode();
    hash = (37 * hash) + RECORDID2_FIELD_NUMBER;
    hash = (53 * hash) + getRecordID2().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code g2engine.WhyRecordsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:g2engine.WhyRecordsRequest)
      com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyRecordsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyRecordsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest.class, com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest.Builder.class);
    }

    // Construct using com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dataSourceCode1_ = "";

      recordID1_ = "";

      dataSourceCode2_ = "";

      recordID2_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyRecordsRequest_descriptor;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest getDefaultInstanceForType() {
      return com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest build() {
      com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest buildPartial() {
      com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest result = new com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest(this);
      result.dataSourceCode1_ = dataSourceCode1_;
      result.recordID1_ = recordID1_;
      result.dataSourceCode2_ = dataSourceCode2_;
      result.recordID2_ = recordID2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest) {
        return mergeFrom((com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest other) {
      if (other == com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest.getDefaultInstance()) return this;
      if (!other.getDataSourceCode1().isEmpty()) {
        dataSourceCode1_ = other.dataSourceCode1_;
        onChanged();
      }
      if (!other.getRecordID1().isEmpty()) {
        recordID1_ = other.recordID1_;
        onChanged();
      }
      if (!other.getDataSourceCode2().isEmpty()) {
        dataSourceCode2_ = other.dataSourceCode2_;
        onChanged();
      }
      if (!other.getRecordID2().isEmpty()) {
        recordID2_ = other.recordID2_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dataSourceCode1_ = "";
    /**
     * <code>string dataSourceCode1 = 1;</code>
     * @return The dataSourceCode1.
     */
    public java.lang.String getDataSourceCode1() {
      java.lang.Object ref = dataSourceCode1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataSourceCode1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataSourceCode1 = 1;</code>
     * @return The bytes for dataSourceCode1.
     */
    public com.google.protobuf.ByteString
        getDataSourceCode1Bytes() {
      java.lang.Object ref = dataSourceCode1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataSourceCode1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataSourceCode1 = 1;</code>
     * @param value The dataSourceCode1 to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceCode1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataSourceCode1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceCode1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSourceCode1() {
      
      dataSourceCode1_ = getDefaultInstance().getDataSourceCode1();
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceCode1 = 1;</code>
     * @param value The bytes for dataSourceCode1 to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceCode1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataSourceCode1_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object recordID1_ = "";
    /**
     * <code>string recordID1 = 2;</code>
     * @return The recordID1.
     */
    public java.lang.String getRecordID1() {
      java.lang.Object ref = recordID1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recordID1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recordID1 = 2;</code>
     * @return The bytes for recordID1.
     */
    public com.google.protobuf.ByteString
        getRecordID1Bytes() {
      java.lang.Object ref = recordID1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recordID1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recordID1 = 2;</code>
     * @param value The recordID1 to set.
     * @return This builder for chaining.
     */
    public Builder setRecordID1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordID1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string recordID1 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordID1() {
      
      recordID1_ = getDefaultInstance().getRecordID1();
      onChanged();
      return this;
    }
    /**
     * <code>string recordID1 = 2;</code>
     * @param value The bytes for recordID1 to set.
     * @return This builder for chaining.
     */
    public Builder setRecordID1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recordID1_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dataSourceCode2_ = "";
    /**
     * <code>string dataSourceCode2 = 3;</code>
     * @return The dataSourceCode2.
     */
    public java.lang.String getDataSourceCode2() {
      java.lang.Object ref = dataSourceCode2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataSourceCode2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataSourceCode2 = 3;</code>
     * @return The bytes for dataSourceCode2.
     */
    public com.google.protobuf.ByteString
        getDataSourceCode2Bytes() {
      java.lang.Object ref = dataSourceCode2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataSourceCode2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataSourceCode2 = 3;</code>
     * @param value The dataSourceCode2 to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceCode2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataSourceCode2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceCode2 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSourceCode2() {
      
      dataSourceCode2_ = getDefaultInstance().getDataSourceCode2();
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceCode2 = 3;</code>
     * @param value The bytes for dataSourceCode2 to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceCode2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataSourceCode2_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object recordID2_ = "";
    /**
     * <code>string recordID2 = 4;</code>
     * @return The recordID2.
     */
    public java.lang.String getRecordID2() {
      java.lang.Object ref = recordID2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recordID2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recordID2 = 4;</code>
     * @return The bytes for recordID2.
     */
    public com.google.protobuf.ByteString
        getRecordID2Bytes() {
      java.lang.Object ref = recordID2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recordID2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recordID2 = 4;</code>
     * @param value The recordID2 to set.
     * @return This builder for chaining.
     */
    public Builder setRecordID2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordID2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string recordID2 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordID2() {
      
      recordID2_ = getDefaultInstance().getRecordID2();
      onChanged();
      return this;
    }
    /**
     * <code>string recordID2 = 4;</code>
     * @param value The bytes for recordID2 to set.
     * @return This builder for chaining.
     */
    public Builder setRecordID2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recordID2_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:g2engine.WhyRecordsRequest)
  }

  // @@protoc_insertion_point(class_scope:g2engine.WhyRecordsRequest)
  private static final com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest();
  }

  public static com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WhyRecordsRequest>
      PARSER = new com.google.protobuf.AbstractParser<WhyRecordsRequest>() {
    @java.lang.Override
    public WhyRecordsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WhyRecordsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WhyRecordsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WhyRecordsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.senzing.g2.engine.grpc.G2Engine.WhyRecordsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

