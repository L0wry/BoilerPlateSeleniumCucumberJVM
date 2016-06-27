package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.assertj.core.api.Assertions.*;
import static page_objects.Website.*;

public class HomepageSteps {

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        homePage().get();
    }

    @When("^I click on 'about'$")
    public void i_click_on_about() throws Throwable {
         homePage().goToAboutPage();
    }

    @Then("^I am taken to the about page$")
    public void i_am_taken_to_the_about_page() throws Throwable {
        assertThat(aboutPage().verifyYouAreOnThePage()).isTrue();
    }
}

