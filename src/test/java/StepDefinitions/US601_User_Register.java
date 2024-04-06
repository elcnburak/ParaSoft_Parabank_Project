package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US601_User_Register extends GWD{

    LeftNav ln=new LeftNav();
    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        System.out.println("ParaBak Website Açıldı");
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Register information and click register button")
    public void registerInformationAndClickRegisterButton() {
        System.out.println("Kullanıcı bilgileri gönderildi");
        ln.myClick(ln.registerButton);
        ln.mySendKeys(ln.registerFirstName, "Ahmet");
        ln.mySendKeys(ln.registerLastName, "Mehmet");
        ln.mySendKeys(ln.registerAddress, "Kadikoy mahallesi, #4");
        ln.mySendKeys(ln.registerCity, "Istanbul");
        ln.mySendKeys(ln.registerState, "TX");
        ln.mySendKeys(ln.registerZipCode, "13456");
        ln.mySendKeys(ln.registerPhoneNumber, "5556789");
        ln.mySendKeys(ln.registerSSN, "7788900-8778");

        ln.mySendKeys(ln.registerUsername, "AHMET");
        ln.mySendKeys(ln.registerPassword, "Ahmet123");
        ln.mySendKeys(ln.registerPasswordConfirm, "Ahmet123");
        ln.myClick(ln.registerButtonConfirmation);

    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        Assert.assertTrue(ln.welcomeMessage.getText().toLowerCase().contains("welcome"), "The user did not long in successfully");

    }
}
