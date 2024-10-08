
// Generated by Akka gRPC. DO NOT EDIT.
package io.kx.loanapp.action;

import akka.actor.ClassicActorSystemProvider;
import akka.stream.Materializer;
import akka.stream.SystemMaterializer;

import akka.grpc.internal.*;
import akka.grpc.GrpcChannel;
import akka.grpc.GrpcClientCloseException;
import akka.grpc.GrpcClientSettings;
import akka.grpc.javadsl.AkkaGrpcClient;

import io.grpc.MethodDescriptor;

import static io.kx.loanapp.action.LoanAppServiceAction.Serializers.*;

import scala.concurrent.ExecutionContext;

import akka.grpc.AkkaGrpcGenerated;


import akka.grpc.javadsl.SingleResponseRequestBuilder;


@AkkaGrpcGenerated
public abstract class LoanAppServiceActionClient extends LoanAppServiceActionClientPowerApi implements LoanAppServiceAction, AkkaGrpcClient {
  public static final LoanAppServiceActionClient create(GrpcClientSettings settings, ClassicActorSystemProvider sys) {
    return new DefaultLoanAppServiceActionClient(akka.grpc.GrpcChannel$.MODULE$.apply(settings, sys), true, sys);
  }

  public static final LoanAppServiceActionClient create(GrpcChannel channel, ClassicActorSystemProvider sys) {
    return new DefaultLoanAppServiceActionClient(channel, false, sys);
  }

  @AkkaGrpcGenerated
  protected final static class DefaultLoanAppServiceActionClient extends LoanAppServiceActionClient {

      private final GrpcChannel channel;
      private final boolean isChannelOwned;
      private final GrpcClientSettings settings;
      private final io.grpc.CallOptions options;
      private final Materializer mat;
      private final ExecutionContext ec;

      private DefaultLoanAppServiceActionClient(GrpcChannel channel, boolean isChannelOwned, ClassicActorSystemProvider sys) {
        this.channel = channel;
        this.isChannelOwned = isChannelOwned;
        this.settings = channel.settings();
        this.mat = SystemMaterializer.get(sys).materializer();
        this.ec = sys.classicSystem().dispatcher();
        this.options = NettyClientUtils.callOptions(settings);

        sys.classicSystem().getWhenTerminated().whenComplete((v, e) -> close());
      }

  
    
      private final SingleResponseRequestBuilder<io.kx.loanapp.api.LoanAppApi.SubmitCommand, com.google.protobuf.Empty> submitLoanApplicationRequestBuilder(akka.grpc.internal.InternalChannel channel){
        return new JavaUnaryRequestBuilder<>(submitLoanApplicationDescriptor, channel, options, settings, ec);
      }
    
  
    
      private final SingleResponseRequestBuilder<io.kx.loanapp.api.LoanAppApi.DeclineCommand, com.google.protobuf.Empty> expireActionRequestBuilder(akka.grpc.internal.InternalChannel channel){
        return new JavaUnaryRequestBuilder<>(expireActionDescriptor, channel, options, settings, ec);
      }
    
  
    
      private final SingleResponseRequestBuilder<io.kx.loanapp.domain.LoanAppDomain.Approved, com.google.protobuf.Empty> cancelExpireTimerRequestBuilder(akka.grpc.internal.InternalChannel channel){
        return new JavaUnaryRequestBuilder<>(cancelExpireTimerDescriptor, channel, options, settings, ec);
      }
    
  

      

        /**
         * For access to method metadata use the parameterless version of submitLoanApplication
         */
        public java.util.concurrent.CompletionStage<com.google.protobuf.Empty> submitLoanApplication(io.kx.loanapp.api.LoanAppApi.SubmitCommand request) {
          return submitLoanApplication().invoke(request);
        }

        /**
         * Lower level "lifted" version of the method, giving access to request metadata etc.
         * prefer submitLoanApplication(io.kx.loanapp.api.LoanAppApi.SubmitCommand) if possible.
         */
        
          public SingleResponseRequestBuilder<io.kx.loanapp.api.LoanAppApi.SubmitCommand, com.google.protobuf.Empty> submitLoanApplication()
        
        {
          return submitLoanApplicationRequestBuilder(channel.internalChannel());
        }
      

        /**
         * For access to method metadata use the parameterless version of expireAction
         */
        public java.util.concurrent.CompletionStage<com.google.protobuf.Empty> expireAction(io.kx.loanapp.api.LoanAppApi.DeclineCommand request) {
          return expireAction().invoke(request);
        }

