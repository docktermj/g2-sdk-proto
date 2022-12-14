# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2product.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("g2product.proto", :syntax => :proto3) do
    add_message "g2product.ClearLastExceptionRequest" do
    end
    add_message "g2product.ClearLastExceptionResponse" do
    end
    add_message "g2product.DestroyRequest" do
    end
    add_message "g2product.DestroyResponse" do
    end
    add_message "g2product.GetLastExceptionRequest" do
    end
    add_message "g2product.GetLastExceptionResponse" do
      optional :result, :string, 1
    end
    add_message "g2product.GetLastExceptionCodeRequest" do
    end
    add_message "g2product.GetLastExceptionCodeResponse" do
      optional :configID, :int32, 1
    end
    add_message "g2product.InitRequest" do
      optional :moduleName, :string, 1
      optional :iniParams, :string, 2
      optional :verboseLogging, :int32, 3
    end
    add_message "g2product.InitResponse" do
    end
    add_message "g2product.LicenseRequest" do
    end
    add_message "g2product.LicenseResponse" do
      optional :result, :string, 1
    end
    add_message "g2product.ValidateLicenseFileRequest" do
      optional :licenseFilePath, :string, 1
    end
    add_message "g2product.ValidateLicenseFileResponse" do
      optional :result, :string, 1
    end
    add_message "g2product.ValidateLicenseStringBase64Request" do
      optional :licenseString, :string, 1
    end
    add_message "g2product.ValidateLicenseStringBase64Response" do
      optional :result, :string, 1
    end
    add_message "g2product.VersionRequest" do
    end
    add_message "g2product.VersionResponse" do
      optional :result, :string, 1
    end
  end
end

module G2product
  ClearLastExceptionRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.ClearLastExceptionRequest").msgclass
  ClearLastExceptionResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.ClearLastExceptionResponse").msgclass
  DestroyRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.DestroyRequest").msgclass
  DestroyResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.DestroyResponse").msgclass
  GetLastExceptionRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.GetLastExceptionRequest").msgclass
  GetLastExceptionResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.GetLastExceptionResponse").msgclass
  GetLastExceptionCodeRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.GetLastExceptionCodeRequest").msgclass
  GetLastExceptionCodeResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.GetLastExceptionCodeResponse").msgclass
  InitRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.InitRequest").msgclass
  InitResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.InitResponse").msgclass
  LicenseRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.LicenseRequest").msgclass
  LicenseResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.LicenseResponse").msgclass
  ValidateLicenseFileRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.ValidateLicenseFileRequest").msgclass
  ValidateLicenseFileResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.ValidateLicenseFileResponse").msgclass
  ValidateLicenseStringBase64Request = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.ValidateLicenseStringBase64Request").msgclass
  ValidateLicenseStringBase64Response = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.ValidateLicenseStringBase64Response").msgclass
  VersionRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.VersionRequest").msgclass
  VersionResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("g2product.VersionResponse").msgclass
end
