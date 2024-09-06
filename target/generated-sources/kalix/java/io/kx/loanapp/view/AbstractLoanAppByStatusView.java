package io.kx.loanapp.view;

import com.google.protobuf.Any;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.view.View;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public abstract class AbstractLoanAppByStatusView extends View<LoanAppViewByStatusModel.LoanAppViewState> {

  public abstract View.UpdateEffect<LoanAppViewByStatusModel.LoanAppViewState> onSubmitted(
      LoanAppViewByStatusModel.LoanAppViewState state,
      LoanAppDomain.Submitted submitted);

  public abstract View.UpdateEffect<LoanAppViewByStatusModel.LoanAppViewState> onApproved(
      LoanAppViewByStatusModel.LoanAppViewState state,
      LoanAppDomain.Approved approved);

  public abstract View.UpdateEffect<LoanAppViewByStatusModel.LoanAppViewState> ignoreOtherEvents(
      LoanAppViewByStatusModel.LoanAppViewState state,
      Any any);

}

