package io.kx.loanapp.action;

import akka.Done;
import com.google.protobuf.Empty;
import io.kx.loanapp.api.LoanAppApi;
import io.kx.loanapp.domain.LoanAppDomain;
import kalix.javasdk.Metadata;
import kalix.javasdk.action.ActionCreationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.concurrent.CompletionStage;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Action Service described in your io/kx/loanapp/action/loan_app_action.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class LoanAppServiceActionImpl extends AbstractLoanAppServiceAction {

  private static Logger logger = LoggerFactory.getLogger(LoanAppServiceActionImpl.class);

  public LoanAppServiceActionImpl(ActionCreationContext creationContext) {}

  private Metadata getMetadata() {
    return this.actionContext().metadata();
  }

  @Override
  public Effect<Empty> submitLoanApplication(LoanAppApi.SubmitCommand submitCommand) {

    final Metadata metadata = getMetadata();
    logger.info("________ METADATA __________");
    logger.info(metadata.get("X_API_KEY").orElse("NOTHING"));
    logger.info("__________ METADATA ___________");

    CompletionStage<Done> timerRegistration = timers().startSingleTimer(
            submitCommand.getLoanAppId(),
            Duration.ofSeconds(20),
            components().loanAppServiceActionImpl().expireAction(
                    LoanAppApi.DeclineCommand.newBuilder()
                            .setLoanAppId(submitCommand.getLoanAppId())
                            .setReason("Declined after not Approved within 20 secs")
                            .build()
            )
    );

    return effects().asyncReply(
            timerRegistration.thenCompose(done -> components().loanAppEntity().submit(submitCommand).execute())
                    .thenApply(any -> Empty.getDefaultInstance())
    );

  }

  @Override
  public Effect<Empty> expireAction(LoanAppApi.DeclineCommand declineCommand) {
    logger.info("_____________________");
    logger.info("_____________________");
    logger.info("Expiring loan app " + declineCommand.getLoanAppId());
    logger.info("_____________________");
    logger.info("_____________________");
    return effects().forward(components().loanAppEntity().decline(declineCommand));
  }

  @Override
  public Effect<Empty> cancelExpireTimer(LoanAppDomain.Approved approved) {
    logger.info("_____________________");
    logger.info("_____________________");
    timers().cancel(approved.getLoanAppId());
    logger.info("Cancel Executed for loan app " + approved.getLoanAppId());
    logger.info("_____________________");
    logger.info("_____________________");
    return effects().reply(Empty.getDefaultInstance());
  }



}