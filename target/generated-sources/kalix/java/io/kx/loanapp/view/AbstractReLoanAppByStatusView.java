package io.kx.loanapp.view;

import com.google.protobuf.Any;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.view.View;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public abstract class AbstractReLoanAppByStatusView extends View<ReLoanAppViewByStatusModel.ReLoanAppViewState> {

  public abstract View.UpdateEffect<ReLoanAppViewByStatusModel.ReLoanAppViewState> onSubmitted(
      ReLoanAppViewByStatusModel.ReLoanAppViewState state,
      LoanAppDomain.Submitted submitted);

  public abstract View.UpdateEffect<ReLoanAppViewByStatusModel.ReLoanAppViewState> onApproved(
      ReLoanAppViewByStatusModel.ReLoanAppViewState state,
      LoanAppDomain.Approved approved);

  public abstract View.UpdateEffect<ReLoanAppViewByStatusModel.ReLoanAppViewState> ignoreOtherEvents(
      ReLoanAppViewByStatusModel.ReLoanAppViewState state,
      Any any);

}

