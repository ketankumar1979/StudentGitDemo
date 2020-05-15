package GitPractice.PageObjectPackage;

import GitPractice.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    @FindBy(id = "searchTerm")
    private WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    private WebElement magnifierGlass;

    @FindBy(xpath = "//div[@class='search-title']")
    WebElement resultOfNike;


    public void getHomePageUrl(){
        String actual = driver.getCurrentUrl();
        Assert.assertThat(actual, Matchers.equalToIgnoringCase("https://www.argos.co.uk/"));
    }

    public void dosearch(String item){
        SearchTextBox.sendKeys(item);
        magnifierGlass.click();
    }

    public void getResultPageHeader(){
        String actualNikeResult = resultOfNike.getText();
        Assert.assertThat(actualNikeResult, Matchers.containsString("nike"));

    }
}
