// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2product.proto

package com.senzing.g2.engine.grpc.G2Product;

public final class G2ProductProto {
  private G2ProductProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ClearLastExceptionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ClearLastExceptionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ClearLastExceptionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ClearLastExceptionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_DestroyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_DestroyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_DestroyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_DestroyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_GetLastExceptionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_GetLastExceptionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_GetLastExceptionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_GetLastExceptionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_GetLastExceptionCodeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_GetLastExceptionCodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_GetLastExceptionCodeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_GetLastExceptionCodeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_InitRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_InitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_InitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_InitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_LicenseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_LicenseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_LicenseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_LicenseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ValidateLicenseFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ValidateLicenseFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ValidateLicenseFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ValidateLicenseFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ValidateLicenseStringBase64Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ValidateLicenseStringBase64Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ValidateLicenseStringBase64Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ValidateLicenseStringBase64Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_VersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_VersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_VersionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_VersionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017g2product.proto\022\tg2product\"\033\n\031ClearLas" +
      "tExceptionRequest\"\034\n\032ClearLastExceptionR" +
      "esponse\"\020\n\016DestroyRequest\"\021\n\017DestroyResp" +
      "onse\"\031\n\027GetLastExceptionRequest\"*\n\030GetLa" +
      "stExceptionResponse\022\016\n\006result\030\001 \001(\t\"\035\n\033G" +
      "etLastExceptionCodeRequest\"0\n\034GetLastExc" +
      "eptionCodeResponse\022\020\n\010configID\030\001 \001(\005\"L\n\013" +
      "InitRequest\022\022\n\nmoduleName\030\001 \001(\t\022\021\n\tiniPa" +
      "rams\030\002 \001(\t\022\026\n\016verboseLogging\030\003 \001(\005\"\016\n\014In" +
      "itResponse\"\020\n\016LicenseRequest\"!\n\017LicenseR" +
      "esponse\022\016\n\006result\030\001 \001(\t\"5\n\032ValidateLicen" +
      "seFileRequest\022\027\n\017licenseFilePath\030\001 \001(\t\"-" +
      "\n\033ValidateLicenseFileResponse\022\016\n\006result\030" +
      "\001 \001(\t\";\n\"ValidateLicenseStringBase64Requ" +
      "est\022\025\n\rlicenseString\030\001 \001(\t\"5\n#ValidateLi" +
      "censeStringBase64Response\022\016\n\006result\030\001 \001(" +
      "\t\"\020\n\016VersionRequest\"!\n\017VersionResponse\022\016" +
      "\n\006result\030\001 \001(\t2\254\006\n\014G2Diagnostic\022c\n\022Clear" +
      "LastException\022$.g2product.ClearLastExcep" +
      "tionRequest\032%.g2product.ClearLastExcepti" +
      "onResponse\"\000\022B\n\007Destroy\022\031.g2product.Dest" +
      "royRequest\032\032.g2product.DestroyResponse\"\000" +
      "\022]\n\020GetLastException\022\".g2product.GetLast" +
      "ExceptionRequest\032#.g2product.GetLastExce" +
      "ptionResponse\"\000\022i\n\024GetLastExceptionCode\022" +
      "&.g2product.GetLastExceptionCodeRequest\032" +
      "\'.g2product.GetLastExceptionCodeResponse" +
      "\"\000\0229\n\004Init\022\026.g2product.InitRequest\032\027.g2p" +
      "roduct.InitResponse\"\000\022B\n\007License\022\031.g2pro" +
      "duct.LicenseRequest\032\032.g2product.LicenseR" +
      "esponse\"\000\022f\n\023ValidateLicenseFile\022%.g2pro" +
      "duct.ValidateLicenseFileRequest\032&.g2prod" +
      "uct.ValidateLicenseFileResponse\"\000\022~\n\033Val" +
      "idateLicenseStringBase64\022-.g2product.Val" +
      "idateLicenseStringBase64Request\032..g2prod" +
      "uct.ValidateLicenseStringBase64Response\"" +
      "\000\022B\n\007Version\022\031.g2product.VersionRequest\032" +
      "\032.g2product.VersionResponse\"\000Be\n$com.sen" +
      "zing.g2.engine.grpc.G2ProductB\016G2Product" +
      "ProtoP\001Z+github.com/senzing/g2-sdk-go-gr" +
      "pc/g2productb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_g2product_ClearLastExceptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_g2product_ClearLastExceptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ClearLastExceptionRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_ClearLastExceptionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_g2product_ClearLastExceptionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ClearLastExceptionResponse_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_DestroyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_g2product_DestroyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_DestroyRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_DestroyResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_g2product_DestroyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_DestroyResponse_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_GetLastExceptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_g2product_GetLastExceptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_GetLastExceptionRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_GetLastExceptionResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_g2product_GetLastExceptionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_GetLastExceptionResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_g2product_GetLastExceptionCodeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_g2product_GetLastExceptionCodeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_GetLastExceptionCodeRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_GetLastExceptionCodeResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_g2product_GetLastExceptionCodeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_GetLastExceptionCodeResponse_descriptor,
        new java.lang.String[] { "ConfigID", });
    internal_static_g2product_InitRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_g2product_InitRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_InitRequest_descriptor,
        new java.lang.String[] { "ModuleName", "IniParams", "VerboseLogging", });
    internal_static_g2product_InitResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_g2product_InitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_InitResponse_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_LicenseRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_g2product_LicenseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_LicenseRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_LicenseResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_g2product_LicenseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_LicenseResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_g2product_ValidateLicenseFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_g2product_ValidateLicenseFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ValidateLicenseFileRequest_descriptor,
        new java.lang.String[] { "LicenseFilePath", });
    internal_static_g2product_ValidateLicenseFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_g2product_ValidateLicenseFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ValidateLicenseFileResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_g2product_ValidateLicenseStringBase64Request_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_g2product_ValidateLicenseStringBase64Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ValidateLicenseStringBase64Request_descriptor,
        new java.lang.String[] { "LicenseString", });
    internal_static_g2product_ValidateLicenseStringBase64Response_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_g2product_ValidateLicenseStringBase64Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ValidateLicenseStringBase64Response_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_g2product_VersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_g2product_VersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_VersionRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_VersionResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_g2product_VersionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_VersionResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
