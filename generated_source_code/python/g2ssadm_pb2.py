# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2ssadm.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\rg2ssadm.proto\x12\x07g2ssadm\"\x1b\n\x19\x43learLastExceptionRequest\"\x1c\n\x1a\x43learLastExceptionResponse\"G\n\x18\x43reateSaltInStoreRequest\x12\r\n\x05soPin\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x0e\n\x06method\x18\x03 \x01(\t\"+\n\x19\x43reateSaltInStoreResponse\x12\x0e\n\x06result\x18\x01 \x01(\t\"\x10\n\x0e\x44\x65stroyRequest\"\x11\n\x0f\x44\x65stroyResponse\"\x19\n\x17GetLastExceptionRequest\"*\n\x18GetLastExceptionResponse\x12\x0e\n\x06result\x18\x01 \x01(\t\"\x1d\n\x1bGetLastExceptionCodeRequest\".\n\x1cGetLastExceptionCodeResponse\x12\x0e\n\x06result\x18\x01 \x01(\x05\"L\n\x0bInitRequest\x12\x12\n\nmoduleName\x18\x01 \x01(\t\x12\x11\n\tiniParams\x18\x02 \x01(\t\x12\x16\n\x0everboseLogging\x18\x03 \x01(\x05\"\x0e\n\x0cInitResponse\"R\n\x19InitializeNewTokenRequest\x12\x14\n\x0c\x64\x65\x66\x61ultSOPin\x18\x01 \x01(\t\x12\x10\n\x08newSOPin\x18\x02 \x01(\t\x12\r\n\x05label\x18\x03 \x01(\t\"\x1c\n\x1aInitializeNewTokenResponse\"\r\n\x0bListRequest\"\x1e\n\x0cListResponse\x12\x0e\n\x06result\x18\x01 \x01(\t\"9\n\nPutRequest\x12\r\n\x05soPin\x18\x01 \x01(\t\x12\r\n\x05label\x18\x02 \x01(\t\x12\r\n\x05value\x18\x03 \x01(\t\"\r\n\x0bPutResponse\"8\n\x18ReinitializeTokenRequest\x12\r\n\x05soPin\x18\x01 \x01(\t\x12\r\n\x05label\x18\x02 \x01(\t\"\x1b\n\x19ReinitializeTokenResponse\"\"\n\x11SetupStoreRequest\x12\r\n\x05soPin\x18\x01 \x01(\t\"\x14\n\x12SetupStoreResponse2\xf9\x06\n\x0cG2Diagnostic\x12_\n\x12\x43learLastException\x12\".g2ssadm.ClearLastExceptionRequest\x1a#.g2ssadm.ClearLastExceptionResponse\"\x00\x12\\\n\x11\x43reateSaltInStore\x12!.g2ssadm.CreateSaltInStoreRequest\x1a\".g2ssadm.CreateSaltInStoreResponse\"\x00\x12>\n\x07\x44\x65stroy\x12\x17.g2ssadm.DestroyRequest\x1a\x18.g2ssadm.DestroyResponse\"\x00\x12Y\n\x10GetLastException\x12 .g2ssadm.GetLastExceptionRequest\x1a!.g2ssadm.GetLastExceptionResponse\"\x00\x12\x65\n\x14GetLastExceptionCode\x12$.g2ssadm.GetLastExceptionCodeRequest\x1a%.g2ssadm.GetLastExceptionCodeResponse\"\x00\x12\x35\n\x04Init\x12\x14.g2ssadm.InitRequest\x1a\x15.g2ssadm.InitResponse\"\x00\x12_\n\x12InitializeNewToken\x12\".g2ssadm.InitializeNewTokenRequest\x1a#.g2ssadm.InitializeNewTokenResponse\"\x00\x12\x35\n\x04List\x12\x14.g2ssadm.ListRequest\x1a\x15.g2ssadm.ListResponse\"\x00\x12\x32\n\x03Put\x12\x13.g2ssadm.PutRequest\x1a\x14.g2ssadm.PutResponse\"\x00\x12\\\n\x11ReinitializeToken\x12!.g2ssadm.ReinitializeTokenRequest\x1a\".g2ssadm.ReinitializeTokenResponse\"\x00\x12G\n\nSetupStore\x12\x1a.g2ssadm.SetupStoreRequest\x1a\x1b.g2ssadm.SetupStoreResponse\"\x00\x42\x63\n$com.senzing.g2.engine.grpc.G2SSAdminB\x0eG2SSAdminProtoP\x01Z)github.com/senzing/g2-sdk-go-grpc/g2ssadmb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'g2ssadm_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.senzing.g2.engine.grpc.G2SSAdminB\016G2SSAdminProtoP\001Z)github.com/senzing/g2-sdk-go-grpc/g2ssadm'
  _CLEARLASTEXCEPTIONREQUEST._serialized_start=26
  _CLEARLASTEXCEPTIONREQUEST._serialized_end=53
  _CLEARLASTEXCEPTIONRESPONSE._serialized_start=55
  _CLEARLASTEXCEPTIONRESPONSE._serialized_end=83
  _CREATESALTINSTOREREQUEST._serialized_start=85
  _CREATESALTINSTOREREQUEST._serialized_end=156
  _CREATESALTINSTORERESPONSE._serialized_start=158
  _CREATESALTINSTORERESPONSE._serialized_end=201
  _DESTROYREQUEST._serialized_start=203
  _DESTROYREQUEST._serialized_end=219
  _DESTROYRESPONSE._serialized_start=221
  _DESTROYRESPONSE._serialized_end=238
  _GETLASTEXCEPTIONREQUEST._serialized_start=240
  _GETLASTEXCEPTIONREQUEST._serialized_end=265
  _GETLASTEXCEPTIONRESPONSE._serialized_start=267
  _GETLASTEXCEPTIONRESPONSE._serialized_end=309
  _GETLASTEXCEPTIONCODEREQUEST._serialized_start=311
  _GETLASTEXCEPTIONCODEREQUEST._serialized_end=340
  _GETLASTEXCEPTIONCODERESPONSE._serialized_start=342
  _GETLASTEXCEPTIONCODERESPONSE._serialized_end=388
  _INITREQUEST._serialized_start=390
  _INITREQUEST._serialized_end=466
  _INITRESPONSE._serialized_start=468
  _INITRESPONSE._serialized_end=482
  _INITIALIZENEWTOKENREQUEST._serialized_start=484
  _INITIALIZENEWTOKENREQUEST._serialized_end=566
  _INITIALIZENEWTOKENRESPONSE._serialized_start=568
  _INITIALIZENEWTOKENRESPONSE._serialized_end=596
  _LISTREQUEST._serialized_start=598
  _LISTREQUEST._serialized_end=611
  _LISTRESPONSE._serialized_start=613
  _LISTRESPONSE._serialized_end=643
  _PUTREQUEST._serialized_start=645
  _PUTREQUEST._serialized_end=702
  _PUTRESPONSE._serialized_start=704
  _PUTRESPONSE._serialized_end=717
  _REINITIALIZETOKENREQUEST._serialized_start=719
  _REINITIALIZETOKENREQUEST._serialized_end=775
  _REINITIALIZETOKENRESPONSE._serialized_start=777
  _REINITIALIZETOKENRESPONSE._serialized_end=804
  _SETUPSTOREREQUEST._serialized_start=806
  _SETUPSTOREREQUEST._serialized_end=840
  _SETUPSTORERESPONSE._serialized_start=842
  _SETUPSTORERESPONSE._serialized_end=862
  _G2DIAGNOSTIC._serialized_start=865
  _G2DIAGNOSTIC._serialized_end=1754
# @@protoc_insertion_point(module_scope)
