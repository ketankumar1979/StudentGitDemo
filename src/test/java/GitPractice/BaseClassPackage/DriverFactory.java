package GitPractice.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {


    public static WebDriver driver;


    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    //public static final String USERNAME = "ketankumarpatel1";
    //public static final String AUTOMATE_KEY = "TD3x4sPqGjsxwRn7P6pk";
    //public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public void openBrowser()  {

        /*
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80");

        caps.setCapability("name", "ketankumarpatel1's Second Test");

         driver = new RemoteWebDriver(new URL(URL), caps);
       // driver.get("http://www.google.com");
       // WebElement element = driver.findElement(By.name("q"));

       // element.sendKeys("BrowserStack");
        //element.submit();

        //System.out.println(driver.getTitle());
        */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("consent_prompt_submit")).click();


    }

    public void closeBrowser(){
        driver.quit();
    }

}
