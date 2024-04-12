package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class US607_Contact_Info extends GWD {
    LeftNav ln = new LeftNav();

    public void clearTextBoxes() {
        ln.myClear(ln.customerName);
        ln.myClear(ln.lastName);
        ln.myClear(ln.customerAddress);
        ln.myClear(ln.customerCity);
        ln.myClear(ln.customerState);
        ln.myClear(ln.customerZipCode);
        ln.myClear(ln.customerPhoneNumber);
    }

    @And("user update Contact Info link and referred to the profile page")
    public void userUpdateContactInfoLinkAndReferredToTheProfilePage(DataTable dataTable) {
        ln.myClick(ln.updateContactInfo);

        clearTextBoxes();

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        String firstName = data.get(0).get("Name");
        String lastName = data.get(0).get("Surname");
        String address = data.get(0).get("Address");
        String city = data.get(0).get("City");
        String state = data.get(0).get("State");
        String postalCode = data.get(0).get("Postal Code");
        String phoneNumber = data.get(0).get("Phone Number");

        ln.myClick(ln.updateContactInfo);
        ln.mySendKeys(ln.customerName, firstName);
        ln.mySendKeys(ln.lastName, lastName);
        ln.mySendKeys(ln.customerAddress, address);
        ln.mySendKeys(ln.customerCity, city);
        ln.mySendKeys(ln.customerState, state);
        ln.mySendKeys(ln.customerZipCode, postalCode);
        ln.mySendKeys(ln.customerPhoneNumber, phoneNumber);
    }

    @And("Click the {string} button for the user update process")
    public void clickTheButtonForTheUserUpdateProcess(String arg0) {
        ln.myClick(ln.updateButton);
    }


    @Then("Their confirms that the updated contact information is displayed correctly when the user signs.")
    public void theirConfirmsThatTheUpdatedContactInformationIsDisplayedCorrectlyWhenTheUserSigns() {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 saniyelik bir zaman aşımı belirlendi

        WebElement profileUpdatedHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title' and text()='Profile Updated']")));
        Assert.assertTrue(profileUpdatedHeader.isDisplayed(), "Profile Updated");
    }

}
