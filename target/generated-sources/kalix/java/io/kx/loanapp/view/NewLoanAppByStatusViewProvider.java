package io.kx.loanapp.view;

import com.google.protobuf.Descriptors;
import kalix.javasdk.view.ViewCreationContext;
import kalix.javasdk.view.ViewOptions;
import kalix.javasdk.view.ViewProvider;

import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public class NewLoanAppByStatusViewProvider implements ViewProvider {

  private final Function<ViewCreationContext, NewLoanAppByStatusView> viewFactory;
  private final String viewId;
  private final ViewOptions options;

  /** Factory method of NewLoanAppByStatusView */
  public static NewLoanAppByStatusViewProvider of(
      Function<ViewCreationContext, NewLoanAppByStatusView> viewFactory) {
    return new NewLoanAppByStatusViewProvider(viewFactory, "NewLoanAppByStatus", ViewOptions.defaults());
  }

  private NewLoanAppByStatusViewProvider(
      Function<ViewCreationContext, NewLoanAppByStatusView> viewFactory,
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

  public final NewLoanAppByStatusViewProvider withOptions(ViewOptions options) {
    return new NewLoanAppByStatusViewProvider(viewFactory, viewId, options);
  }

  /**
   * Use a custom view identifier. By default, the viewId is the same as the proto service name.
   * A different identifier can be needed when making rolling updates with changes to the view definition.
   */
  public NewLoanAppByStatusViewProvider withViewId(String viewId) {
    return new NewLoanAppByStatusViewProvider(viewFactory, viewId, options);
  }

  @Override
  public final Descriptors.ServiceDescriptor serviceDescriptor() {
    return NewLoanAppViewByStatusModel.getDescriptor().findServiceByName("NewLoanAppByStatus");
  }

  @Override
  public final NewLoanAppByStatusViewRouter newRouter(ViewCreationContext context) {
    return new NewLoanAppByStatusViewRouter(viewFactory.apply(context));
  }

  @Override
  public final Descriptors.FileDescriptor[] additionalDescriptors() {
    return new Descriptors.FileDescriptor[] {NewLoanAppViewByStatusModel.getDescriptor()};
  }
}

