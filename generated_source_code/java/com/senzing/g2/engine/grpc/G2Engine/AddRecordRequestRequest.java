// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2engine.proto

package com.senzing.g2.engine.grpc.G2Engine;

/**
 * Protobuf type {@code g2engine.AddRecordRequestRequest}
 */
public final class AddRecordRequestRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:g2engine.AddRecordRequestRequest)
    AddRecordRequestRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddRecordRequestRequest.newBuilder() to construct.
  private AddRecordRequestRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddRecordRequestRequest() {
    dataSourceCode_ = "";
    recordID_ = "";
    jsonData_ = "";
    loadID_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddRecordRequestRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddRecordRequestRequest(
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

            dataSourceCode_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            recordID_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            jsonData_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            loadID_ = s;
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
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_AddRecordRequestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_AddRecordRequestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest.class, com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest.Builder.class);
  }

  public static final int DATASOURCECODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object dataSourceCode_;
  /**
   * <code>string dataSourceCode = 1;</code>
   * @return The dataSourceCode.
   */
  @java.lang.Override
  public java.lang.String getDataSourceCode() {
    java.lang.Object ref = dataSourceCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataSourceCode_ = s;
      return s;
    }
  }
  /**
   * <code>string dataSourceCode = 1;</code>
   * @return The bytes for dataSourceCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataSourceCodeBytes() {
    java.lang.Object ref = dataSourceCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataSourceCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECORDID_FIELD_NUMBER = 2;
  private volatile java.lang.Object recordID_;
  /**
   * <code>string recordID = 2;</code>
   * @return The recordID.
   */
  @java.lang.Override
  public java.lang.String getRecordID() {
    java.lang.Object ref = recordID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recordID_ = s;
      return s;
    }
  }
  /**
   * <code>string recordID = 2;</code>
   * @return The bytes for recordID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecordIDBytes() {
    java.lang.Object ref = recordID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recordID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JSONDATA_FIELD_NUMBER = 3;
  private volatile java.lang.Object jsonData_;
  /**
   * <code>string jsonData = 3;</code>
   * @return The jsonData.
   */
  @java.lang.Override
  public java.lang.String getJsonData() {
    java.lang.Object ref = jsonData_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jsonData_ = s;
      return s;
    }
  }
  /**
   * <code>string jsonData = 3;</code>
   * @return The bytes for jsonData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJsonDataBytes() {
    java.lang.Object ref = jsonData_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jsonData_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOADID_FIELD_NUMBER = 4;
  private volatile java.lang.Object loadID_;
  /**
   * <code>string loadID = 4;</code>
   * @return The loadID.
   */
  @java.lang.Override
  public java.lang.String getLoadID() {
    java.lang.Object ref = loadID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      loadID_ = s;
      return s;
    }
  }
  /**
   * <code>string loadID = 4;</code>
   * @return The bytes for loadID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLoadIDBytes() {
    java.lang.Object ref = loadID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      loadID_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataSourceCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataSourceCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordID_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recordID_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jsonData_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jsonData_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(loadID_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, loadID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataSourceCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dataSourceCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordID_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recordID_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jsonData_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jsonData_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(loadID_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, loadID_);
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
    if (!(obj instanceof com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest)) {
      return super.equals(obj);
    }
    com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest other = (com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest) obj;

    if (!getDataSourceCode()
        .equals(other.getDataSourceCode())) return false;
    if (!getRecordID()
        .equals(other.getRecordID())) return false;
    if (!getJsonData()
        .equals(other.getJsonData())) return false;
    if (!getLoadID()
        .equals(other.getLoadID())) return false;
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
    hash = (37 * hash) + DATASOURCECODE_FIELD_NUMBER;
    hash = (53 * hash) + getDataSourceCode().hashCode();
    hash = (37 * hash) + RECORDID_FIELD_NUMBER;
    hash = (53 * hash) + getRecordID().hashCode();
    hash = (37 * hash) + JSONDATA_FIELD_NUMBER;
    hash = (53 * hash) + getJsonData().hashCode();
    hash = (37 * hash) + LOADID_FIELD_NUMBER;
    hash = (53 * hash) + getLoadID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parseFrom(
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
  public static Builder newBuilder(com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest prototype) {
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
   * Protobuf type {@code g2engine.AddRecordRequestRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:g2engine.AddRecordRequestRequest)
      com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_AddRecordRequestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_AddRecordRequestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest.class, com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest.Builder.class);
    }

    // Construct using com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest.newBuilder()
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
      dataSourceCode_ = "";

      recordID_ = "";

      jsonData_ = "";

      loadID_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_AddRecordRequestRequest_descriptor;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest getDefaultInstanceForType() {
      return com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest build() {
      com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest buildPartial() {
      com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest result = new com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest(this);
      result.dataSourceCode_ = dataSourceCode_;
      result.recordID_ = recordID_;
      result.jsonData_ = jsonData_;
      result.loadID_ = loadID_;
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
      if (other instanceof com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest) {
        return mergeFrom((com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest other) {
      if (other == com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest.getDefaultInstance()) return this;
      if (!other.getDataSourceCode().isEmpty()) {
        dataSourceCode_ = other.dataSourceCode_;
        onChanged();
      }
      if (!other.getRecordID().isEmpty()) {
        recordID_ = other.recordID_;
        onChanged();
      }
      if (!other.getJsonData().isEmpty()) {
        jsonData_ = other.jsonData_;
        onChanged();
      }
      if (!other.getLoadID().isEmpty()) {
        loadID_ = other.loadID_;
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
      com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dataSourceCode_ = "";
    /**
     * <code>string dataSourceCode = 1;</code>
     * @return The dataSourceCode.
     */
    public java.lang.String getDataSourceCode() {
      java.lang.Object ref = dataSourceCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataSourceCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataSourceCode = 1;</code>
     * @return The bytes for dataSourceCode.
     */
    public com.google.protobuf.ByteString
        getDataSourceCodeBytes() {
      java.lang.Object ref = dataSourceCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataSourceCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataSourceCode = 1;</code>
     * @param value The dataSourceCode to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataSourceCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceCode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSourceCode() {
      
      dataSourceCode_ = getDefaultInstance().getDataSourceCode();
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceCode = 1;</code>
     * @param value The bytes for dataSourceCode to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataSourceCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object recordID_ = "";
    /**
     * <code>string recordID = 2;</code>
     * @return The recordID.
     */
    public java.lang.String getRecordID() {
      java.lang.Object ref = recordID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recordID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recordID = 2;</code>
     * @return The bytes for recordID.
     */
    public com.google.protobuf.ByteString
        getRecordIDBytes() {
      java.lang.Object ref = recordID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recordID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recordID = 2;</code>
     * @param value The recordID to set.
     * @return This builder for chaining.
     */
    public Builder setRecordID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string recordID = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordID() {
      
      recordID_ = getDefaultInstance().getRecordID();
      onChanged();
      return this;
    }
    /**
     * <code>string recordID = 2;</code>
     * @param value The bytes for recordID to set.
     * @return This builder for chaining.
     */
    public Builder setRecordIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recordID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jsonData_ = "";
    /**
     * <code>string jsonData = 3;</code>
     * @return The jsonData.
     */
    public java.lang.String getJsonData() {
      java.lang.Object ref = jsonData_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jsonData_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jsonData = 3;</code>
     * @return The bytes for jsonData.
     */
    public com.google.protobuf.ByteString
        getJsonDataBytes() {
      java.lang.Object ref = jsonData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jsonData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jsonData = 3;</code>
     * @param value The jsonData to set.
     * @return This builder for chaining.
     */
    public Builder setJsonData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jsonData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jsonData = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJsonData() {
      
      jsonData_ = getDefaultInstance().getJsonData();
      onChanged();
      return this;
    }
    /**
     * <code>string jsonData = 3;</code>
     * @param value The bytes for jsonData to set.
     * @return This builder for chaining.
     */
    public Builder setJsonDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jsonData_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object loadID_ = "";
    /**
     * <code>string loadID = 4;</code>
     * @return The loadID.
     */
    public java.lang.String getLoadID() {
      java.lang.Object ref = loadID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        loadID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string loadID = 4;</code>
     * @return The bytes for loadID.
     */
    public com.google.protobuf.ByteString
        getLoadIDBytes() {
      java.lang.Object ref = loadID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        loadID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string loadID = 4;</code>
     * @param value The loadID to set.
     * @return This builder for chaining.
     */
    public Builder setLoadID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      loadID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string loadID = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoadID() {
      
      loadID_ = getDefaultInstance().getLoadID();
      onChanged();
      return this;
    }
    /**
     * <code>string loadID = 4;</code>
     * @param value The bytes for loadID to set.
     * @return This builder for chaining.
     */
    public Builder setLoadIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      loadID_ = value;
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


    // @@protoc_insertion_point(builder_scope:g2engine.AddRecordRequestRequest)
  }

  // @@protoc_insertion_point(class_scope:g2engine.AddRecordRequestRequest)
  private static final com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest();
  }

  public static com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddRecordRequestRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddRecordRequestRequest>() {
    @java.lang.Override
    public AddRecordRequestRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddRecordRequestRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddRecordRequestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddRecordRequestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.senzing.g2.engine.grpc.G2Engine.AddRecordRequestRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

