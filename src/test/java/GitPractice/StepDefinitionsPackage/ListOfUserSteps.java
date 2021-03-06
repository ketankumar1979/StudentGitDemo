package GitPractice.StepDefinitionsPackage;

import GitPractice.PageObjectPackage.GetListOfUsers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class ListOfUserSteps {
    RequestSpecification req;
    Response response;

    GetListOfUsers getListOfUsers = new GetListOfUsers();

    @Given("^base URI$")
    public void base_URI() throws Throwable {
        //RestAssured.baseURI = "https://reqres.in/";
     req = given().baseUri(getListOfUsers.baseUri());
    }

    @When("^user use get method resource$")
    public void user_use_get_method_resource() throws Throwable {
         response = req.when().get(getListOfUsers.resource());
    }

    @Then("^user should see response status code (\\d+)$")
    public void user_should_see_response_status_code(int arg1) throws Throwable {
     response.then().log().all().assertThat().statusCode(200).and().body("data.id",hasItems(7,8,9)).
                and().contentType(ContentType.JSON);
    }

    @Then("^user should validate body response successfully$")
    public void user_should_validate_body_response_successfully() throws Throwable {

    }



}
