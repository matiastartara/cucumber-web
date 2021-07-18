package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.SignPage;

public class LoginStep {

    WebDriver driver;
    SignPage sign_page;
    HomePage home;

    public LoginStep(BaseStep base){
        this.driver=base.getDriver();
        sign_page = new SignPage(this.driver);
        home = new HomePage(this.driver);
    }

    @Given("user click on Sign in")
    public void user_click_on_sign_in() {
        home.clickOnSign();
    }

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_email_and_password(String email,String password) {
        sign_page.login(email,password);
    }

    @Then("error message is displayed")
    public void error_message_is_displayed() {
        Assert.assertEquals(sign_page.getErrorLoginMessage(),"Authentication failed.");
    }
}
