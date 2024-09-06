package io.kx.loanapp.domain;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Empty;
import com.google.protobuf.EmptyProto;
import io.kx.loanapp.api.LoanAppApi;
import kalix.javasdk.eventsourcedentity.EventSourcedEntityContext;
import kalix.javasdk.eventsourcedentity.EventSourcedEntityOptions;
import kalix.javasdk.eventsourcedentity.EventSourcedEntityProvider;

import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * An event sourced entity provider that defines how to register and create the entity for
 * the Protobuf service <code>LoanAppService</code>.
 *
 * Should be used with the <code>register</code> method in {@link kalix.javasdk.Kalix}.
 */
public class LoanAppEntityProvider implements EventSourcedEntityProvider<LoanAppDomain.LoanAppDomainState, Object, LoanAppEntity> {

  private final Function<EventSourcedEntityContext, LoanAppEntity> entityFactory;
  private final EventSourcedEntityOptions options;

  /** Factory method of LoanAppEntityProvider */
  public static LoanAppEntityProvider of(Function<EventSourcedEntityContext, LoanAppEntity> entityFactory) {
    return new LoanAppEntityProvider(entityFactory, EventSourcedEntityOptions.defaults());
  }

  private LoanAppEntityProvider(
      Function<EventSourcedEntityContext, LoanAppEntity> entityFactory,
      EventSourcedEntityOptions options) {
    this.entityFactory = entityFactory;
    this.options = options;
  }

  @Override
  public final EventSourcedEntityOptions options() {
    return options;
  }

  public final LoanAppEntityProvider withOptions(EventSourcedEntityOptions options) {
    return new LoanAppEntityProvider(entityFactory, options);
  }

  @Override
  public final Descriptors.ServiceDescriptor serviceDescriptor() {
    return LoanAppApi.getDescriptor().findServiceByName("LoanAppService");
  }

  @Override
  public final String typeId() {
    return "loanapp";
  }

  @Override
  public final LoanAppEntityRouter newRouter(EventSourcedEntityContext context) {
    return new LoanAppEntityRouter(entityFactory.apply(context));
  }

  @Override
  public final Descriptors.FileDescriptor[] additionalDescriptors() {
    return new Descriptors.FileDescriptor[] {
      EmptyProto.getDescriptor(),
      LoanAppApi.getDescriptor(),
      LoanAppDomain.getDescriptor()
    };
  }
}
