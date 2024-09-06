package io.kx.loanapp.view;

import com.google.protobuf.Any;
import io.kx.loanapp.api.LoanAppApi;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.view.View;
import kalix.javasdk.view.ViewContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the View Service described in your io/kx/loanapp/view/loan_app_re_view.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class ReLoanAppByStatusView extends AbstractReLoanAppByStatusView {

  public ReLoanAppByStatusView(ViewContext context) {}

  @Override
  public ReLoanAppViewByStatusModel.ReLoanAppViewState emptyState() {
    return ReLoanAppViewByStatusModel.ReLoanAppViewState.getDefaultInstance();
  }

  @Override
  public View.UpdateEffect<ReLoanAppViewByStatusModel.ReLoanAppViewState> onSubmitted(
      ReLoanAppViewByStatusModel.ReLoanAppViewState state,
      LoanAppDomain.Submitted submitted) {
    ReLoanAppViewByStatusModel.ReLoanAppViewState viewState = ReLoanAppViewByStatusModel.ReLoanAppViewState.newBuilder()
            .setLoanAppId(submitted.getLoanAppId())
            .setStatus(LoanAppApi.LoanAppStatus.STATUS_IN_REVIEW)
            .setStatusId(LoanAppApi.LoanAppStatus.STATUS_IN_REVIEW.getNumber())
            .setLastUpdatedTimestamp(submitted.getEventTimestamp())
            .build();

    return effects().updateState(viewState);
  }

  @Override
  public View.UpdateEffect<ReLoanAppViewByStatusModel.ReLoanAppViewState> onApproved(
      ReLoanAppViewByStatusModel.ReLoanAppViewState state,
      LoanAppDomain.Approved approved) {
    ReLoanAppViewByStatusModel.ReLoanAppViewState viewState = ReLoanAppViewByStatusModel.ReLoanAppViewState.newBuilder()
            .setLoanAppId(approved.getLoanAppId())
            .setStatus(LoanAppApi.LoanAppStatus.STATUS_APPROVED)
            .setStatusId(LoanAppApi.LoanAppStatus.STATUS_APPROVED.getNumber())
            .setLastUpdatedTimestamp(approved.getEventTimestamp())
            .build();

    return effects().updateState(viewState);
  }

  @Override
  public View.UpdateEffect<ReLoanAppViewByStatusModel.ReLoanAppViewState> ignoreOtherEvents(
      ReLoanAppViewByStatusModel.ReLoanAppViewState state,
      Any any) {
    return  effects().ignore();
  }

}

