package GitPractice.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    DriverFactory driverFactory = new DriverFactory();


    @Before
    public void setup()  {
        driverFactory.openBrowser();


    }

    @After
    public void teardown(){
        driverFactory.closeBrowser();
    }
}
