package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class US602_User_Login extends GWD {
    LeftNav ln = new LeftNav();
    private WebDriver driver;

    // Constructor
    public US602_User_Login() {
        this.driver = getDriver(); // WebDriver nesnesini başlatmak için getDriver() metodunu kullanın ya da başka bir uygun başlatma yöntemi kullanın.
    }

    @And("The user sees the {string} section on the home page.")
    public void theUserSeesTheSectionOnTheHomePage(String sectionName) {
        // Implementation
    }

    @And("write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable userPass) {
        // Implementation
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        String expectedUrl = "https://parabank.parasoft.com/parabank/index.htm";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl(), "User login failed");
    }
}
