package io.kx.loanapp;

import io.kx.loanapp.action.LoanAppActionHandler;
import io.kx.loanapp.action.LoanAppServiceActionImpl;
import io.kx.loanapp.action.LoanAppServiceActionProvider;
import io.kx.loanapp.api.LoanAppApi;
import io.kx.loanapp.domain.LoanAppEntity;
import io.kx.loanapp.domain.LoanAppEntityProvider;
import io.kx.loanapp.view.LoanAppByStatusView;
import io.kx.loanapp.view.LoanAppByStatusViewProvider;
import io.kx.loanapp.view.LoanAppViewByStatusModel;
import io.kx.loanapp.view.NewLoanAppByStatusView;
import io.kx.loanapp.view.NewLoanAppByStatusViewProvider;
import io.kx.loanapp.view.NewLoanAppViewByStatusModel;
import io.kx.loanapp.view.ReLoanAppByStatusView;
import io.kx.loanapp.view.ReLoanAppByStatusViewProvider;
import io.kx.loanapp.view.ReLoanAppViewByStatusModel;
import kalix.javasdk.Kalix;
import kalix.javasdk.action.ActionCreationContext;
import kalix.javasdk.eventsourcedentity.EventSourcedEntityContext;
import kalix.javasdk.view.ViewCreationContext;

import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public final class KalixFactory {

  public static Kalix withComponents(
      Function<EventSourcedEntityContext, LoanAppEntity> createLoanAppEntity,
      Function<ViewCreationContext, LoanAppByStatusView> createLoanAppByStatusView,
      Function<ActionCreationContext, LoanAppServiceActionImpl> createLoanAppServiceActionImpl,
      Function<ViewCreationContext, NewLoanAppByStatusView> createNewLoanAppByStatusView,
      Function<ViewCreationContext, ReLoanAppByStatusView> createReLoanAppByStatusView) {
    Kalix kalix = new Kalix();
    return kalix
      .register(LoanAppByStatusViewProvider.of(createLoanAppByStatusView))
      .register(LoanAppEntityProvider.of(createLoanAppEntity))
      .register(LoanAppServiceActionProvider.of(createLoanAppServiceActionImpl))
      .register(NewLoanAppByStatusViewProvider.of(createNewLoanAppByStatusView))
      .register(ReLoanAppByStatusViewProvider.of(createReLoanAppByStatusView));
  }
}
