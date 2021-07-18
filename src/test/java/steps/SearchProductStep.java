package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.ResultProductPage;

public class SearchProductStep {

    WebDriver driver;
    HomePage home;
    ResultProductPage resultProduct;

    public SearchProductStep(BaseStep base){
        this.driver=base.getDriver();
        home = new HomePage(this.driver);
    }

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php");
        Assert.assertEquals(driver.getTitle(),"My Store");
    }

    @When("user enters a {string} in the search bar")
    public void user_enters_a_in_the_search_bar(String product) {
        home.completeSearchBar(product);
    }

    @When("the user click on search button")
    public void the_user_click_on_search_button() {
        home.clickOnSearchBtn();
    }

    @Then("the results are displayed on the list")
    public void the_results_are_displayed_on_the_list() {
        resultProduct = new ResultProductPage(this.driver);
        Assert.assertTrue(resultProduct.getH1Text().contains("SHORT"));
        Assert.assertTrue(resultProduct.getProductListSize() >0,"There are not shorts displayed");
    }
}
