package io.kx.loanapp.action;

import com.google.protobuf.Empty;
import io.kx.loanapp.Components;
import io.kx.loanapp.ComponentsImpl;
import io.kx.loanapp.api.LoanAppApi;
import io.kx.loanapp.domain.LoanAppDomain;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public abstract class AbstractLoanAppServiceAction extends kalix.javasdk.action.Action {

  protected final Components components() {
    return new ComponentsImpl(contextForComponents());
  }

  public abstract Effect<Empty> submitLoanApplication(LoanAppApi.SubmitCommand submitCommand);
  public abstract Effect<Empty> expireAction(LoanAppApi.DeclineCommand declineCommand);
  public abstract Effect<Empty> cancelExpireTimer(LoanAppDomain.Approved approved);
}