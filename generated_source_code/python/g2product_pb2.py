# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2product.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0fg2product.proto\x12\tg2product\"\x1b\n\x19\x43learLastExceptionRequest\"\x1c\n\x1a\x43learLastExceptionResponse\"\x10\n\x0e\x44\x65stroyRequest\"\x11\n\x0f\x44\x65stroyResponse\"\x19\n\x17GetLastExceptionRequest\"*\n\x18GetLastExceptionResponse\x12\x0e\n\x06result\x18\x01 \x01(\t\"\x1d\n\x1bGetLastExceptionCodeRequest\"0\n\x1cGetLastExceptionCodeResponse\x12\x10\n\x08\x63onfigID\x18\x01 \x01(\x05\"L\n\x0bInitRequest\x12\x12\n\nmoduleName\x18\x01 \x01(\t\x12\x11\n\tiniParams\x18\x02 \x01(\t\x12\x16\n\x0everboseLogging\x18\x03 \x01(\x05\"\x0e\n\x0cInitResponse\"\x10\n\x0eLicenseRequest\"!\n\x0fLicenseResponse\x12\x0e\n\x06result\x18\x01 \x01(\t\"5\n\x1aValidateLicenseFileRequest\x12\x17\n\x0flicenseFilePath\x18\x01 \x01(\t\"-\n\x1bValidateLicenseFileResponse\x12\x0e\n\x06result\x18\x01 \x01(\t\";\n\"ValidateLicenseStringBase64Request\x12\x15\n\rlicenseString\x18\x01 \x01(\t\"5\n#ValidateLicenseStringBase64Response\x12\x0e\n\x06result\x18\x01 \x01(\t\"\x10\n\x0eVersionRequest\"!\n\x0fVersionResponse\x12\x0e\n\x06result\x18\x01 \x01(\t2\xac\x06\n\x0cG2Diagnostic\x12\x63\n\x12\x43learLastException\x12$.g2product.ClearLastExceptionRequest\x1a%.g2product.ClearLastExceptionResponse\"\x00\x12\x42\n\x07\x44\x65stroy\x12\x19.g2product.DestroyRequest\x1a\x1a.g2product.DestroyResponse\"\x00\x12]\n\x10GetLastException\x12\".g2product.GetLastExceptionRequest\x1a#.g2product.GetLastExceptionResponse\"\x00\x12i\n\x14GetLastExceptionCode\x12&.g2product.GetLastExceptionCodeRequest\x1a\'.g2product.GetLastExceptionCodeResponse\"\x00\x12\x39\n\x04Init\x12\x16.g2product.InitRequest\x1a\x17.g2product.InitResponse\"\x00\x12\x42\n\x07License\x12\x19.g2product.LicenseRequest\x1a\x1a.g2product.LicenseResponse\"\x00\x12\x66\n\x13ValidateLicenseFile\x12%.g2product.ValidateLicenseFileRequest\x1a&.g2product.ValidateLicenseFileResponse\"\x00\x12~\n\x1bValidateLicenseStringBase64\x12-.g2product.ValidateLicenseStringBase64Request\x1a..g2product.ValidateLicenseStringBase64Response\"\x00\x12\x42\n\x07Version\x12\x19.g2product.VersionRequest\x1a\x1a.g2product.VersionResponse\"\x00\x42\x65\n$com.senzing.g2.engine.grpc.G2ProductB\x0eG2ProductProtoP\x01Z+github.com/senzing/g2-sdk-go-grpc/g2productb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'g2product_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.senzing.g2.engine.grpc.G2ProductB\016G2ProductProtoP\001Z+github.com/senzing/g2-sdk-go-grpc/g2product'
  _CLEARLASTEXCEPTIONREQUEST._serialized_start=30
  _CLEARLASTEXCEPTIONREQUEST._serialized_end=57
  _CLEARLASTEXCEPTIONRESPONSE._serialized_start=59
  _CLEARLASTEXCEPTIONRESPONSE._serialized_end=87
  _DESTROYREQUEST._serialized_start=89
  _DESTROYREQUEST._serialized_end=105
  _DESTROYRESPONSE._serialized_start=107
  _DESTROYRESPONSE._serialized_end=124
  _GETLASTEXCEPTIONREQUEST._serialized_start=126
  _GETLASTEXCEPTIONREQUEST._serialized_end=151
  _GETLASTEXCEPTIONRESPONSE._serialized_start=153
  _GETLASTEXCEPTIONRESPONSE._serialized_end=195
  _GETLASTEXCEPTIONCODEREQUEST._serialized_start=197
  _GETLASTEXCEPTIONCODEREQUEST._serialized_end=226
  _GETLASTEXCEPTIONCODERESPONSE._serialized_start=228
  _GETLASTEXCEPTIONCODERESPONSE._serialized_end=276
  _INITREQUEST._serialized_start=278
  _INITREQUEST._serialized_end=354
  _INITRESPONSE._serialized_start=356
  _INITRESPONSE._serialized_end=370
  _LICENSEREQUEST._serialized_start=372
  _LICENSEREQUEST._serialized_end=388
  _LICENSERESPONSE._serialized_start=390
  _LICENSERESPONSE._serialized_end=423
  _VALIDATELICENSEFILEREQUEST._serialized_start=425
  _VALIDATELICENSEFILEREQUEST._serialized_end=478
  _VALIDATELICENSEFILERESPONSE._serialized_start=480
  _VALIDATELICENSEFILERESPONSE._serialized_end=525
  _VALIDATELICENSESTRINGBASE64REQUEST._serialized_start=527
  _VALIDATELICENSESTRINGBASE64REQUEST._serialized_end=586
  _VALIDATELICENSESTRINGBASE64RESPONSE._serialized_start=588
  _VALIDATELICENSESTRINGBASE64RESPONSE._serialized_end=641
  _VERSIONREQUEST._serialized_start=643
  _VERSIONREQUEST._serialized_end=659
  _VERSIONRESPONSE._serialized_start=661
  _VERSIONRESPONSE._serialized_end=694
  _G2DIAGNOSTIC._serialized_start=697
  _G2DIAGNOSTIC._serialized_end=1509
# @@protoc_insertion_point(module_scope)
