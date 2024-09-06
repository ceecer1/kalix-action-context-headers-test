package io.kx.loanapp.view;

import com.google.protobuf.Any;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.view.View;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public abstract class AbstractNewLoanAppByStatusView extends View<NewLoanAppViewByStatusModel.NewLoanAppViewState> {

  public abstract View.UpdateEffect<NewLoanAppViewByStatusModel.NewLoanAppViewState> onSubmitted(
      NewLoanAppViewByStatusModel.NewLoanAppViewState state,
      LoanAppDomain.Submitted submitted);

  public abstract View.UpdateEffect<NewLoanAppViewByStatusModel.NewLoanAppViewState> onApproved(
      NewLoanAppViewByStatusModel.NewLoanAppViewState state,
      LoanAppDomain.Approved approved);

  public abstract View.UpdateEffect<NewLoanAppViewByStatusModel.NewLoanAppViewState> ignoreOtherEvents(
      NewLoanAppViewByStatusModel.NewLoanAppViewState state,
      Any any);

}

