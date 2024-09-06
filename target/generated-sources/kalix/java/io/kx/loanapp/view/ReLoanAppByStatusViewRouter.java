package io.kx.loanapp.view;

import com.google.protobuf.Any;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.impl.view.UpdateHandlerNotFound;
import kalix.javasdk.impl.view.ViewRouter;
import kalix.javasdk.view.View;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public class ReLoanAppByStatusViewRouter extends ViewRouter<ReLoanAppViewByStatusModel.ReLoanAppViewState, ReLoanAppByStatusView> {

  public ReLoanAppByStatusViewRouter(ReLoanAppByStatusView view) {
    super(view);
  }

  @Override
  public View.UpdateEffect<ReLoanAppViewByStatusModel.ReLoanAppViewState> handleUpdate(
      String eventName,
      ReLoanAppViewByStatusModel.ReLoanAppViewState state,
      Object event) {

    switch (eventName) {
      case "OnSubmitted":
        return view().onSubmitted(
            state,
            (LoanAppDomain.Submitted) event);

      case "OnApproved":
        return view().onApproved(
            state,
            (LoanAppDomain.Approved) event);

      case "IgnoreOtherEvents":
        return view().ignoreOtherEvents(
            state,
            (Any) event);

      default:
        throw new UpdateHandlerNotFound(eventName);
    }
  }

}


