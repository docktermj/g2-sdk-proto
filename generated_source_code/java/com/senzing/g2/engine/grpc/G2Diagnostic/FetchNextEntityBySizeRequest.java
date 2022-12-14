// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2diagnostic.proto

package com.senzing.g2.engine.grpc.G2Diagnostic;

/**
 * Protobuf type {@code g2diagnostic.FetchNextEntityBySizeRequest}
 */
public final class FetchNextEntityBySizeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:g2diagnostic.FetchNextEntityBySizeRequest)
    FetchNextEntityBySizeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FetchNextEntityBySizeRequest.newBuilder() to construct.
  private FetchNextEntityBySizeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchNextEntityBySizeRequest() {
    entityListBySizeHandle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FetchNextEntityBySizeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FetchNextEntityBySizeRequest(
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

            entityListBySizeHandle_ = s;
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
    return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_FetchNextEntityBySizeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_FetchNextEntityBySizeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest.class, com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest.Builder.class);
  }

  public static final int ENTITYLISTBYSIZEHANDLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object entityListBySizeHandle_;
  /**
   * <code>string entityListBySizeHandle = 1;</code>
   * @return The entityListBySizeHandle.
   */
  @java.lang.Override
  public java.lang.String getEntityListBySizeHandle() {
    java.lang.Object ref = entityListBySizeHandle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityListBySizeHandle_ = s;
      return s;
    }
  }
  /**
   * <code>string entityListBySizeHandle = 1;</code>
   * @return The bytes for entityListBySizeHandle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntityListBySizeHandleBytes() {
    java.lang.Object ref = entityListBySizeHandle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityListBySizeHandle_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityListBySizeHandle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entityListBySizeHandle_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityListBySizeHandle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entityListBySizeHandle_);
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
    if (!(obj instanceof com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest)) {
      return super.equals(obj);
    }
    com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest other = (com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest) obj;

    if (!getEntityListBySizeHandle()
        .equals(other.getEntityListBySizeHandle())) return false;
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
    hash = (37 * hash) + ENTITYLISTBYSIZEHANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getEntityListBySizeHandle().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parseFrom(
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
  public static Builder newBuilder(com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest prototype) {
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
   * Protobuf type {@code g2diagnostic.FetchNextEntityBySizeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:g2diagnostic.FetchNextEntityBySizeRequest)
      com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_FetchNextEntityBySizeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_FetchNextEntityBySizeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest.class, com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest.Builder.class);
    }

    // Construct using com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest.newBuilder()
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
      entityListBySizeHandle_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_FetchNextEntityBySizeRequest_descriptor;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest getDefaultInstanceForType() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest build() {
      com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest buildPartial() {
      com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest result = new com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest(this);
      result.entityListBySizeHandle_ = entityListBySizeHandle_;
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
      if (other instanceof com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest) {
        return mergeFrom((com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest other) {
      if (other == com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest.getDefaultInstance()) return this;
      if (!other.getEntityListBySizeHandle().isEmpty()) {
        entityListBySizeHandle_ = other.entityListBySizeHandle_;
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
      com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object entityListBySizeHandle_ = "";
    /**
     * <code>string entityListBySizeHandle = 1;</code>
     * @return The entityListBySizeHandle.
     */
    public java.lang.String getEntityListBySizeHandle() {
      java.lang.Object ref = entityListBySizeHandle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityListBySizeHandle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string entityListBySizeHandle = 1;</code>
     * @return The bytes for entityListBySizeHandle.
     */
    public com.google.protobuf.ByteString
        getEntityListBySizeHandleBytes() {
      java.lang.Object ref = entityListBySizeHandle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityListBySizeHandle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string entityListBySizeHandle = 1;</code>
     * @param value The entityListBySizeHandle to set.
     * @return This builder for chaining.
     */
    public Builder setEntityListBySizeHandle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entityListBySizeHandle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string entityListBySizeHandle = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityListBySizeHandle() {
      
      entityListBySizeHandle_ = getDefaultInstance().getEntityListBySizeHandle();
      onChanged();
      return this;
    }
    /**
     * <code>string entityListBySizeHandle = 1;</code>
     * @param value The bytes for entityListBySizeHandle to set.
     * @return This builder for chaining.
     */
    public Builder setEntityListBySizeHandleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entityListBySizeHandle_ = value;
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


    // @@protoc_insertion_point(builder_scope:g2diagnostic.FetchNextEntityBySizeRequest)
  }

  // @@protoc_insertion_point(class_scope:g2diagnostic.FetchNextEntityBySizeRequest)
  private static final com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest();
  }

  public static com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchNextEntityBySizeRequest>
      PARSER = new com.google.protobuf.AbstractParser<FetchNextEntityBySizeRequest>() {
    @java.lang.Override
    public FetchNextEntityBySizeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FetchNextEntityBySizeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FetchNextEntityBySizeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchNextEntityBySizeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.senzing.g2.engine.grpc.G2Diagnostic.FetchNextEntityBySizeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

