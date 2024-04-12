package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US604_Account_Creation extends GWD {

    DialogContent dc = new DialogContent();


    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        System.out.println("Username and password entered, and login button clicked.");
        dc.mySendKeys(dc.username, "Alican");
        dc.mySendKeys(dc.password, "Alis123");
        dc.myClick(dc.LoginButton);
    }

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {
        List<String> strLinkList = linkler.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            //  System.out.println(strLinkList.get(i));
            WebElement linkWebElement = dc.getWebElement(strLinkList.get(i));
            dc.myClick(linkWebElement);
        }
    }

    @And("Select the Element in the dropdown menu:")
    public void selectTheElementInTheDropdownMenu(DataTable linkler) {
//        WebElement menuAccountTypes= getDriver().findElement(By.xpath("//*[@id='type']"));
//        Select select=new Select(menuAccountTypes);
//        select.selectByIndex(1);
//
//        WebElement menuAccountNumbers= getDriver().findElement(By.xpath("//*[@id='fromAccountId']"));
//        Select selectAccNumber=new Select(menuAccountNumbers);
//        selectAccNumber.selectByIndex(1);
        dc.mySelect(dc.accountTypes, 1);
        dc.mySelect(dc.accountNumbers,1);

    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog() {
        dc.myClick(dc.confirmOpenNewAccount);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed(DataTable linkler) {
        dc.verifyContainsText(dc.successMessage, "Account Opened!");
    }
}
