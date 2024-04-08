package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US608_Loan_Application extends GWD {
    LeftNav ln=new LeftNav();
    @Given("User should login on Parabank home page")
    public void userShouldLoginOnParabankHomePage() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        ln.myClick(ln.registerButton);
        ln.mySendKeys(ln.customerLoginUsername, "AHMET");
        ln.mySendKeys(ln.customerLoginPassword,"Ahmet123");
        ln.myClick(ln.customerLoginButton);
    }

    @Then("user click on {string} link")
    public void userClickOnLink(String requestLoanButton) {
        ln.myClick(ln.requestLoanButton);
    }

    @And("user enters {string} dollars in the {string} field")
    public void userEntersDollarsInTheField(String amount, String loanAmountField) {
        ln.mySendKeys(ln.loanAmountField, "2000");
    }

    @And("user enters {string} dollars in {string} field")
    public void userEntersDollarsInField(String amount, String downPayment) {
        ln.mySendKeys(ln.downPaymentField, "400");
    }

    @And("user selects an account number in the {string}")
    public void userSelectsAnAccountNumberInThe(String newAccountNumber) {
        //The new account number is selected by the default, no action is required
    }

    @And("user clicks on the {string} button")
    public void userClicksOnTheButton(String applyNowButton) {
        ln.myClick(ln.applyNowButton);
    }

    @And("user confirms the following information:")
    public void userConfirmsTheFollowingInformation() {
        ln.verifyContainsText(ln.confirmLoanProvider,"ParaBank");
        ln.verifyContainsText(ln.confirmLoanStatus, "Approved");
        ln.verifyContainsText(ln.confirmLoanMessage, "Congratulations, your loan has been approved.");

    }

    @When("User clicks on the link of the newly created credit account number")
    public void userClicksOnTheLinkOfTheNewlyCreatedCreditAccountNumber() {
        ln.myClick(ln.newAccountNumber);
    }

    @And("the user confirms the following infomation:")
    public void theUserConfirmsTheFollowingInfomation() {
        ln.verifyContainsText(ln.confirmAccountType, "LOAN");
        ln.verifyContainsText(ln.confirmBalance, "2000");
        ln.verifyContainsText(ln.confirmAvailableBalance, "2000");

    }

    @Then("user {string} confirms the message")
    public void userConfirmsTheMessage(String message) {
        ln.verifyContainsText(ln.confirmNoTransaction, "No transactions found.");
    }
}
