// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2diagnostic.proto

package com.senzing.g2.engine.grpc.G2Diagnostic;

/**
 * Protobuf type {@code g2diagnostic.GetLogicalCoresResponse}
 */
public final class GetLogicalCoresResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:g2diagnostic.GetLogicalCoresResponse)
    GetLogicalCoresResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetLogicalCoresResponse.newBuilder() to construct.
  private GetLogicalCoresResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetLogicalCoresResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetLogicalCoresResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetLogicalCoresResponse(
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
          case 8: {

            result_ = input.readInt32();
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
    return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetLogicalCoresResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetLogicalCoresResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse.class, com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>int32 result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public int getResult() {
    return result_;
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
    if (result_ != 0) {
      output.writeInt32(1, result_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, result_);
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
    if (!(obj instanceof com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse)) {
      return super.equals(obj);
    }
    com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse other = (com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse) obj;

    if (getResult()
        != other.getResult()) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parseFrom(
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
  public static Builder newBuilder(com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse prototype) {
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
   * Protobuf type {@code g2diagnostic.GetLogicalCoresResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:g2diagnostic.GetLogicalCoresResponse)
      com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetLogicalCoresResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetLogicalCoresResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse.class, com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse.Builder.class);
    }

    // Construct using com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse.newBuilder()
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
      result_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetLogicalCoresResponse_descriptor;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse getDefaultInstanceForType() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse build() {
      com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse buildPartial() {
      com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse result = new com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse(this);
      result.result_ = result_;
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
      if (other instanceof com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse) {
        return mergeFrom((com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse other) {
      if (other == com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse.getDefaultInstance()) return this;
      if (other.getResult() != 0) {
        setResult(other.getResult());
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
      com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ ;
    /**
     * <code>int32 result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public int getResult() {
      return result_;
    }
    /**
     * <code>int32 result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
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


    // @@protoc_insertion_point(builder_scope:g2diagnostic.GetLogicalCoresResponse)
  }

  // @@protoc_insertion_point(class_scope:g2diagnostic.GetLogicalCoresResponse)
  private static final com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse();
  }

  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLogicalCoresResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetLogicalCoresResponse>() {
    @java.lang.Override
    public GetLogicalCoresResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetLogicalCoresResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetLogicalCoresResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLogicalCoresResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.senzing.g2.engine.grpc.G2Diagnostic.GetLogicalCoresResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

