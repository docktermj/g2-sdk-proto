// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2hasher.proto

package com.senzing.g2.engine.grpc.G2Hasher;

public final class G2HasherProto {
  private G2HasherProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_ClearLastExceptionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_ClearLastExceptionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_ClearLastExceptionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_ClearLastExceptionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_DestroyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_DestroyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_DestroyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_DestroyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_ExportTokenLibraryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_ExportTokenLibraryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_ExportTokenLibraryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_ExportTokenLibraryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_GetLastExceptionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_GetLastExceptionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_GetLastExceptionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_GetLastExceptionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_GetLastExceptionCodeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_GetLastExceptionCodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_GetLastExceptionCodeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_GetLastExceptionCodeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_InitRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_InitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_InitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_InitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_InitWithConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_InitWithConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_InitWithConfigResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_InitWithConfigResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_ProcessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_ProcessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2hasher_ProcessResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2hasher_ProcessResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016g2hasher.proto\022\010g2hasher\"\033\n\031ClearLastE" +
      "xceptionRequest\"\034\n\032ClearLastExceptionRes" +
      "ponse\"\020\n\016DestroyRequest\"\021\n\017DestroyRespon" +
      "se\"\033\n\031ExportTokenLibraryRequest\",\n\032Expor" +
      "tTokenLibraryResponse\022\016\n\006result\030\001 \001(\t\"\031\n" +
      "\027GetLastExceptionRequest\"*\n\030GetLastExcep" +
      "tionResponse\022\016\n\006result\030\001 \001(\t\"\035\n\033GetLastE" +
      "xceptionCodeRequest\"0\n\034GetLastExceptionC" +
      "odeResponse\022\020\n\010configID\030\001 \001(\005\"L\n\013InitReq" +
      "uest\022\022\n\nmoduleName\030\001 \001(\t\022\021\n\tiniParams\030\002 " +
      "\001(\t\022\026\n\016verboseLogging\030\003 \001(\005\"\016\n\014InitRespo" +
      "nse\"j\n\025InitWithConfigRequest\022\022\n\nmoduleNa" +
      "me\030\001 \001(\t\022\021\n\tiniParams\030\002 \001(\t\022\022\n\nconfigJso" +
      "n\030\003 \001(\t\022\026\n\016verboseLogging\030\004 \001(\005\"\030\n\026InitW" +
      "ithConfigResponse\" \n\016ProcessRequest\022\016\n\006r" +
      "ecord\030\001 \001(\t\"!\n\017ProcessResponse\022\016\n\006result" +
      "\030\001 \001(\t2\256\005\n\014G2Diagnostic\022a\n\022ClearLastExce" +
      "ption\022#.g2hasher.ClearLastExceptionReque" +
      "st\032$.g2hasher.ClearLastExceptionResponse" +
      "\"\000\022@\n\007Destroy\022\030.g2hasher.DestroyRequest\032" +
      "\031.g2hasher.DestroyResponse\"\000\022a\n\022ExportTo" +
      "kenLibrary\022#.g2hasher.ExportTokenLibrary" +
      "Request\032$.g2hasher.ExportTokenLibraryRes" +
      "ponse\"\000\022[\n\020GetLastException\022!.g2hasher.G" +
      "etLastExceptionRequest\032\".g2hasher.GetLas" +
      "tExceptionResponse\"\000\022g\n\024GetLastException" +
      "Code\022%.g2hasher.GetLastExceptionCodeRequ" +
      "est\032&.g2hasher.GetLastExceptionCodeRespo" +
      "nse\"\000\0227\n\004Init\022\025.g2hasher.InitRequest\032\026.g" +
      "2hasher.InitResponse\"\000\022U\n\016InitWithConfig" +
      "\022\037.g2hasher.InitWithConfigRequest\032 .g2ha" +
      "sher.InitWithConfigResponse\"\000\022@\n\007Process" +
      "\022\030.g2hasher.ProcessRequest\032\031.g2hasher.Pr" +
      "ocessResponse\"\000Bb\n#com.senzing.g2.engine" +
      ".grpc.G2HasherB\rG2HasherProtoP\001Z*github." +
      "com/senzing/g2-sdk-go-grpc/g2hasherb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_g2hasher_ClearLastExceptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_g2hasher_ClearLastExceptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_ClearLastExceptionRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2hasher_ClearLastExceptionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_g2hasher_ClearLastExceptionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_ClearLastExceptionResponse_descriptor,
        new java.lang.String[] { });
    internal_static_g2hasher_DestroyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_g2hasher_DestroyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_DestroyRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2hasher_DestroyResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_g2hasher_DestroyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_DestroyResponse_descriptor,
        new java.lang.String[] { });
    internal_static_g2hasher_ExportTokenLibraryRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_g2hasher_ExportTokenLibraryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_ExportTokenLibraryRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2hasher_ExportTokenLibraryResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_g2hasher_ExportTokenLibraryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_ExportTokenLibraryResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_g2hasher_GetLastExceptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_g2hasher_GetLastExceptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_GetLastExceptionRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2hasher_GetLastExceptionResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_g2hasher_GetLastExceptionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_GetLastExceptionResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_g2hasher_GetLastExceptionCodeRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_g2hasher_GetLastExceptionCodeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_GetLastExceptionCodeRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2hasher_GetLastExceptionCodeResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_g2hasher_GetLastExceptionCodeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_GetLastExceptionCodeResponse_descriptor,
        new java.lang.String[] { "ConfigID", });
    internal_static_g2hasher_InitRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_g2hasher_InitRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_InitRequest_descriptor,
        new java.lang.String[] { "ModuleName", "IniParams", "VerboseLogging", });
    internal_static_g2hasher_InitResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_g2hasher_InitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_InitResponse_descriptor,
        new java.lang.String[] { });
    internal_static_g2hasher_InitWithConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_g2hasher_InitWithConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_InitWithConfigRequest_descriptor,
        new java.lang.String[] { "ModuleName", "IniParams", "ConfigJson", "VerboseLogging", });
    internal_static_g2hasher_InitWithConfigResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_g2hasher_InitWithConfigResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_InitWithConfigResponse_descriptor,
        new java.lang.String[] { });
    internal_static_g2hasher_ProcessRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_g2hasher_ProcessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_ProcessRequest_descriptor,
        new java.lang.String[] { "Record", });
    internal_static_g2hasher_ProcessResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_g2hasher_ProcessResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2hasher_ProcessResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}