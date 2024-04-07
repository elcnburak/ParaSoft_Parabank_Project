package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US602_User_Login.feature"},
        glue = {"StepDefinitions"}
)
public class US602_User_Login extends AbstractTestNGCucumberTests{


}



