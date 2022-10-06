// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2engine.proto

package com.senzing.g2.engine.grpc.G2Engine;

/**
 * Protobuf type {@code g2engine.ExportCSVEntityReportRequest}
 */
public final class ExportCSVEntityReportRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:g2engine.ExportCSVEntityReportRequest)
    ExportCSVEntityReportRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportCSVEntityReportRequest.newBuilder() to construct.
  private ExportCSVEntityReportRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportCSVEntityReportRequest() {
    csvColumnList_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportCSVEntityReportRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExportCSVEntityReportRequest(
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

            csvColumnList_ = s;
            break;
          }
          case 16: {

            flags_ = input.readInt64();
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
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_ExportCSVEntityReportRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_ExportCSVEntityReportRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest.class, com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest.Builder.class);
  }

  public static final int CSVCOLUMNLIST_FIELD_NUMBER = 1;
  private volatile java.lang.Object csvColumnList_;
  /**
   * <code>string csvColumnList = 1;</code>
   * @return The csvColumnList.
   */
  @java.lang.Override
  public java.lang.String getCsvColumnList() {
    java.lang.Object ref = csvColumnList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      csvColumnList_ = s;
      return s;
    }
  }
  /**
   * <code>string csvColumnList = 1;</code>
   * @return The bytes for csvColumnList.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCsvColumnListBytes() {
    java.lang.Object ref = csvColumnList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      csvColumnList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLAGS_FIELD_NUMBER = 2;
  private long flags_;
  /**
   * <code>int64 flags = 2;</code>
   * @return The flags.
   */
  @java.lang.Override
  public long getFlags() {
    return flags_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(csvColumnList_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, csvColumnList_);
    }
    if (flags_ != 0L) {
      output.writeInt64(2, flags_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(csvColumnList_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, csvColumnList_);
    }
    if (flags_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, flags_);
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
    if (!(obj instanceof com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest)) {
      return super.equals(obj);
    }
    com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest other = (com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest) obj;

    if (!getCsvColumnList()
        .equals(other.getCsvColumnList())) return false;
    if (getFlags()
        != other.getFlags()) return false;
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
    hash = (37 * hash) + CSVCOLUMNLIST_FIELD_NUMBER;
    hash = (53 * hash) + getCsvColumnList().hashCode();
    hash = (37 * hash) + FLAGS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFlags());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parseFrom(
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
  public static Builder newBuilder(com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest prototype) {
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
   * Protobuf type {@code g2engine.ExportCSVEntityReportRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:g2engine.ExportCSVEntityReportRequest)
      com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_ExportCSVEntityReportRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_ExportCSVEntityReportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest.class, com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest.Builder.class);
    }

    // Construct using com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest.newBuilder()
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
      csvColumnList_ = "";

      flags_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_ExportCSVEntityReportRequest_descriptor;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest getDefaultInstanceForType() {
      return com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest build() {
      com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest buildPartial() {
      com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest result = new com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest(this);
      result.csvColumnList_ = csvColumnList_;
      result.flags_ = flags_;
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
      if (other instanceof com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest) {
        return mergeFrom((com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest other) {
      if (other == com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest.getDefaultInstance()) return this;
      if (!other.getCsvColumnList().isEmpty()) {
        csvColumnList_ = other.csvColumnList_;
        onChanged();
      }
      if (other.getFlags() != 0L) {
        setFlags(other.getFlags());
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
      com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object csvColumnList_ = "";
    /**
     * <code>string csvColumnList = 1;</code>
     * @return The csvColumnList.
     */
    public java.lang.String getCsvColumnList() {
      java.lang.Object ref = csvColumnList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        csvColumnList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string csvColumnList = 1;</code>
     * @return The bytes for csvColumnList.
     */
    public com.google.protobuf.ByteString
        getCsvColumnListBytes() {
      java.lang.Object ref = csvColumnList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        csvColumnList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string csvColumnList = 1;</code>
     * @param value The csvColumnList to set.
     * @return This builder for chaining.
     */
    public Builder setCsvColumnList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      csvColumnList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string csvColumnList = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCsvColumnList() {
      
      csvColumnList_ = getDefaultInstance().getCsvColumnList();
      onChanged();
      return this;
    }
    /**
     * <code>string csvColumnList = 1;</code>
     * @param value The bytes for csvColumnList to set.
     * @return This builder for chaining.
     */
    public Builder setCsvColumnListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      csvColumnList_ = value;
      onChanged();
      return this;
    }

    private long flags_ ;
    /**
     * <code>int64 flags = 2;</code>
     * @return The flags.
     */
    @java.lang.Override
    public long getFlags() {
      return flags_;
    }
    /**
     * <code>int64 flags = 2;</code>
     * @param value The flags to set.
     * @return This builder for chaining.
     */
    public Builder setFlags(long value) {
      
      flags_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 flags = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlags() {
      
      flags_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:g2engine.ExportCSVEntityReportRequest)
  }

  // @@protoc_insertion_point(class_scope:g2engine.ExportCSVEntityReportRequest)
  private static final com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest();
  }

  public static com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportCSVEntityReportRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExportCSVEntityReportRequest>() {
    @java.lang.Override
    public ExportCSVEntityReportRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExportCSVEntityReportRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExportCSVEntityReportRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportCSVEntityReportRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.senzing.g2.engine.grpc.G2Engine.ExportCSVEntityReportRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

