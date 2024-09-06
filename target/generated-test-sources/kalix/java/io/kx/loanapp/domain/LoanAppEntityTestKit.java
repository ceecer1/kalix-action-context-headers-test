package io.kx.loanapp.domain;

import com.google.protobuf.Empty;
import io.kx.loanapp.api.LoanAppApi;
import kalix.javasdk.Metadata;
import kalix.javasdk.eventsourcedentity.EventSourcedEntity;
import kalix.javasdk.eventsourcedentity.EventSourcedEntityContext;
import kalix.javasdk.impl.effect.MessageReplyImpl;
import kalix.javasdk.impl.effect.SecondaryEffectImpl;
import kalix.javasdk.impl.eventsourcedentity.EventSourcedEntityEffectImpl;
import kalix.javasdk.testkit.EventSourcedResult;
import kalix.javasdk.testkit.impl.EventSourcedEntityEffectsRunner;
import kalix.javasdk.testkit.impl.EventSourcedResultImpl;
import kalix.javasdk.testkit.impl.TestKitEventSourcedEntityCommandContext;
import kalix.javasdk.testkit.impl.TestKitEventSourcedEntityContext;
import kalix.javasdk.testkit.impl.TestKitEventSourcedEntityEventContext;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * TestKit for unit testing LoanAppEntity
 */
public final class LoanAppEntityTestKit extends EventSourcedEntityEffectsRunner<LoanAppDomain.LoanAppDomainState, Object> {

  /**
   * Create a testkit instance of LoanAppEntity
   * @param entityFactory A function that creates a LoanAppEntity based on the given EventSourcedEntityContext,
   *                      a default entity id is used.
   */
  public static LoanAppEntityTestKit of(Function<EventSourcedEntityContext, LoanAppEntity> entityFactory) {
    return of("testkit-entity-id", entityFactory);
  }

  /**
   * Create a testkit instance of LoanAppEntity with a specific entity id.
   */
  public static LoanAppEntityTestKit of(String entityId, Function<EventSourcedEntityContext, LoanAppEntity> entityFactory) {
    return new LoanAppEntityTestKit(entityFactory.apply(new TestKitEventSourcedEntityContext(entityId)));
  }

  private LoanAppEntity entity;

  /** Construction is done through the static LoanAppEntityTestKit.of-methods */
  private LoanAppEntityTestKit(LoanAppEntity entity) {
     super(entity);
     this.entity = entity;
  }

  public LoanAppDomain.LoanAppDomainState handleEvent(LoanAppDomain.LoanAppDomainState state, Object event) {
    try {
      entity._internalSetEventContext(Optional.of(new TestKitEventSourcedEntityEventContext()));
      if (event instanceof LoanAppDomain.Submitted) {
        return entity.submitted(state, (LoanAppDomain.Submitted) event);
      } else if (event instanceof LoanAppDomain.Approved) {
        return entity.approved(state, (LoanAppDomain.Approved) event);
      } else if (event instanceof LoanAppDomain.Declined) {
        return entity.declined(state, (LoanAppDomain.Declined) event);
      } else {
        throw new NoSuchElementException("Unknown event type [" + event.getClass() + "]");
      }
    } finally {
      entity._internalSetEventContext(Optional.empty());
    }
  }

  public EventSourcedResult<Empty> submit(LoanAppApi.SubmitCommand command, Metadata metadata) {
    return interpretEffects(() -> entity.submit(getState(), command), metadata);
  }

  public EventSourcedResult<LoanAppApi.LoanAppState> get(LoanAppApi.GetCommand command, Metadata metadata) {
    return interpretEffects(() -> entity.get(getState(), command), metadata);
  }

  public EventSourcedResult<Empty> approve(LoanAppApi.ApproveCommand command, Metadata metadata) {
    return interpretEffects(() -> entity.approve(getState(), command), metadata);
  }

  public EventSourcedResult<Empty> decline(LoanAppApi.DeclineCommand command, Metadata metadata) {
    return interpretEffects(() -> entity.decline(getState(), command), metadata);
  }

  public EventSourcedResult<Empty> submit(LoanAppApi.SubmitCommand command) {
    return interpretEffects(() -> entity.submit(getState(), command), Metadata.EMPTY);
  }

  public EventSourcedResult<LoanAppApi.LoanAppState> get(LoanAppApi.GetCommand command) {
    return interpretEffects(() -> entity.get(getState(), command), Metadata.EMPTY);
  }

  public EventSourcedResult<Empty> approve(LoanAppApi.ApproveCommand command) {
    return interpretEffects(() -> entity.approve(getState(), command), Metadata.EMPTY);
  }

  public EventSourcedResult<Empty> decline(LoanAppApi.DeclineCommand command) {
    return interpretEffects(() -> entity.decline(getState(), command), Metadata.EMPTY);
  }

}
