// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2config.proto

package com.senzing.g2.engine.grpc.G2Config;

public interface AddDataSourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:g2config.AddDataSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 configHandle = 1;</code>
   * @return The configHandle.
   */
  long getConfigHandle();

  /**
   * <code>string inputJson = 2;</code>
   * @return The inputJson.
   */
  java.lang.String getInputJson();
  /**
   * <code>string inputJson = 2;</code>
   * @return The bytes for inputJson.
   */
  com.google.protobuf.ByteString
      getInputJsonBytes();
}