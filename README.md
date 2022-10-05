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

1. XXX

    ```console
    rm -rf ${SENZING_GPRC_GO_DIR:-/tmp/nowhere}
    mkdir -p ${SENZING_GPRC_GO_DIR}/out ${SENZING_GPRC_GO_DIR}/grpc

    protoc \
        --proto_path=${GIT_REPOSITORY_DIR} \
        --go_out=${SENZING_GPRC_GO_DIR}/out \
        --go_opt=paths=source_relative \
        --go-grpc_out=${SENZING_GPRC_GO_DIR}/grpc \
        --go-grpc_opt=paths=source_relative \
        g2config.proto \
        g2configmgr.proto \
        g2diagnostic.proto \
        g2engine.proto \
        g2hasher.proto \
        g2product.proto \
        g2ssadm.proto

    ```


1. If not yet done, install [protoc](https://grpc.io/docs/protoc-installation/)

## References

1. [Introduction to gRPC](https://grpc.io/docs/what-is-grpc/introduction/)
1. [Protocol Buffers Overview](https://developers.google.com/protocol-buffers/docs/overview)
    1. [Language Guide for proto3](https://developers.google.com/protocol-buffers/docs/proto3)
