package io.kx.loanapp.action;

import akka.stream.javadsl.Source;
import com.google.protobuf.Empty;
import io.kx.loanapp.action.LoanAppServiceActionImpl;
import io.kx.loanapp.action.LoanAppServiceActionImplTestKit;
import io.kx.loanapp.api.LoanAppApi;
import kalix.javasdk.testkit.ActionResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class LoanAppServiceActionImplTest {

  @Test
  public void submitLoanApplicationTest() {
    LoanAppServiceActionImplTestKit testKit = LoanAppServiceActionImplTestKit.of(LoanAppServiceActionImpl::new);
    String loanAppId = UUID.randomUUID().toString();
    LoanAppApi.SubmitCommand submitCommand = LoanAppApi.SubmitCommand.newBuilder()
            .setLoanAppId(loanAppId)
            .setClientId("clientId")
            .setClientMonthlyIncomeCents(1000000)
            .setLoanAmountCents(3200000)
            .setLoanDurationMonths(20)
            .build();
     ActionResult<Empty> result = testKit.submitLoanApplication(submitCommand);

  }

  @Test
  @Disabled("to be implemented")
  public void approveLoanApplicationTest() {
    LoanAppServiceActionImplTestKit testKit = LoanAppServiceActionImplTestKit.of(LoanAppServiceActionImpl::new);
    // ActionResult<Empty> result = testKit.approveLoanApplication(LoanAppApi.ApproveCommand.newBuilder()...build());
  }

  @Test
  @Disabled("to be implemented")
  public void expireActionTest() {
    LoanAppServiceActionImplTestKit testKit = LoanAppServiceActionImplTestKit.of(LoanAppServiceActionImpl::new);
    // ActionResult<Empty> result = testKit.expireAction(LoanAppApi.DeclineCommand.newBuilder()...build());
  }

}
