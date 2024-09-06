package io.kx.loanapp.action;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Empty;
import com.google.protobuf.EmptyProto;
import io.kx.loanapp.api.LoanAppApi;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.action.ActionCreationContext;
import kalix.javasdk.action.ActionOptions;
import kalix.javasdk.action.ActionProvider;
import kalix.javasdk.impl.action.ActionRouter;

import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * LoanAppServiceActionProvider that defines how to register and create the action for
 * the Protobuf service <code>LoanAppServiceAction</code>.
 *
 * Should be used with the <code>register</code> method in {@link kalix.javasdk.Kalix}.
 */
public class LoanAppServiceActionProvider implements ActionProvider<LoanAppServiceActionImpl> {

  private final Function<ActionCreationContext, LoanAppServiceActionImpl> actionFactory;
  private final ActionOptions options;

  /** Factory method of LoanAppServiceActionProvider */
  public static LoanAppServiceActionProvider of(Function<ActionCreationContext, LoanAppServiceActionImpl> actionFactory) {
    return new LoanAppServiceActionProvider(actionFactory, ActionOptions.defaults());
  }

  private LoanAppServiceActionProvider(Function<ActionCreationContext, LoanAppServiceActionImpl> actionFactory, ActionOptions options) {
    this.actionFactory = actionFactory;
    this.options = options;
  }

  @Override
  public final ActionOptions options() {
    return options;
  }

  public final LoanAppServiceActionProvider withOptions(ActionOptions options) {
    return new LoanAppServiceActionProvider(actionFactory, options);
  }

  @Override
  public final Descriptors.ServiceDescriptor serviceDescriptor() {
    return LoanAppActionHandler.getDescriptor().findServiceByName("LoanAppServiceAction");
  }

  @Override
  public final LoanAppServiceActionRouter newRouter(ActionCreationContext context) {
    return new LoanAppServiceActionRouter(actionFactory.apply(context));
  }

  @Override
  public final Descriptors.FileDescriptor[] additionalDescriptors() {
    return new Descriptors.FileDescriptor[] {
      EmptyProto.getDescriptor(),
      LoanAppActionHandler.getDescriptor(),
      LoanAppApi.getDescriptor(),
      LoanAppDomain.getDescriptor()
    };
  }

}
