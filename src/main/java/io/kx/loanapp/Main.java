package io.kx.loanapp;

import io.kx.loanapp.action.LoanAppServiceAction;
import io.kx.loanapp.action.LoanAppServiceActionImpl;
import io.kx.loanapp.action.LoanAppServiceActionProvider;
import io.kx.loanapp.domain.LoanAppEntity;
import io.kx.loanapp.domain.LoanAppEntityProvider;
import io.kx.loanapp.view.LoanAppByStatusView;
import io.kx.loanapp.view.LoanAppByStatusViewProvider;
import io.kx.loanapp.view.NewLoanAppByStatusView;
import io.kx.loanapp.view.ReLoanAppByStatusView;
import kalix.javasdk.Kalix;
import kalix.javasdk.action.ActionOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public final class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  public static Kalix createKalix() {
    final Set<String> headers = new HashSet<>();
    headers.add("X_API_KEY");
    // The KalixFactory automatically registers any generated Actions, Views or Entities,
    // and is kept up-to-date with any changes in your protobuf definitions.
    // If you prefer, you may remove this and manually register these components in a
    // `new Kalix()` instance.
    Kalix kalix = new Kalix();
    kalix.register(LoanAppEntityProvider.of(LoanAppEntity::new));
    kalix.register(LoanAppByStatusViewProvider.of(LoanAppByStatusView::new)
            .withViewId("ReLoanAppByStatusView"));
    kalix.register(LoanAppServiceActionProvider.of(LoanAppServiceActionImpl::new)
            .withOptions(ActionOptions.defaults().withForwardHeaders(headers)));
    return kalix;

//    return KalixFactory.withComponents(
//            LoanAppEntity::new,
//            LoanAppByStatusView::new,
//            LoanAppServiceActionImpl::new,
//            NewLoanAppByStatusView::new,
//            ReLoanAppByStatusView::new);
  }

  public static void main(String[] args) throws Exception {
    LOG.info("starting the Kalix service");
    createKalix().start();
  }
}
