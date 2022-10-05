# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import g2hasher_pb2 as g2hasher__pb2


class G2DiagnosticStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.ClearLastException = channel.unary_unary(
                '/g2hasher.G2Diagnostic/ClearLastException',
                request_serializer=g2hasher__pb2.ClearLastExceptionRequest.SerializeToString,
                response_deserializer=g2hasher__pb2.ClearLastExceptionResponse.FromString,
                )
        self.Destroy = channel.unary_unary(
                '/g2hasher.G2Diagnostic/Destroy',
                request_serializer=g2hasher__pb2.DestroyRequest.SerializeToString,
                response_deserializer=g2hasher__pb2.DestroyResponse.FromString,
                )
        self.ExportTokenLibrary = channel.unary_unary(
                '/g2hasher.G2Diagnostic/ExportTokenLibrary',
                request_serializer=g2hasher__pb2.ExportTokenLibraryRequest.SerializeToString,
                response_deserializer=g2hasher__pb2.ExportTokenLibraryResponse.FromString,
                )
        self.GetLastException = channel.unary_unary(
                '/g2hasher.G2Diagnostic/GetLastException',
                request_serializer=g2hasher__pb2.GetLastExceptionRequest.SerializeToString,
                response_deserializer=g2hasher__pb2.GetLastExceptionResponse.FromString,
                )
        self.GetLastExceptionCode = channel.unary_unary(
                '/g2hasher.G2Diagnostic/GetLastExceptionCode',
                request_serializer=g2hasher__pb2.GetLastExceptionCodeRequest.SerializeToString,
                response_deserializer=g2hasher__pb2.GetLastExceptionCodeResponse.FromString,
                )
        self.Init = channel.unary_unary(
                '/g2hasher.G2Diagnostic/Init',
                request_serializer=g2hasher__pb2.InitRequest.SerializeToString,
                response_deserializer=g2hasher__pb2.InitResponse.FromString,
                )
        self.InitWithConfig = channel.unary_unary(
                '/g2hasher.G2Diagnostic/InitWithConfig',
                request_serializer=g2hasher__pb2.InitWithConfigRequest.SerializeToString,
                response_deserializer=g2hasher__pb2.InitWithConfigResponse.FromString,
                )
        self.Process = channel.unary_unary(
                '/g2hasher.G2Diagnostic/Process',
                request_serializer=g2hasher__pb2.ProcessRequest.SerializeToString,
                response_deserializer=g2hasher__pb2.ProcessResponse.FromString,
                )


class G2DiagnosticServicer(object):
    """Missing associated documentation comment in .proto file."""

    def ClearLastException(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Destroy(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ExportTokenLibrary(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetLastException(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetLastExceptionCode(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Init(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def InitWithConfig(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Process(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_G2DiagnosticServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'ClearLastException': grpc.unary_unary_rpc_method_handler(
                    servicer.ClearLastException,
                    request_deserializer=g2hasher__pb2.ClearLastExceptionRequest.FromString,
                    response_serializer=g2hasher__pb2.ClearLastExceptionResponse.SerializeToString,
            ),
            'Destroy': grpc.unary_unary_rpc_method_handler(
                    servicer.Destroy,
                    request_deserializer=g2hasher__pb2.DestroyRequest.FromString,
                    response_serializer=g2hasher__pb2.DestroyResponse.SerializeToString,
            ),
            'ExportTokenLibrary': grpc.unary_unary_rpc_method_handler(
                    servicer.ExportTokenLibrary,
                    request_deserializer=g2hasher__pb2.ExportTokenLibraryRequest.FromString,
                    response_serializer=g2hasher__pb2.ExportTokenLibraryResponse.SerializeToString,
            ),
            'GetLastException': grpc.unary_unary_rpc_method_handler(
                    servicer.GetLastException,
                    request_deserializer=g2hasher__pb2.GetLastExceptionRequest.FromString,
                    response_serializer=g2hasher__pb2.GetLastExceptionResponse.SerializeToString,
            ),
            'GetLastExceptionCode': grpc.unary_unary_rpc_method_handler(
                    servicer.GetLastExceptionCode,
                    request_deserializer=g2hasher__pb2.GetLastExceptionCodeRequest.FromString,
                    response_serializer=g2hasher__pb2.GetLastExceptionCodeResponse.SerializeToString,
            ),
            'Init': grpc.unary_unary_rpc_method_handler(
                    servicer.Init,
                    request_deserializer=g2hasher__pb2.InitRequest.FromString,
                    response_serializer=g2hasher__pb2.InitResponse.SerializeToString,
            ),
            'InitWithConfig': grpc.unary_unary_rpc_method_handler(
                    servicer.InitWithConfig,
                    request_deserializer=g2hasher__pb2.InitWithConfigRequest.FromString,
                    response_serializer=g2hasher__pb2.InitWithConfigResponse.SerializeToString,
            ),
            'Process': grpc.unary_unary_rpc_method_handler(
                    servicer.Process,
                    request_deserializer=g2hasher__pb2.ProcessRequest.FromString,
                    response_serializer=g2hasher__pb2.ProcessResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'g2hasher.G2Diagnostic', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class G2Diagnostic(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def ClearLastException(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/g2hasher.G2Diagnostic/ClearLastException',
            g2hasher__pb2.ClearLastExceptionRequest.SerializeToString,
            g2hasher__pb2.ClearLastExceptionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Destroy(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/g2hasher.G2Diagnostic/Destroy',
            g2hasher__pb2.DestroyRequest.SerializeToString,
            g2hasher__pb2.DestroyResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ExportTokenLibrary(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/g2hasher.G2Diagnostic/ExportTokenLibrary',
            g2hasher__pb2.ExportTokenLibraryRequest.SerializeToString,
            g2hasher__pb2.ExportTokenLibraryResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetLastException(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/g2hasher.G2Diagnostic/GetLastException',
            g2hasher__pb2.GetLastExceptionRequest.SerializeToString,
            g2hasher__pb2.GetLastExceptionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetLastExceptionCode(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/g2hasher.G2Diagnostic/GetLastExceptionCode',
            g2hasher__pb2.GetLastExceptionCodeRequest.SerializeToString,
            g2hasher__pb2.GetLastExceptionCodeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Init(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/g2hasher.G2Diagnostic/Init',
            g2hasher__pb2.InitRequest.SerializeToString,
            g2hasher__pb2.InitResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def InitWithConfig(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/g2hasher.G2Diagnostic/InitWithConfig',
            g2hasher__pb2.InitWithConfigRequest.SerializeToString,
            g2hasher__pb2.InitWithConfigResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Process(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/g2hasher.G2Diagnostic/Process',
            g2hasher__pb2.ProcessRequest.SerializeToString,
            g2hasher__pb2.ProcessResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