        /**
         * Lower level "lifted" version of the method, giving access to request metadata etc.
         * prefer expireAction(io.kx.loanapp.api.LoanAppApi.DeclineCommand) if possible.
         */
        
          public SingleResponseRequestBuilder<io.kx.loanapp.api.LoanAppApi.DeclineCommand, com.google.protobuf.Empty> expireAction()
        
        {
          return expireActionRequestBuilder(channel.internalChannel());
        }
      

        /**
         * For access to method metadata use the parameterless version of cancelExpireTimer
         */
        public java.util.concurrent.CompletionStage<com.google.protobuf.Empty> cancelExpireTimer(io.kx.loanapp.domain.LoanAppDomain.Approved request) {
          return cancelExpireTimer().invoke(request);
        }

        /**
         * Lower level "lifted" version of the method, giving access to request metadata etc.
         * prefer cancelExpireTimer(io.kx.loanapp.domain.LoanAppDomain.Approved) if possible.
         */
        
          public SingleResponseRequestBuilder<io.kx.loanapp.domain.LoanAppDomain.Approved, com.google.protobuf.Empty> cancelExpireTimer()
        
        {
          return cancelExpireTimerRequestBuilder(channel.internalChannel());
        }
      

      
        private static MethodDescriptor<io.kx.loanapp.api.LoanAppApi.SubmitCommand, com.google.protobuf.Empty> submitLoanApplicationDescriptor =
          MethodDescriptor.<io.kx.loanapp.api.LoanAppApi.SubmitCommand, com.google.protobuf.Empty>newBuilder()
            .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
            .setFullMethodName(MethodDescriptor.generateFullMethodName("io.kx.loanapp.action.LoanAppServiceAction", "SubmitLoanApplication"))
            .setRequestMarshaller(new ProtoMarshaller<io.kx.loanapp.api.LoanAppApi.SubmitCommand>(io_kx_loanapp_api_SubmitCommandSerializer))
            .setResponseMarshaller(new ProtoMarshaller<com.google.protobuf.Empty>(google_protobuf_EmptySerializer))
            .setSampledToLocalTracing(true)
            .build();
        
        private static MethodDescriptor<io.kx.loanapp.api.LoanAppApi.DeclineCommand, com.google.protobuf.Empty> expireActionDescriptor =
          MethodDescriptor.<io.kx.loanapp.api.LoanAppApi.DeclineCommand, com.google.protobuf.Empty>newBuilder()
            .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
            .setFullMethodName(MethodDescriptor.generateFullMethodName("io.kx.loanapp.action.LoanAppServiceAction", "ExpireAction"))
            .setRequestMarshaller(new ProtoMarshaller<io.kx.loanapp.api.LoanAppApi.DeclineCommand>(io_kx_loanapp_api_DeclineCommandSerializer))
            .setResponseMarshaller(new ProtoMarshaller<com.google.protobuf.Empty>(google_protobuf_EmptySerializer))
            .setSampledToLocalTracing(true)
            .build();
        
        private static MethodDescriptor<io.kx.loanapp.domain.LoanAppDomain.Approved, com.google.protobuf.Empty> cancelExpireTimerDescriptor =
          MethodDescriptor.<io.kx.loanapp.domain.LoanAppDomain.Approved, com.google.protobuf.Empty>newBuilder()
            .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
            .setFullMethodName(MethodDescriptor.generateFullMethodName("io.kx.loanapp.action.LoanAppServiceAction", "CancelExpireTimer"))
            .setRequestMarshaller(new ProtoMarshaller<io.kx.loanapp.domain.LoanAppDomain.Approved>(io_kx_loanapp_domain_ApprovedSerializer))
            .setResponseMarshaller(new ProtoMarshaller<com.google.protobuf.Empty>(google_protobuf_EmptySerializer))
            .setSampledToLocalTracing(true)
            .build();
        

      /**
       * Initiates a shutdown in which preexisting and new calls are cancelled.
       */
      public java.util.concurrent.CompletionStage<akka.Done> close() {
        if (isChannelOwned) {
          return channel.closeCS();
        } else {
          throw new GrpcClientCloseException();
        }
      }

     /**
      * Returns a CompletionState that completes successfully when shutdown via close()
      * or exceptionally if a connection can not be established after maxConnectionAttempts.
      */
      public java.util.concurrent.CompletionStage<akka.Done> closed() {
        return channel.closedCS();
      }
  }

}



