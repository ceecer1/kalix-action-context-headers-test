package io.kx.loanapp.view;

import com.google.protobuf.Descriptors;
import kalix.javasdk.view.ViewCreationContext;
import kalix.javasdk.view.ViewOptions;
import kalix.javasdk.view.ViewProvider;

import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public class LoanAppByStatusViewProvider implements ViewProvider {

  private final Function<ViewCreationContext, LoanAppByStatusView> viewFactory;
  private final String viewId;
  private final ViewOptions options;

  /** Factory method of LoanAppByStatusView */
  public static LoanAppByStatusViewProvider of(
      Function<ViewCreationContext, LoanAppByStatusView> viewFactory) {
    return new LoanAppByStatusViewProvider(viewFactory, "LoanAppByStatus", ViewOptions.defaults());
  }

  private LoanAppByStatusViewProvider(
      Function<ViewCreationContext, LoanAppByStatusView> viewFactory,
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

  public final LoanAppByStatusViewProvider withOptions(ViewOptions options) {
    return new LoanAppByStatusViewProvider(viewFactory, viewId, options);
  }

  /**
   * Use a custom view identifier. By default, the viewId is the same as the proto service name.
   * A different identifier can be needed when making rolling updates with changes to the view definition.
   */
  public LoanAppByStatusViewProvider withViewId(String viewId) {
    return new LoanAppByStatusViewProvider(viewFactory, viewId, options);
  }

  @Override
  public final Descriptors.ServiceDescriptor serviceDescriptor() {
    return LoanAppViewByStatusModel.getDescriptor().findServiceByName("LoanAppByStatus");
  }

  @Override
  public final LoanAppByStatusViewRouter newRouter(ViewCreationContext context) {
    return new LoanAppByStatusViewRouter(viewFactory.apply(context));
  }

  @Override
  public final Descriptors.FileDescriptor[] additionalDescriptors() {
    return new Descriptors.FileDescriptor[] {LoanAppViewByStatusModel.getDescriptor()};
  }
}

