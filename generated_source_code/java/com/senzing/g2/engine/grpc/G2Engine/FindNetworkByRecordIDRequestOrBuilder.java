// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2engine.proto

package com.senzing.g2.engine.grpc.G2Engine;

public interface FindNetworkByRecordIDRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:g2engine.FindNetworkByRecordIDRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string recordList = 1;</code>
   * @return The recordList.
   */
  java.lang.String getRecordList();
  /**
   * <code>string recordList = 1;</code>
   * @return The bytes for recordList.
   */
  com.google.protobuf.ByteString
      getRecordListBytes();

  /**
   * <code>int32 maxDegree = 2;</code>
   * @return The maxDegree.
   */
  int getMaxDegree();

  /**
   * <code>int32 buildOutDegree = 3;</code>
   * @return The buildOutDegree.
   */
  int getBuildOutDegree();

  /**
   * <code>int32 maxEntities = 4;</code>
   * @return The maxEntities.
   */
  int getMaxEntities();
}
