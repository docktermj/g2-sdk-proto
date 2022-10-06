# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: g2config.proto for package 'g2config'

require 'grpc'
require 'g2config_pb'

module G2config
  module G2Diagnostic
    class Service

      include ::GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'g2config.G2Diagnostic'

      rpc :AddDataSource, ::G2config::AddDataSourceRequest, ::G2config::AddDataSourceResponse
      rpc :ClearLastException, ::G2config::ClearLastExceptionRequest, ::G2config::ClearLastExceptionResponse
      rpc :Close, ::G2config::CloseRequest, ::G2config::CloseResponse
      rpc :Create, ::G2config::CreateRequest, ::G2config::CreateResponse
      rpc :DeleteDataSource, ::G2config::DeleteDataSourceRequest, ::G2config::DeleteDataSourceResponse
      rpc :Destroy, ::G2config::DestroyRequest, ::G2config::DestroyResponse
      rpc :GetLastException, ::G2config::GetLastExceptionRequest, ::G2config::GetLastExceptionResponse
      rpc :GetLastExceptionCode, ::G2config::GetLastExceptionCodeRequest, ::G2config::GetLastExceptionCodeResponse
      rpc :Init, ::G2config::InitRequest, ::G2config::InitResponse
      rpc :ListDataSources, ::G2config::ListDataSourcesRequest, ::G2config::ListDataSourcesResponse
      rpc :Load, ::G2config::LoadRequest, ::G2config::LoadResponse
      rpc :Save, ::G2config::SaveRequest, ::G2config::SaveResponse
    end

    Stub = Service.rpc_stub_class
  end
end