package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class US606_InterAccount extends GWD {

    LeftNav ln=new LeftNav();

    @And("the user selects a sender account and receiver account.")
    public void theUserSelectsASenderAccountAndReceiverAccount() {
        ln.myClick(ln.transferFunds);
        ln.myClick(ln.transferToAccount);
    }

    @And("the user enters a amount of transfer.")
    public void theUserEntersAAmountOfTransfer() {
        ln.mySendKeys(ln.transferAmount,"900");

    }

    @And("user click on the {string} button.")
    public void userClickOnTheButton(String arg0) {
        ln.myClick(ln.transferButton);

    }

    @Then("confirms that the user has successfully completed the transfer process.")
    public void confirmsThatTheUserHasSuccessfullyCompletedTheTransferProcess() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement transferCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Transfer Complete!')]")));
        Assert.assertTrue(transferCompleteText.isDisplayed(), "Transfer Complete text is displayed");
    }
}
