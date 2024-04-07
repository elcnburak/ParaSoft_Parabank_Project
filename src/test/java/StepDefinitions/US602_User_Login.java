package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.List;


public class US602_User_Login extends GWD {
    LeftNav ln=new LeftNav();
    private WebDriver driver;

    @And("The user sees the {string} section on the home page.")
    public void theUserSeesTheSectionOnTheHomePage(String sectionName) {
        Assert.assertTrue(ln.customerLogin.getText().toLowerCase().contains(sectionName.toLowerCase()), "Not on the user login page");
    }

    @And("write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable userPass) {
        List<List<String>> userData = userPass.asLists(String.class);

        String username = userData.get(0).get(0); // İlk sıradaki kullanıcı adı
        String password = userData.get(1).get(0); // İkinci sıradaki şifre

        ln.customerLoginUsername.sendKeys(username);
        ln.customerLoginPassword.sendKeys(password);
        ln.customerLoginButton.click();
        }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        String expectedUrl = "https://parabank.parasoft.com/parabank/index.htm";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }
}
