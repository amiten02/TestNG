package stepdefs;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user opens the login page")
    public void user_opens_login_page() {
        System.out.println("Opening login page");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("Entering valid credentials");
    }

    @Then("user is logged in")
    public void user_is_logged_in() {
        System.out.println("User logged in");
    }
}
