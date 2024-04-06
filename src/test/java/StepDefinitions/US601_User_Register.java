package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US601_User_Register {
    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        System.out.println("ParaBak Website Açıldı");
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Register information and click register button")
    public void registerInformationAndClickRegisterButton() {
        System.out.println("Kullanıcı bilgileri gönderildi");
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
    }
}
