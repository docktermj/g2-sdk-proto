# g2-sdk-proto



### Clone repository

1. Set these environment variable values:

    ```console
    export GIT_ACCOUNT=docktermj
    export GIT_REPOSITORY=g2-sdk-proto
    export GIT_ACCOUNT_DIR=~/${GIT_ACCOUNT}.git
    export GIT_REPOSITORY_DIR="${GIT_ACCOUNT_DIR}/${GIT_REPOSITORY}"
    ```

1. Using the environment variables values just set, follow steps in [clone-repository](https://github.com/Senzing/knowledge-base/blob/main/HOWTO/clone-repository.md) to install the Git repository.

## Language

### Go

1. [Clone repository](#clone-repository).
1. Follow the
   [Go Quick start](https://grpc.io/docs/languages/go/quickstart/)
   tutorial to prepare an environment.
1. :pencil2: Specify a directory for Protocol Buffer Compiler output.
   Example:

    ```console
    export SENZING_GPRC_GO_DIR=~/g2-sdk-go-grpc
    ```

1. [Generating client and server code](https://grpc.io/docs/languages/go/basics/#generating-client-and-server-code).
   Example:

    ```console
    export SENZING_OUTPUT_DIR=${GIT_REPOSITORY_DIR}/bindings/go
    mkdir -p ${SENZING_OUTPUT_DIR}

    protoc \
        --proto_path=${GIT_REPOSITORY_DIR} \
        --go_out=${SENZING_OUTPUT_DIR} \
        --go_opt=paths=source_relative \
        --go-grpc_out=${SENZING_OUTPUT_DIR} \
        --go-grpc_opt=paths=source_relative \
        g2config.proto \
        g2configmgr.proto \
        g2diagnostic.proto \
        g2engine.proto \
        g2hasher.proto \
        g2product.proto \
        g2ssadm.proto

    ```

    1. The `.../grpc` directory contains the following:
        - Interface types (or stubs) for clients to call with the methods defined in the services.
        - Interface types for servers to implement, also with the methods defined in the services.
    1. The `.../out` directory contains the following:
        - protocol buffer code to populate, serialize, and retrieve request and response message types.




Creating the server


1. If not yet done, install [protoc](https://grpc.io/docs/protoc-installation/)

## References

1. [Introduction to gRPC](https://grpc.io/docs/what-is-grpc/introduction/)
1. [Protocol Buffers Overview](https://developers.google.com/protocol-buffers/docs/overview)
    1. [Language Guide for proto3](https://developers.google.com/protocol-buffers/docs/proto3)
