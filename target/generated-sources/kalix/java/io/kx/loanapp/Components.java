package io.kx.loanapp;

import kalix.javasdk.DeferredCall;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * Not intended for user extension, provided through generated implementation
 */
public interface Components {
  LoanAppByStatusViewCalls loanAppByStatusView();
  LoanAppEntityCalls loanAppEntity();
  LoanAppServiceActionImplCalls loanAppServiceActionImpl();
  NewLoanAppByStatusViewCalls newLoanAppByStatusView();
  ReLoanAppByStatusViewCalls reLoanAppByStatusView();

  interface LoanAppByStatusViewCalls {
    DeferredCall<io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest, io.kx.loanapp.view.LoanAppViewByStatusModel.LoanAppViewResponse> getLoanAppByStatus(io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest getLoanAppStatusRequest);
  }
  interface LoanAppEntityCalls {
    DeferredCall<io.kx.loanapp.api.LoanAppApi.SubmitCommand, com.google.protobuf.Empty> submit(io.kx.loanapp.api.LoanAppApi.SubmitCommand submitCommand);

    DeferredCall<io.kx.loanapp.api.LoanAppApi.GetCommand, io.kx.loanapp.api.LoanAppApi.LoanAppState> get(io.kx.loanapp.api.LoanAppApi.GetCommand getCommand);

    DeferredCall<io.kx.loanapp.api.LoanAppApi.ApproveCommand, com.google.protobuf.Empty> approve(io.kx.loanapp.api.LoanAppApi.ApproveCommand approveCommand);

    DeferredCall<io.kx.loanapp.api.LoanAppApi.DeclineCommand, com.google.protobuf.Empty> decline(io.kx.loanapp.api.LoanAppApi.DeclineCommand declineCommand);
  }
  interface LoanAppServiceActionImplCalls {
    DeferredCall<io.kx.loanapp.api.LoanAppApi.SubmitCommand, com.google.protobuf.Empty> submitLoanApplication(io.kx.loanapp.api.LoanAppApi.SubmitCommand submitCommand);

    DeferredCall<io.kx.loanapp.api.LoanAppApi.DeclineCommand, com.google.protobuf.Empty> expireAction(io.kx.loanapp.api.LoanAppApi.DeclineCommand declineCommand);

    DeferredCall<io.kx.loanapp.domain.LoanAppDomain.Approved, com.google.protobuf.Empty> cancelExpireTimer(io.kx.loanapp.domain.LoanAppDomain.Approved approved);
  }
  interface NewLoanAppByStatusViewCalls {
    DeferredCall<io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest, io.kx.loanapp.view.NewLoanAppViewByStatusModel.NewLoanAppViewResponse> getLoanAppByStatus(io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest getLoanAppStatusRequest);
  }
  interface ReLoanAppByStatusViewCalls {
    DeferredCall<io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest, io.kx.loanapp.view.ReLoanAppViewByStatusModel.ReLoanAppViewResponse> getLoanAppByStatus(io.kx.loanapp.view.LoanAppViewByStatusModel.GetLoanAppStatusRequest getLoanAppStatusRequest);
  }
}
