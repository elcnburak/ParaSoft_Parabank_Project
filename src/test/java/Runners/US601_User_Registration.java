package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US601_User_Registration.feature"},
        glue = {"StepDefinitions"}
)
public class US601_User_Registration extends AbstractTestNGCucumberTests {
}
