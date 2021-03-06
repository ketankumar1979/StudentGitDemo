package GitPractice.StepDefinitionsPackage;

import GitPractice.PageObjectPackage.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("^user is on the home page to search for the product$")
    public void userIsOnTheHomePageToSearchForTheProduct() {
       // homePage.getHomePageUrl();

    }

    @When("^user type 'nike' to search for product$")
    public void userTypeNikeToSearchForProduct() {
        homePage.dosearch("nike");
    }


    @Then("^user should able to see all the nike products$")
    public void userShouldAbleToSeeAllTheNikeProducts() {
      //  homePage.getResultPageHeader();
    }

}
