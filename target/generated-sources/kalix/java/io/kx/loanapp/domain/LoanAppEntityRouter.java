package io.kx.loanapp.domain;

import com.google.protobuf.Empty;
import io.kx.loanapp.api.LoanAppApi;
import kalix.javasdk.eventsourcedentity.CommandContext;
import kalix.javasdk.eventsourcedentity.EventSourcedEntity;
import kalix.javasdk.impl.eventsourcedentity.EventSourcedEntityRouter;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * An event sourced entity handler that is the glue between the Protobuf service <code>LoanAppService</code>
 * and the command and event handler methods in the <code>LoanAppEntity</code> class.
 */
public class LoanAppEntityRouter extends EventSourcedEntityRouter<LoanAppDomain.LoanAppDomainState, Object, LoanAppEntity> {

  public LoanAppEntityRouter(LoanAppEntity entity) {
    super(entity);
  }

  @Override
  public LoanAppDomain.LoanAppDomainState handleEvent(LoanAppDomain.LoanAppDomainState state, Object event) {
    if (event instanceof LoanAppDomain.Submitted) {
      return entity().submitted(state, (LoanAppDomain.Submitted) event);
    } else if (event instanceof LoanAppDomain.Approved) {
      return entity().approved(state, (LoanAppDomain.Approved) event);
    } else if (event instanceof LoanAppDomain.Declined) {
      return entity().declined(state, (LoanAppDomain.Declined) event);
    } else {
      throw new EventSourcedEntityRouter.EventHandlerNotFound(event.getClass());
    }
  }

  @Override
  public EventSourcedEntity.Effect<?> handleCommand(
      String commandName, LoanAppDomain.LoanAppDomainState state, Object command, CommandContext context) {
    switch (commandName) {

      case "Submit":
        return entity().submit(state, (LoanAppApi.SubmitCommand) command);

      case "Get":
        return entity().get(state, (LoanAppApi.GetCommand) command);

      case "Approve":
        return entity().approve(state, (LoanAppApi.ApproveCommand) command);

      case "Decline":
        return entity().decline(state, (LoanAppApi.DeclineCommand) command);

      default:
        throw new EventSourcedEntityRouter.CommandHandlerNotFound(commandName);
    }
  }
}
