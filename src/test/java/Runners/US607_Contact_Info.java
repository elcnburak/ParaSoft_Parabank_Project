package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US607_Contact_Info.feature"},
        glue = {"StepDefinitions"}
)
public class US607_Contact_Info extends AbstractTestNGCucumberTests {


}



