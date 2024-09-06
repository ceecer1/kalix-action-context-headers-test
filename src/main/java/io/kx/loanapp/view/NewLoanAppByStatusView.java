package io.kx.loanapp.view;

import com.google.protobuf.Any;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.view.View;
import kalix.javasdk.view.ViewContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the View Service described in your io/kx/loanapp/view/loan_app_new_view.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class NewLoanAppByStatusView extends AbstractNewLoanAppByStatusView {

  public NewLoanAppByStatusView(ViewContext context) {}

  @Override
  public NewLoanAppViewByStatusModel.NewLoanAppViewState emptyState() {
    throw new UnsupportedOperationException("Not implemented yet, replace with your empty view state");
  }

  @Override
  public View.UpdateEffect<NewLoanAppViewByStatusModel.NewLoanAppViewState> onSubmitted(
      NewLoanAppViewByStatusModel.NewLoanAppViewState state,
      LoanAppDomain.Submitted submitted) {
    throw new UnsupportedOperationException("Update handler for 'OnSubmitted' not implemented yet");
  }

  @Override
  public View.UpdateEffect<NewLoanAppViewByStatusModel.NewLoanAppViewState> onApproved(
      NewLoanAppViewByStatusModel.NewLoanAppViewState state,
      LoanAppDomain.Approved approved) {
    throw new UnsupportedOperationException("Update handler for 'OnApproved' not implemented yet");
  }

  @Override
  public View.UpdateEffect<NewLoanAppViewByStatusModel.NewLoanAppViewState> ignoreOtherEvents(
      NewLoanAppViewByStatusModel.NewLoanAppViewState state,
      Any any) {
    throw new UnsupportedOperationException("Update handler for 'IgnoreOtherEvents' not implemented yet");
  }

}

