package io.kx.loanapp;

import akka.grpc.javadsl.SingleResponseRequestBuilder;
import kalix.javasdk.Context;
import kalix.javasdk.DeferredCall;
import kalix.javasdk.Metadata;
import kalix.javasdk.impl.GrpcDeferredCall;
import kalix.javasdk.impl.InternalContext;
import kalix.javasdk.impl.MetadataImpl;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * Not intended for direct instantiation, called by generated code, use Action.components() to access
 */
public final class ComponentsImpl implements Components {

  private final InternalContext context;

  public ComponentsImpl(Context context) {
    this.context = (InternalContext) context;
  }

  private <T> T getGrpcClient(Class<T> serviceClass) {
    return context.getComponentGrpcClient(serviceClass);
  }

  private <Req, Res> SingleResponseRequestBuilder<Req, Res> addHeaders(SingleResponseRequestBuilder<Req, Res> requestBuilder, Metadata metadata){
    SingleResponseRequestBuilder<Req, Res> updatedBuilder = requestBuilder;
    for (Metadata.MetadataEntry entry: metadata){
      if (entry.isText()) {
        updatedBuilder = updatedBuilder.addHeader(entry.getKey(), entry.getValue());
      }
    }
    return updatedBuilder;
  }

  @Override
  public Components.LoanAppByStatusViewCalls loanAppByStatusView() {
    return new LoanAppByStatusViewCallsImpl();
  }
  @Override
  public Components.LoanAppEntityCalls loanAppEntity() {
    return new LoanAppEntityCallsImpl();
  }
  @Override
  public Components.LoanAppServiceActionImplCalls loanAppServiceActionImpl() {
    return new LoanAppServiceActionImplCallsImpl();
  }
  @Override
  public Components.NewLoanAppByStatusViewCalls newLoanAppByStatusView() {
    return new NewLoanAppByStatusViewCallsImpl();
  }
  @Override
  public Components.ReLoanAppByStatusViewCalls reLoanAppByStatusView() {
    return new ReLoanAppByStatusViewCallsImpl();
  }

