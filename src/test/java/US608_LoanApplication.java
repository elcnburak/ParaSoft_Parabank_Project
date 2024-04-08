import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US608_LoanApplication extends GWD {
    LeftNav ln=new LeftNav();
    @Given("User should login on Parabank home page")
    public void userShouldLoginOnParabankHomePage() {
        ln.mySendKeys(ln.customerLoginUsername, "AHMET");
        ln.mySendKeys(ln.customerLoginPassword,"Ahmet123");
        ln.myClick(ln.customerLoginButton);
    }

    @Then("user click on 'Request Loan' link")
    public void userClickOnLink() {
        ln.myClick(ln.requestLoanButton);
    }

    @And("user enters '2000.00' in the 'Loan amount' field")
    public void userEntersInTheField() {
        ln.mySendKeys(ln.loanAmountField,"2000");
    }

    @And("user enters '400' dollars in 'Down Payment' field")
    public void userEntersDollarsInField() {
        ln.mySendKeys(ln.downPaymentField, "400");
    }

    @And("user selects an account number in the 'from account number'")
    public void userSelectsAnAccountNumberInThe() {
        //the account number is selected by the default, no action is required
    }

    @And("user clicks on the 'Apply now' button")
    public void userClicksOnTheButton() {
        ln.myClick(ln.applyNowButton);
    }

    @And("user confirms the following information:")
    public void userConfirmsTheFollowingInformation() {
    }

    @When("User clicks on the link of the newly created credit account number")
    public void userClicksOnTheLinkOfTheNewlyCreatedCreditAccountNumber() {
    }

    @And("the user confirms the following infomation:")
    public void theUserConfirmsTheFollowingInfomation() {
    }

    @Then("user {string} confirms the message")
    public void userConfirmsTheMessage(String arg0) {
    }
}
