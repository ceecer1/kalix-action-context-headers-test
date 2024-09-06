package io.kx.loanapp.view;

import com.google.protobuf.Descriptors;
import kalix.javasdk.view.ViewCreationContext;
import kalix.javasdk.view.ViewOptions;
import kalix.javasdk.view.ViewProvider;

import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public class ReLoanAppByStatusViewProvider implements ViewProvider {

  private final Function<ViewCreationContext, ReLoanAppByStatusView> viewFactory;
  private final String viewId;
  private final ViewOptions options;

  /** Factory method of ReLoanAppByStatusView */
  public static ReLoanAppByStatusViewProvider of(
      Function<ViewCreationContext, ReLoanAppByStatusView> viewFactory) {
    return new ReLoanAppByStatusViewProvider(viewFactory, "ReLoanAppByStatus", ViewOptions.defaults());
  }

  private ReLoanAppByStatusViewProvider(
      Function<ViewCreationContext, ReLoanAppByStatusView> viewFactory,
      String viewId,
      ViewOptions options) {
    this.viewFactory = viewFactory;
    this.viewId = viewId;
    this.options = options;
  }

  @Override
  public String viewId() {
    return viewId;
  }

  @Override
  public final ViewOptions options() {
    return options;
  }

  public final ReLoanAppByStatusViewProvider withOptions(ViewOptions options) {
    return new ReLoanAppByStatusViewProvider(viewFactory, viewId, options);
  }

  /**
   * Use a custom view identifier. By default, the viewId is the same as the proto service name.
   * A different identifier can be needed when making rolling updates with changes to the view definition.
   */
  public ReLoanAppByStatusViewProvider withViewId(String viewId) {
    return new ReLoanAppByStatusViewProvider(viewFactory, viewId, options);
  }

  @Override
  public final Descriptors.ServiceDescriptor serviceDescriptor() {
    return ReLoanAppViewByStatusModel.getDescriptor().findServiceByName("ReLoanAppByStatus");
  }

  @Override
  public final ReLoanAppByStatusViewRouter newRouter(ViewCreationContext context) {
    return new ReLoanAppByStatusViewRouter(viewFactory.apply(context));
  }

  @Override
  public final Descriptors.FileDescriptor[] additionalDescriptors() {
    return new Descriptors.FileDescriptor[] {ReLoanAppViewByStatusModel.getDescriptor()};
  }
}

