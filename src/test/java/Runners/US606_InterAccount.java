package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US606_InterAccount.feature"},
        glue = {"StepDefinitions"}
)
public class US606_InterAccount extends AbstractTestNGCucumberTests {


}

