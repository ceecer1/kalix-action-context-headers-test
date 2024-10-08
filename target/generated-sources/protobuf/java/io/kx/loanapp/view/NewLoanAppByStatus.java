
// Generated by Akka gRPC. DO NOT EDIT.
package io.kx.loanapp.view;

import akka.grpc.ProtobufSerializer;
import akka.grpc.javadsl.GoogleProtobufSerializer;

import akka.grpc.AkkaGrpcGenerated;


public interface NewLoanAppByStatus {
  
  
  java.util.concurrent.CompletionStage<io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewResponse> getLoanAppByStatus(io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest in);
  
  
  java.util.concurrent.CompletionStage<io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewState> onSubmitted(io.kx.loanapp.domain.LoanAppDomain.Submitted in);
  
  
  java.util.concurrent.CompletionStage<io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewState> onApproved(io.kx.loanapp.domain.LoanAppDomain.Approved in);
  
  
  java.util.concurrent.CompletionStage<io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewState> ignoreOtherEvents(com.google.protobuf.Any in);
  

  static String name = "io.kx.loanapp.view.NewLoanAppByStatus";
  static akka.grpc.ServiceDescription description = new akka.grpc.internal.ServiceDescriptionImpl(name, NewLoanAppViewByStatusModel.getDescriptor());

  @AkkaGrpcGenerated
  public static class Serializers {
    
      public static ProtobufSerializer<io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest> GetLoanAppStatusRequestSerializer = new GoogleProtobufSerializer<>(io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest.parser());
    
      public static ProtobufSerializer<io.kx.loanapp.domain.LoanAppDomain.Submitted> io_kx_loanapp_domain_SubmittedSerializer = new GoogleProtobufSerializer<>(io.kx.loanapp.domain.LoanAppDomain.Submitted.parser());
    
      public static ProtobufSerializer<io.kx.loanapp.domain.LoanAppDomain.Approved> io_kx_loanapp_domain_ApprovedSerializer = new GoogleProtobufSerializer<>(io.kx.loanapp.domain.LoanAppDomain.Approved.parser());
    
      public static ProtobufSerializer<com.google.protobuf.Any> google_protobuf_AnySerializer = new GoogleProtobufSerializer<>(com.google.protobuf.Any.parser());
    
      public static ProtobufSerializer<io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewResponse> NewLoanAppViewResponseSerializer = new GoogleProtobufSerializer<>(io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewResponse.parser());
    
      public static ProtobufSerializer<io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewState> NewLoanAppViewStateSerializer = new GoogleProtobufSerializer<>(io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewState.parser());
    
  }
}
