<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2ssadm.proto

namespace GPBMetadata;

class G2Ssadm
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        $pool->internalAddGeneratedFile(
            '
?
g2ssadm.protog2ssadm"
ClearLastExceptionRequest"
ClearLastExceptionResponse"G
CreateSaltInStoreRequest
soPin (	
name (	
method (	"+
CreateSaltInStoreResponse
result (	"
DestroyRequest"
DestroyResponse"
GetLastExceptionRequest"*
GetLastExceptionResponse
result (	"
GetLastExceptionCodeRequest".
GetLastExceptionCodeResponse
result ("L
InitRequest

moduleName (	
	iniParams (	
verboseLogging ("
InitResponse"R
InitializeNewTokenRequest
defaultSOPin (	
newSOPin (	
label (	"
InitializeNewTokenResponse"
ListRequest"
ListResponse
result (	"9

PutRequest
soPin (	
label (	
value (	"
PutResponse"8
ReinitializeTokenRequest
soPin (	
label (	"
ReinitializeTokenResponse""
SetupStoreRequest
soPin (	"
SetupStoreResponse2?
G2Diagnostic_
ClearLastException".g2ssadm.ClearLastExceptionRequest#.g2ssadm.ClearLastExceptionResponse" \\
CreateSaltInStore!.g2ssadm.CreateSaltInStoreRequest".g2ssadm.CreateSaltInStoreResponse" >
Destroy.g2ssadm.DestroyRequest.g2ssadm.DestroyResponse" Y
GetLastException .g2ssadm.GetLastExceptionRequest!.g2ssadm.GetLastExceptionResponse" e
GetLastExceptionCode$.g2ssadm.GetLastExceptionCodeRequest%.g2ssadm.GetLastExceptionCodeResponse" 5
Init.g2ssadm.InitRequest.g2ssadm.InitResponse" _
InitializeNewToken".g2ssadm.InitializeNewTokenRequest#.g2ssadm.InitializeNewTokenResponse" 5
List.g2ssadm.ListRequest.g2ssadm.ListResponse" 2
Put.g2ssadm.PutRequest.g2ssadm.PutResponse" \\
ReinitializeToken!.g2ssadm.ReinitializeTokenRequest".g2ssadm.ReinitializeTokenResponse" G

SetupStore.g2ssadm.SetupStoreRequest.g2ssadm.SetupStoreResponse" Bc
$com.senzing.g2.engine.grpc.G2SSAdminBG2SSAdminProtoPZ)github.com/senzing/g2-sdk-go-grpc/g2ssadmbproto3'
        , true);

        static::$is_initialized = true;
    }
}

