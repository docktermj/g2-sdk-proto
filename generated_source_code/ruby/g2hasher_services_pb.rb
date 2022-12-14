# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: g2hasher.proto for package 'g2hasher'

require 'grpc'
require 'g2hasher_pb'

module G2hasher
  module G2Diagnostic
    class Service

      include ::GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'g2hasher.G2Diagnostic'

      rpc :ClearLastException, ::G2hasher::ClearLastExceptionRequest, ::G2hasher::ClearLastExceptionResponse
      rpc :Destroy, ::G2hasher::DestroyRequest, ::G2hasher::DestroyResponse
      rpc :ExportTokenLibrary, ::G2hasher::ExportTokenLibraryRequest, ::G2hasher::ExportTokenLibraryResponse
      rpc :GetLastException, ::G2hasher::GetLastExceptionRequest, ::G2hasher::GetLastExceptionResponse
      rpc :GetLastExceptionCode, ::G2hasher::GetLastExceptionCodeRequest, ::G2hasher::GetLastExceptionCodeResponse
      rpc :Init, ::G2hasher::InitRequest, ::G2hasher::InitResponse
      rpc :InitWithConfig, ::G2hasher::InitWithConfigRequest, ::G2hasher::InitWithConfigResponse
      rpc :Process, ::G2hasher::ProcessRequest, ::G2hasher::ProcessResponse
    end

    Stub = Service.rpc_stub_class
  end
end
