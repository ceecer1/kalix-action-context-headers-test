package io.kx.loanapp.action;

import com.google.protobuf.Empty;
import io.kx.loanapp.action.LoanAppServiceActionImpl;
import io.kx.loanapp.api.LoanAppApi;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.Metadata;
import kalix.javasdk.action.Action.Effect;
import kalix.javasdk.action.ActionCreationContext;
import kalix.javasdk.testkit.ActionResult;
import kalix.javasdk.testkit.MockRegistry;
import kalix.javasdk.testkit.impl.ActionResultImpl;
import kalix.javasdk.testkit.impl.TestKitActionContext;

import java.util.Optional;
import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public final class LoanAppServiceActionImplTestKit {

  private final Function<ActionCreationContext, LoanAppServiceActionImpl> actionFactory;

  private final MockRegistry mockRegistry;

  private LoanAppServiceActionImpl createAction(TestKitActionContext context) {
    LoanAppServiceActionImpl action = actionFactory.apply(context);
    action._internalSetActionContext(Optional.of(context));
    return action;
  }

  public static LoanAppServiceActionImplTestKit of(Function<ActionCreationContext, LoanAppServiceActionImpl> actionFactory) {
    return new LoanAppServiceActionImplTestKit(actionFactory, MockRegistry.EMPTY);
  }

  public static LoanAppServiceActionImplTestKit of(Function<ActionCreationContext, LoanAppServiceActionImpl> actionFactory, MockRegistry mockRegistry) {
    return new LoanAppServiceActionImplTestKit(actionFactory, mockRegistry);
  }

  private LoanAppServiceActionImplTestKit(Function<ActionCreationContext, LoanAppServiceActionImpl> actionFactory, MockRegistry mockRegistry) {
    this.actionFactory = actionFactory;
    this.mockRegistry = mockRegistry;
  }

  private <E> ActionResult<E> interpretEffects(Effect<E> effect) {
    return new ActionResultImpl(effect);
  }

  public ActionResult<Empty> submitLoanApplication(LoanAppApi.SubmitCommand submitCommand, Metadata metadata) {
    TestKitActionContext context = new TestKitActionContext(metadata, mockRegistry);
    Effect<Empty> effect = createAction(context).submitLoanApplication(submitCommand);
    return interpretEffects(effect);
  }

  public ActionResult<Empty> expireAction(LoanAppApi.DeclineCommand declineCommand, Metadata metadata) {
    TestKitActionContext context = new TestKitActionContext(metadata, mockRegistry);
    Effect<Empty> effect = createAction(context).expireAction(declineCommand);
    return interpretEffects(effect);
  }

  public ActionResult<Empty> cancelExpireTimer(LoanAppDomain.Approved approved, Metadata metadata) {
    TestKitActionContext context = new TestKitActionContext(metadata, mockRegistry);
    Effect<Empty> effect = createAction(context).cancelExpireTimer(approved);
    return interpretEffects(effect);
  }

  public ActionResult<Empty> submitLoanApplication(LoanAppApi.SubmitCommand submitCommand) {
    return submitLoanApplication(submitCommand, Metadata.EMPTY);
  }

  public ActionResult<Empty> expireAction(LoanAppApi.DeclineCommand declineCommand) {
    return expireAction(declineCommand, Metadata.EMPTY);
  }

  public ActionResult<Empty> cancelExpireTimer(LoanAppDomain.Approved approved) {
    return cancelExpireTimer(approved, Metadata.EMPTY);
  }

}
