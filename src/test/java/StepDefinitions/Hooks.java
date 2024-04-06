package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.annotations.BeforeClass;

public class Hooks {

    @Before
    public void before(){
        System.out.println("Senaryo Başladı");
    }

    @After
    public void after(Scenario senaryo){

        if (senaryo.isFailed()){
            /* Aşağıdaki bölüm sadece extend report plugini devrede ise açılır
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            byte[] hafizadakiHali= ts.getScreenshotAs(OutputType.BYTES);
           senaryo.attach(hafizadakiHali, "image/png", "screenshot name"); */
        }
        GWD.quitDriver();

    }
}
