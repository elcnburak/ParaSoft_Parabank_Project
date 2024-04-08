package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US608_Loan_Application.feature"},
        glue = {"StepDefinitions"}
)
public class US608_Loan_Application extends AbstractTestNGCucumberTests {

}