  private final class LoanAppByStatusViewCallsImpl implements Components.LoanAppByStatusViewCalls {
     @Override
    public DeferredCall<io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest, io.kx.loanapp.view.LoanAppViewByStatusModel.LoanAppViewResponse> getLoanAppByStatus(io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest getLoanAppStatusRequest) {
      return new GrpcDeferredCall<>(
        getLoanAppStatusRequest,
        context.componentCallMetadata(),
        "io.kx.loanapp.view.LoanAppByStatus",
        "GetLoanAppByStatus",
        (Metadata metadata) -> {
          io.kx.loanapp.view.LoanAppByStatus client = getGrpcClient(io.kx.loanapp.view.LoanAppByStatus.class);
          if (client instanceof io.kx.loanapp.view.LoanAppByStatusClient) {
            return addHeaders(((io.kx.loanapp.view.LoanAppByStatusClient) client).getLoanAppByStatus(), metadata).invoke(getLoanAppStatusRequest);
          } else {
            // only for tests with mocked client implementation
            return client.getLoanAppByStatus(getLoanAppStatusRequest);
          }
        }
      );
    }
  }
  private final class LoanAppEntityCallsImpl implements Components.LoanAppEntityCalls {
     @Override
    public DeferredCall<io.kx.loanapp.api.LoanAppApi.SubmitCommand, com.google.protobuf.Empty> submit(io.kx.loanapp.api.LoanAppApi.SubmitCommand submitCommand) {
      return new GrpcDeferredCall<>(
        submitCommand,
        context.componentCallMetadata(),
        "io.kx.loanapp.api.LoanAppService",
        "Submit",
        (Metadata metadata) -> {
          io.kx.loanapp.api.LoanAppService client = getGrpcClient(io.kx.loanapp.api.LoanAppService.class);
          if (client instanceof io.kx.loanapp.api.LoanAppServiceClient) {
            return addHeaders(((io.kx.loanapp.api.LoanAppServiceClient) client).submit(), metadata).invoke(submitCommand);
          } else {
            // only for tests with mocked client implementation
            return client.submit(submitCommand);
          }
        }
      );
    }
    @Override
    public DeferredCall<io.kx.loanapp.api.LoanAppApi.GetCommand, io.kx.loanapp.api.LoanAppApi.LoanAppState> get(io.kx.loanapp.api.LoanAppApi.GetCommand getCommand) {
      return new GrpcDeferredCall<>(
        getCommand,
        context.componentCallMetadata(),
        "io.kx.loanapp.api.LoanAppService",
        "Get",
        (Metadata metadata) -> {
          io.kx.loanapp.api.LoanAppService client = getGrpcClient(io.kx.loanapp.api.LoanAppService.class);
          if (client instanceof io.kx.loanapp.api.LoanAppServiceClient) {
            return addHeaders(((io.kx.loanapp.api.LoanAppServiceClient) client).get(), metadata).invoke(getCommand);
          } else {
            // only for tests with mocked client implementation
            return client.get(getCommand);
          }
        }
      );
    }
    @Override
    public DeferredCall<io.kx.loanapp.api.LoanAppApi.ApproveCommand, com.google.protobuf.Empty> approve(io.kx.loanapp.api.LoanAppApi.ApproveCommand approveCommand) {
      return new GrpcDeferredCall<>(
        approveCommand,
        context.componentCallMetadata(),
        "io.kx.loanapp.api.LoanAppService",
        "Approve",
        (Metadata metadata) -> {
          io.kx.loanapp.api.LoanAppService client = getGrpcClient(io.kx.loanapp.api.LoanAppService.class);
          if (client instanceof io.kx.loanapp.api.LoanAppServiceClient) {
            return addHeaders(((io.kx.loanapp.api.LoanAppServiceClient) client).approve(), metadata).invoke(approveCommand);
          } else {
            // only for tests with mocked client implementation
            return client.approve(approveCommand);
          }
        }
      );
    }
    @Override
    public DeferredCall<io.kx.loanapp.api.LoanAppApi.DeclineCommand, com.google.protobuf.Empty> decline(io.kx.loanapp.api.LoanAppApi.DeclineCommand declineCommand) {
      return new GrpcDeferredCall<>(
        declineCommand,
        context.componentCallMetadata(),
        "io.kx.loanapp.api.LoanAppService",
        "Decline",
        (Metadata metadata) -> {
          io.kx.loanapp.api.LoanAppService client = getGrpcClient(io.kx.loanapp.api.LoanAppService.class);
          if (client instanceof io.kx.loanapp.api.LoanAppServiceClient) {
            return addHeaders(((io.kx.loanapp.api.LoanAppServiceClient) client).decline(), metadata).invoke(declineCommand);
          } else {
            // only for tests with mocked client implementation
            return client.decline(declineCommand);
          }
        }
      );
    }
  }
  private final class LoanAppServiceActionImplCallsImpl implements Components.LoanAppServiceActionImplCalls {
     @Override
    public DeferredCall<io.kx.loanapp.api.LoanAppApi.SubmitCommand, com.google.protobuf.Empty> submitLoanApplication(io.kx.loanapp.api.LoanAppApi.SubmitCommand submitCommand) {
      return new GrpcDeferredCall<>(
        submitCommand,
        context.componentCallMetadata(),
        "io.kx.loanapp.action.LoanAppServiceAction",
        "SubmitLoanApplication",
        (Metadata metadata) -> {
          io.kx.loanapp.action.LoanAppServiceAction client = getGrpcClient(io.kx.loanapp.action.LoanAppServiceAction.class);
          if (client instanceof io.kx.loanapp.action.LoanAppServiceActionClient) {
            return addHeaders(((io.kx.loanapp.action.LoanAppServiceActionClient) client).submitLoanApplication(), metadata).invoke(submitCommand);
          } else {
            // only for tests with mocked client implementation
            return client.submitLoanApplication(submitCommand);
          }
        }
      );
    }
    @Override
    public DeferredCall<io.kx.loanapp.api.LoanAppApi.DeclineCommand, com.google.protobuf.Empty> expireAction(io.kx.loanapp.api.LoanAppApi.DeclineCommand declineCommand) {
      return new GrpcDeferredCall<>(
        declineCommand,
        context.componentCallMetadata(),
        "io.kx.loanapp.action.LoanAppServiceAction",
        "ExpireAction",
        (Metadata metadata) -> {
          io.kx.loanapp.action.LoanAppServiceAction client = getGrpcClient(io.kx.loanapp.action.LoanAppServiceAction.class);
          if (client instanceof io.kx.loanapp.action.LoanAppServiceActionClient) {
            return addHeaders(((io.kx.loanapp.action.LoanAppServiceActionClient) client).expireAction(), metadata).invoke(declineCommand);
          } else {
            // only for tests with mocked client implementation
            return client.expireAction(declineCommand);
          }
        }
      );
    }
    @Override
    public DeferredCall<io.kx.loanapp.domain.LoanAppDomain.Approved, com.google.protobuf.Empty> cancelExpireTimer(io.kx.loanapp.domain.LoanAppDomain.Approved approved) {
      return new GrpcDeferredCall<>(
        approved,
        context.componentCallMetadata(),
        "io.kx.loanapp.action.LoanAppServiceAction",
        "CancelExpireTimer",
        (Metadata metadata) -> {
          io.kx.loanapp.action.LoanAppServiceAction client = getGrpcClient(io.kx.loanapp.action.LoanAppServiceAction.class);
          if (client instanceof io.kx.loanapp.action.LoanAppServiceActionClient) {
            return addHeaders(((io.kx.loanapp.action.LoanAppServiceActionClient) client).cancelExpireTimer(), metadata).invoke(approved);
          } else {
            // only for tests with mocked client implementation
            return client.cancelExpireTimer(approved);
          }
        }
      );
    }
  }
  private final class NewLoanAppByStatusViewCallsImpl implements Components.NewLoanAppByStatusViewCalls {
     @Override
    public DeferredCall<io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest, io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewResponse> getLoanAppByStatus(io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest getLoanAppStatusRequest) {
      return new GrpcDeferredCall<>(
        getLoanAppStatusRequest,
        context.componentCallMetadata(),
        "io.kx.loanapp.view.NewLoanAppByStatus",
        "GetLoanAppByStatus",
        (Metadata metadata) -> {
          io.kx.loanapp.view.NewLoanAppByStatus client = getGrpcClient(io.kx.loanapp.view.NewLoanAppByStatus.class);
          if (client instanceof io.kx.loanapp.view.NewLoanAppByStatusClient) {
            return addHeaders(((io.kx.loanapp.view.NewLoanAppByStatusClient) client).getLoanAppByStatus(), metadata).invoke(getLoanAppStatusRequest);
          } else {
            // only for tests with mocked client implementation
            return client.getLoanAppByStatus(getLoanAppStatusRequest);
          }
        }
      );
    }
  }
  private final class ReLoanAppByStatusViewCallsImpl implements Components.ReLoanAppByStatusViewCalls {
     @Override
    public DeferredCall<io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest, io.kx.loanapp.view.ReLoanAppViewByStatusModel.ReLoanAppViewResponse> getLoanAppByStatus(io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest getLoanAppStatusRequest) {
      return new GrpcDeferredCall<>(
        getLoanAppStatusRequest,
        context.componentCallMetadata(),
        "io.kx.loanapp.view.ReLoanAppByStatus",
        "GetLoanAppByStatus",
        (Metadata metadata) -> {
          io.kx.loanapp.view.ReLoanAppByStatus client = getGrpcClient(io.kx.loanapp.view.ReLoanAppByStatus.class);
          if (client instanceof io.kx.loanapp.view.ReLoanAppByStatusClient) {
            return addHeaders(((io.kx.loanapp.view.ReLoanAppByStatusClient) client).getLoanAppByStatus(), metadata).invoke(getLoanAppStatusRequest);
          } else {
            // only for tests with mocked client implementation
            return client.getLoanAppByStatus(getLoanAppStatusRequest);
          }
        }
      );
    }
  }
}
