// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: g2product.proto

#include "g2product.pb.h"
#include "g2product.grpc.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/channel_interface.h>
#include <grpcpp/impl/codegen/client_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/rpc_service_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/sync_stream.h>
namespace g2product {

static const char* G2Diagnostic_method_names[] = {
  "/g2product.G2Diagnostic/ClearLastException",
  "/g2product.G2Diagnostic/Destroy",
  "/g2product.G2Diagnostic/GetLastException",
  "/g2product.G2Diagnostic/GetLastExceptionCode",
  "/g2product.G2Diagnostic/Init",
  "/g2product.G2Diagnostic/License",
  "/g2product.G2Diagnostic/ValidateLicenseFile",
  "/g2product.G2Diagnostic/ValidateLicenseStringBase64",
  "/g2product.G2Diagnostic/Version",
};

std::unique_ptr< G2Diagnostic::Stub> G2Diagnostic::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< G2Diagnostic::Stub> stub(new G2Diagnostic::Stub(channel, options));
  return stub;
}

G2Diagnostic::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_ClearLastException_(G2Diagnostic_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_Destroy_(G2Diagnostic_method_names[1], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetLastException_(G2Diagnostic_method_names[2], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetLastExceptionCode_(G2Diagnostic_method_names[3], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_Init_(G2Diagnostic_method_names[4], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_License_(G2Diagnostic_method_names[5], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_ValidateLicenseFile_(G2Diagnostic_method_names[6], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_ValidateLicenseStringBase64_(G2Diagnostic_method_names[7], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_Version_(G2Diagnostic_method_names[8], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status G2Diagnostic::Stub::ClearLastException(::grpc::ClientContext* context, const ::g2product::ClearLastExceptionRequest& request, ::g2product::ClearLastExceptionResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2product::ClearLastExceptionRequest, ::g2product::ClearLastExceptionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_ClearLastException_, context, request, response);
}

void G2Diagnostic::Stub::async::ClearLastException(::grpc::ClientContext* context, const ::g2product::ClearLastExceptionRequest* request, ::g2product::ClearLastExceptionResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2product::ClearLastExceptionRequest, ::g2product::ClearLastExceptionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ClearLastException_, context, request, response, std::move(f));
}

void G2Diagnostic::Stub::async::ClearLastException(::grpc::ClientContext* context, const ::g2product::ClearLastExceptionRequest* request, ::g2product::ClearLastExceptionResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ClearLastException_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2product::ClearLastExceptionResponse>* G2Diagnostic::Stub::PrepareAsyncClearLastExceptionRaw(::grpc::ClientContext* context, const ::g2product::ClearLastExceptionRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2product::ClearLastExceptionResponse, ::g2product::ClearLastExceptionRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_ClearLastException_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2product::ClearLastExceptionResponse>* G2Diagnostic::Stub::AsyncClearLastExceptionRaw(::grpc::ClientContext* context, const ::g2product::ClearLastExceptionRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncClearLastExceptionRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2Diagnostic::Stub::Destroy(::grpc::ClientContext* context, const ::g2product::DestroyRequest& request, ::g2product::DestroyResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2product::DestroyRequest, ::g2product::DestroyResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_Destroy_, context, request, response);
}

void G2Diagnostic::Stub::async::Destroy(::grpc::ClientContext* context, const ::g2product::DestroyRequest* request, ::g2product::DestroyResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2product::DestroyRequest, ::g2product::DestroyResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Destroy_, context, request, response, std::move(f));
}

void G2Diagnostic::Stub::async::Destroy(::grpc::ClientContext* context, const ::g2product::DestroyRequest* request, ::g2product::DestroyResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Destroy_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2product::DestroyResponse>* G2Diagnostic::Stub::PrepareAsyncDestroyRaw(::grpc::ClientContext* context, const ::g2product::DestroyRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2product::DestroyResponse, ::g2product::DestroyRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_Destroy_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2product::DestroyResponse>* G2Diagnostic::Stub::AsyncDestroyRaw(::grpc::ClientContext* context, const ::g2product::DestroyRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncDestroyRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2Diagnostic::Stub::GetLastException(::grpc::ClientContext* context, const ::g2product::GetLastExceptionRequest& request, ::g2product::GetLastExceptionResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2product::GetLastExceptionRequest, ::g2product::GetLastExceptionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetLastException_, context, request, response);
}

void G2Diagnostic::Stub::async::GetLastException(::grpc::ClientContext* context, const ::g2product::GetLastExceptionRequest* request, ::g2product::GetLastExceptionResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2product::GetLastExceptionRequest, ::g2product::GetLastExceptionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetLastException_, context, request, response, std::move(f));
}

void G2Diagnostic::Stub::async::GetLastException(::grpc::ClientContext* context, const ::g2product::GetLastExceptionRequest* request, ::g2product::GetLastExceptionResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetLastException_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2product::GetLastExceptionResponse>* G2Diagnostic::Stub::PrepareAsyncGetLastExceptionRaw(::grpc::ClientContext* context, const ::g2product::GetLastExceptionRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2product::GetLastExceptionResponse, ::g2product::GetLastExceptionRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetLastException_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2product::GetLastExceptionResponse>* G2Diagnostic::Stub::AsyncGetLastExceptionRaw(::grpc::ClientContext* context, const ::g2product::GetLastExceptionRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetLastExceptionRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2Diagnostic::Stub::GetLastExceptionCode(::grpc::ClientContext* context, const ::g2product::GetLastExceptionCodeRequest& request, ::g2product::GetLastExceptionCodeResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2product::GetLastExceptionCodeRequest, ::g2product::GetLastExceptionCodeResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetLastExceptionCode_, context, request, response);
}

void G2Diagnostic::Stub::async::GetLastExceptionCode(::grpc::ClientContext* context, const ::g2product::GetLastExceptionCodeRequest* request, ::g2product::GetLastExceptionCodeResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2product::GetLastExceptionCodeRequest, ::g2product::GetLastExceptionCodeResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetLastExceptionCode_, context, request, response, std::move(f));
}

void G2Diagnostic::Stub::async::GetLastExceptionCode(::grpc::ClientContext* context, const ::g2product::GetLastExceptionCodeRequest* request, ::g2product::GetLastExceptionCodeResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetLastExceptionCode_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2product::GetLastExceptionCodeResponse>* G2Diagnostic::Stub::PrepareAsyncGetLastExceptionCodeRaw(::grpc::ClientContext* context, const ::g2product::GetLastExceptionCodeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2product::GetLastExceptionCodeResponse, ::g2product::GetLastExceptionCodeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetLastExceptionCode_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2product::GetLastExceptionCodeResponse>* G2Diagnostic::Stub::AsyncGetLastExceptionCodeRaw(::grpc::ClientContext* context, const ::g2product::GetLastExceptionCodeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetLastExceptionCodeRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2Diagnostic::Stub::Init(::grpc::ClientContext* context, const ::g2product::InitRequest& request, ::g2product::InitResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2product::InitRequest, ::g2product::InitResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_Init_, context, request, response);
}

void G2Diagnostic::Stub::async::Init(::grpc::ClientContext* context, const ::g2product::InitRequest* request, ::g2product::InitResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2product::InitRequest, ::g2product::InitResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Init_, context, request, response, std::move(f));
}

void G2Diagnostic::Stub::async::Init(::grpc::ClientContext* context, const ::g2product::InitRequest* request, ::g2product::InitResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Init_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2product::InitResponse>* G2Diagnostic::Stub::PrepareAsyncInitRaw(::grpc::ClientContext* context, const ::g2product::InitRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2product::InitResponse, ::g2product::InitRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_Init_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2product::InitResponse>* G2Diagnostic::Stub::AsyncInitRaw(::grpc::ClientContext* context, const ::g2product::InitRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncInitRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2Diagnostic::Stub::License(::grpc::ClientContext* context, const ::g2product::LicenseRequest& request, ::g2product::LicenseResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2product::LicenseRequest, ::g2product::LicenseResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_License_, context, request, response);
}

void G2Diagnostic::Stub::async::License(::grpc::ClientContext* context, const ::g2product::LicenseRequest* request, ::g2product::LicenseResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2product::LicenseRequest, ::g2product::LicenseResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_License_, context, request, response, std::move(f));
}

void G2Diagnostic::Stub::async::License(::grpc::ClientContext* context, const ::g2product::LicenseRequest* request, ::g2product::LicenseResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_License_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2product::LicenseResponse>* G2Diagnostic::Stub::PrepareAsyncLicenseRaw(::grpc::ClientContext* context, const ::g2product::LicenseRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2product::LicenseResponse, ::g2product::LicenseRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_License_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2product::LicenseResponse>* G2Diagnostic::Stub::AsyncLicenseRaw(::grpc::ClientContext* context, const ::g2product::LicenseRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncLicenseRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2Diagnostic::Stub::ValidateLicenseFile(::grpc::ClientContext* context, const ::g2product::ValidateLicenseFileRequest& request, ::g2product::ValidateLicenseFileResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2product::ValidateLicenseFileRequest, ::g2product::ValidateLicenseFileResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_ValidateLicenseFile_, context, request, response);
}

void G2Diagnostic::Stub::async::ValidateLicenseFile(::grpc::ClientContext* context, const ::g2product::ValidateLicenseFileRequest* request, ::g2product::ValidateLicenseFileResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2product::ValidateLicenseFileRequest, ::g2product::ValidateLicenseFileResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ValidateLicenseFile_, context, request, response, std::move(f));
}

void G2Diagnostic::Stub::async::ValidateLicenseFile(::grpc::ClientContext* context, const ::g2product::ValidateLicenseFileRequest* request, ::g2product::ValidateLicenseFileResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ValidateLicenseFile_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2product::ValidateLicenseFileResponse>* G2Diagnostic::Stub::PrepareAsyncValidateLicenseFileRaw(::grpc::ClientContext* context, const ::g2product::ValidateLicenseFileRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2product::ValidateLicenseFileResponse, ::g2product::ValidateLicenseFileRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_ValidateLicenseFile_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2product::ValidateLicenseFileResponse>* G2Diagnostic::Stub::AsyncValidateLicenseFileRaw(::grpc::ClientContext* context, const ::g2product::ValidateLicenseFileRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncValidateLicenseFileRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2Diagnostic::Stub::ValidateLicenseStringBase64(::grpc::ClientContext* context, const ::g2product::ValidateLicenseStringBase64Request& request, ::g2product::ValidateLicenseStringBase64Response* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2product::ValidateLicenseStringBase64Request, ::g2product::ValidateLicenseStringBase64Response, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_ValidateLicenseStringBase64_, context, request, response);
}

void G2Diagnostic::Stub::async::ValidateLicenseStringBase64(::grpc::ClientContext* context, const ::g2product::ValidateLicenseStringBase64Request* request, ::g2product::ValidateLicenseStringBase64Response* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2product::ValidateLicenseStringBase64Request, ::g2product::ValidateLicenseStringBase64Response, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ValidateLicenseStringBase64_, context, request, response, std::move(f));
}

void G2Diagnostic::Stub::async::ValidateLicenseStringBase64(::grpc::ClientContext* context, const ::g2product::ValidateLicenseStringBase64Request* request, ::g2product::ValidateLicenseStringBase64Response* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ValidateLicenseStringBase64_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2product::ValidateLicenseStringBase64Response>* G2Diagnostic::Stub::PrepareAsyncValidateLicenseStringBase64Raw(::grpc::ClientContext* context, const ::g2product::ValidateLicenseStringBase64Request& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2product::ValidateLicenseStringBase64Response, ::g2product::ValidateLicenseStringBase64Request, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_ValidateLicenseStringBase64_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2product::ValidateLicenseStringBase64Response>* G2Diagnostic::Stub::AsyncValidateLicenseStringBase64Raw(::grpc::ClientContext* context, const ::g2product::ValidateLicenseStringBase64Request& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncValidateLicenseStringBase64Raw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2Diagnostic::Stub::Version(::grpc::ClientContext* context, const ::g2product::VersionRequest& request, ::g2product::VersionResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2product::VersionRequest, ::g2product::VersionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_Version_, context, request, response);
}

void G2Diagnostic::Stub::async::Version(::grpc::ClientContext* context, const ::g2product::VersionRequest* request, ::g2product::VersionResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2product::VersionRequest, ::g2product::VersionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Version_, context, request, response, std::move(f));
}

void G2Diagnostic::Stub::async::Version(::grpc::ClientContext* context, const ::g2product::VersionRequest* request, ::g2product::VersionResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Version_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2product::VersionResponse>* G2Diagnostic::Stub::PrepareAsyncVersionRaw(::grpc::ClientContext* context, const ::g2product::VersionRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2product::VersionResponse, ::g2product::VersionRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_Version_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2product::VersionResponse>* G2Diagnostic::Stub::AsyncVersionRaw(::grpc::ClientContext* context, const ::g2product::VersionRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncVersionRaw(context, request, cq);
  result->StartCall();
  return result;
}

G2Diagnostic::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2Diagnostic_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2Diagnostic::Service, ::g2product::ClearLastExceptionRequest, ::g2product::ClearLastExceptionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2Diagnostic::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2product::ClearLastExceptionRequest* req,
             ::g2product::ClearLastExceptionResponse* resp) {
               return service->ClearLastException(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2Diagnostic_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2Diagnostic::Service, ::g2product::DestroyRequest, ::g2product::DestroyResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2Diagnostic::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2product::DestroyRequest* req,
             ::g2product::DestroyResponse* resp) {
               return service->Destroy(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2Diagnostic_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2Diagnostic::Service, ::g2product::GetLastExceptionRequest, ::g2product::GetLastExceptionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2Diagnostic::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2product::GetLastExceptionRequest* req,
             ::g2product::GetLastExceptionResponse* resp) {
               return service->GetLastException(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2Diagnostic_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2Diagnostic::Service, ::g2product::GetLastExceptionCodeRequest, ::g2product::GetLastExceptionCodeResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2Diagnostic::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2product::GetLastExceptionCodeRequest* req,
             ::g2product::GetLastExceptionCodeResponse* resp) {
               return service->GetLastExceptionCode(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2Diagnostic_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2Diagnostic::Service, ::g2product::InitRequest, ::g2product::InitResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2Diagnostic::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2product::InitRequest* req,
             ::g2product::InitResponse* resp) {
               return service->Init(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2Diagnostic_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2Diagnostic::Service, ::g2product::LicenseRequest, ::g2product::LicenseResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2Diagnostic::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2product::LicenseRequest* req,
             ::g2product::LicenseResponse* resp) {
               return service->License(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2Diagnostic_method_names[6],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2Diagnostic::Service, ::g2product::ValidateLicenseFileRequest, ::g2product::ValidateLicenseFileResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2Diagnostic::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2product::ValidateLicenseFileRequest* req,
             ::g2product::ValidateLicenseFileResponse* resp) {
               return service->ValidateLicenseFile(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2Diagnostic_method_names[7],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2Diagnostic::Service, ::g2product::ValidateLicenseStringBase64Request, ::g2product::ValidateLicenseStringBase64Response, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2Diagnostic::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2product::ValidateLicenseStringBase64Request* req,
             ::g2product::ValidateLicenseStringBase64Response* resp) {
               return service->ValidateLicenseStringBase64(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2Diagnostic_method_names[8],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2Diagnostic::Service, ::g2product::VersionRequest, ::g2product::VersionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2Diagnostic::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2product::VersionRequest* req,
             ::g2product::VersionResponse* resp) {
               return service->Version(ctx, req, resp);
             }, this)));
}

G2Diagnostic::Service::~Service() {
}

::grpc::Status G2Diagnostic::Service::ClearLastException(::grpc::ServerContext* context, const ::g2product::ClearLastExceptionRequest* request, ::g2product::ClearLastExceptionResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2Diagnostic::Service::Destroy(::grpc::ServerContext* context, const ::g2product::DestroyRequest* request, ::g2product::DestroyResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2Diagnostic::Service::GetLastException(::grpc::ServerContext* context, const ::g2product::GetLastExceptionRequest* request, ::g2product::GetLastExceptionResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2Diagnostic::Service::GetLastExceptionCode(::grpc::ServerContext* context, const ::g2product::GetLastExceptionCodeRequest* request, ::g2product::GetLastExceptionCodeResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2Diagnostic::Service::Init(::grpc::ServerContext* context, const ::g2product::InitRequest* request, ::g2product::InitResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2Diagnostic::Service::License(::grpc::ServerContext* context, const ::g2product::LicenseRequest* request, ::g2product::LicenseResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2Diagnostic::Service::ValidateLicenseFile(::grpc::ServerContext* context, const ::g2product::ValidateLicenseFileRequest* request, ::g2product::ValidateLicenseFileResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2Diagnostic::Service::ValidateLicenseStringBase64(::grpc::ServerContext* context, const ::g2product::ValidateLicenseStringBase64Request* request, ::g2product::ValidateLicenseStringBase64Response* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2Diagnostic::Service::Version(::grpc::ServerContext* context, const ::g2product::VersionRequest* request, ::g2product::VersionResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace g2product

