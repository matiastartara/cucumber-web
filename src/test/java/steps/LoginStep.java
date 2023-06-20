package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.SignPage;
import utils.Driver;

public class LoginStep {

    private SignPage signPage;
    private HomePage homePage;

    public LoginStep(BaseStep baseStep) {
        signPage = new SignPage(Driver.getDriver());
        homePage = new HomePage(Driver.getDriver());
    }

    @Given("user click on Sign in")
    public void userClickOnSignIn() {
        homePage.clickOnSign();
    }

    @When("user enter valid {string} and {string}")
    public void userEnterValidAnd(String email, String password) {
        signPage.login(email, password);
    }

    @Then("welcome message is displayed")
    public void welcomeMessageIsDisplayed() {
        Assert.assertEquals(signPage.getWelcomeMessage(), "Thank you for Loggin.");
    }

}
