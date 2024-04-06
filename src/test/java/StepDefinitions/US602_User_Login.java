package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;

public class US602_User_Login extends GWD {
    LeftNav ln=new LeftNav();
    @And("The user sees the {string} section on the home page.")
    public void theUserSeesTheSectionOnTheHomePage(String arg0) {

    }

    @And("write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable() {
    }
}
