$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resource/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage features",
  "description": "",
  "id": "homepage-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search for products",
  "description": "",
  "id": "homepage-features;search-for-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the home page to search for the product",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user type \u0027nike\u0027 to search for product",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should able to see all the nike products",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnTheHomePageToSearchForTheProduct()"
});
formatter.result({
  "duration": 2048836200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userTypeNikeToSearchForProduct()"
});
formatter.result({
  "duration": 1203600,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.sendKeys(Unknown Source)\r\n\tat GitPractice.PageObjectPackage.HomePage.dosearch(HomePage.java:27)\r\n\tat GitPractice.StepDefinitionsPackage.HomePageSteps.userTypeNikeToSearchForProduct(HomePageSteps.java:20)\r\n\tat ✽.When user type \u0027nike\u0027 to search for product(src/test/Resource/HomePage.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.userShouldAbleToSeeAllTheNikeProducts()"
});
formatter.result({
  "status": "skipped"
});
});