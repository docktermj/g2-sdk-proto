// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2diagnostic.proto

package com.senzing.g2.engine.grpc.G2Diagnostic;

/**
 * Protobuf type {@code g2diagnostic.GetGenericFeaturesRequest}
 */
public final class GetGenericFeaturesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:g2diagnostic.GetGenericFeaturesRequest)
    GetGenericFeaturesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGenericFeaturesRequest.newBuilder() to construct.
  private GetGenericFeaturesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGenericFeaturesRequest() {
    featureType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGenericFeaturesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetGenericFeaturesRequest(
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

            featureType_ = s;
            break;
          }
          case 16: {

            maximumEstimatedCount_ = input.readInt32();
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
    return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetGenericFeaturesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetGenericFeaturesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest.class, com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest.Builder.class);
  }

  public static final int FEATURETYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object featureType_;
  /**
   * <code>string featureType = 1;</code>
   * @return The featureType.
   */
  @java.lang.Override
  public java.lang.String getFeatureType() {
    java.lang.Object ref = featureType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      featureType_ = s;
      return s;
    }
  }
  /**
   * <code>string featureType = 1;</code>
   * @return The bytes for featureType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeatureTypeBytes() {
    java.lang.Object ref = featureType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      featureType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAXIMUMESTIMATEDCOUNT_FIELD_NUMBER = 2;
  private int maximumEstimatedCount_;
  /**
   * <code>int32 maximumEstimatedCount = 2;</code>
   * @return The maximumEstimatedCount.
   */
  @java.lang.Override
  public int getMaximumEstimatedCount() {
    return maximumEstimatedCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, featureType_);
    }
    if (maximumEstimatedCount_ != 0) {
      output.writeInt32(2, maximumEstimatedCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, featureType_);
    }
    if (maximumEstimatedCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maximumEstimatedCount_);
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
    if (!(obj instanceof com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest)) {
      return super.equals(obj);
    }
    com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest other = (com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest) obj;

    if (!getFeatureType()
        .equals(other.getFeatureType())) return false;
    if (getMaximumEstimatedCount()
        != other.getMaximumEstimatedCount()) return false;
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
    hash = (37 * hash) + FEATURETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureType().hashCode();
    hash = (37 * hash) + MAXIMUMESTIMATEDCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaximumEstimatedCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parseFrom(
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
  public static Builder newBuilder(com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest prototype) {
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
   * Protobuf type {@code g2diagnostic.GetGenericFeaturesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:g2diagnostic.GetGenericFeaturesRequest)
      com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetGenericFeaturesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetGenericFeaturesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest.class, com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest.Builder.class);
    }

    // Construct using com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest.newBuilder()
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
      featureType_ = "";

      maximumEstimatedCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.G2DiagnosticProto.internal_static_g2diagnostic_GetGenericFeaturesRequest_descriptor;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest getDefaultInstanceForType() {
      return com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest build() {
      com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest buildPartial() {
      com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest result = new com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest(this);
      result.featureType_ = featureType_;
      result.maximumEstimatedCount_ = maximumEstimatedCount_;
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
      if (other instanceof com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest) {
        return mergeFrom((com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest other) {
      if (other == com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest.getDefaultInstance()) return this;
      if (!other.getFeatureType().isEmpty()) {
        featureType_ = other.featureType_;
        onChanged();
      }
      if (other.getMaximumEstimatedCount() != 0) {
        setMaximumEstimatedCount(other.getMaximumEstimatedCount());
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
      com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object featureType_ = "";
    /**
     * <code>string featureType = 1;</code>
     * @return The featureType.
     */
    public java.lang.String getFeatureType() {
      java.lang.Object ref = featureType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        featureType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string featureType = 1;</code>
     * @return The bytes for featureType.
     */
    public com.google.protobuf.ByteString
        getFeatureTypeBytes() {
      java.lang.Object ref = featureType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        featureType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string featureType = 1;</code>
     * @param value The featureType to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      featureType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string featureType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeatureType() {
      
      featureType_ = getDefaultInstance().getFeatureType();
      onChanged();
      return this;
    }
    /**
     * <code>string featureType = 1;</code>
     * @param value The bytes for featureType to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      featureType_ = value;
      onChanged();
      return this;
    }

    private int maximumEstimatedCount_ ;
    /**
     * <code>int32 maximumEstimatedCount = 2;</code>
     * @return The maximumEstimatedCount.
     */
    @java.lang.Override
    public int getMaximumEstimatedCount() {
      return maximumEstimatedCount_;
    }
    /**
     * <code>int32 maximumEstimatedCount = 2;</code>
     * @param value The maximumEstimatedCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaximumEstimatedCount(int value) {
      
      maximumEstimatedCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 maximumEstimatedCount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaximumEstimatedCount() {
      
      maximumEstimatedCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:g2diagnostic.GetGenericFeaturesRequest)
  }

  // @@protoc_insertion_point(class_scope:g2diagnostic.GetGenericFeaturesRequest)
  private static final com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest();
  }

  public static com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGenericFeaturesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetGenericFeaturesRequest>() {
    @java.lang.Override
    public GetGenericFeaturesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetGenericFeaturesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetGenericFeaturesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGenericFeaturesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.senzing.g2.engine.grpc.G2Diagnostic.GetGenericFeaturesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

