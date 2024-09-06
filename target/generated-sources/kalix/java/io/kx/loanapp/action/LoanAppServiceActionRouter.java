package io.kx.loanapp.action;

import akka.NotUsed;
import akka.stream.javadsl.Source;
import com.google.protobuf.Empty;
import io.kx.loanapp.api.LoanAppApi;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.action.Action.Effect;
import kalix.javasdk.action.MessageEnvelope;
import kalix.javasdk.impl.action.ActionRouter;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public class LoanAppServiceActionRouter extends ActionRouter<LoanAppServiceActionImpl> {

  public LoanAppServiceActionRouter(LoanAppServiceActionImpl actionBehavior) {
    super(actionBehavior);
  }

  @Override
  public Effect<?> handleUnary(String commandName, MessageEnvelope<Object> message) {
    switch (commandName) {
      case "SubmitLoanApplication":
        return action()
                 .submitLoanApplication((LoanAppApi.SubmitCommand) message.payload());

      case "ExpireAction":
        return action()
                 .expireAction((LoanAppApi.DeclineCommand) message.payload());

      case "CancelExpireTimer":
        return action()
                 .cancelExpireTimer((LoanAppDomain.Approved) message.payload());
      default:
        throw new ActionRouter.HandlerNotFound(commandName);
    }
  }

  @Override
  @SuppressWarnings("unchecked")
  public Source<Effect<?>, NotUsed> handleStreamedOut(String commandName, MessageEnvelope<Object> message) {
    switch (commandName) {
      
      default:
        throw new ActionRouter.HandlerNotFound(commandName);
    }
  }

  @Override
  public Effect<?> handleStreamedIn(String commandName, Source<MessageEnvelope<Object>, NotUsed> stream) {
    switch (commandName) {
      
      default:
        throw new ActionRouter.HandlerNotFound(commandName);
    }
  }

  @Override
  @SuppressWarnings("unchecked")
  public Source<Effect<?>, NotUsed> handleStreamed(String commandName, Source<MessageEnvelope<Object>, NotUsed> stream) {
    switch (commandName) {
      
      default:
        throw new ActionRouter.HandlerNotFound(commandName);
    }
  }
}
