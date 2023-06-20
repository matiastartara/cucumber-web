package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FlightPage;
import pages.HomePage;
import pages.NavigationBarPage;
import utils.Driver;

public class SearchFlightStep {

    private HomePage homePage;
    private NavigationBarPage navigationBarPage;
    private FlightPage flightPage;

    public SearchFlightStep(BaseStep baseStep) {
        homePage = new HomePage(Driver.getDriver());
        navigationBarPage = new NavigationBarPage(Driver.getDriver());
        flightPage = new FlightPage(Driver.getDriver());
    }

    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://demo.guru99.com/test/newtours/index.php");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Welcome: Mercury Tours");
    }

    @When("user go to flights section")
    public void userGoToFlightsSection() {
        navigationBarPage.selectOption("Flights");
    }

    @When("the user search for a flight from {string} to {string}")
    public void theUserSearchForAFlightFromTo(String from, String to) {
        flightPage.selectFrom(from)
                .selectTo(to)
                .findFlights();
    }

    @Then("the system returns no seats available")
    public void theSystemReturnsNoSeatsAvailable() {
        Assert.assertEquals(flightPage.getSearchResponse(), "After flight finder - No Seats Avaialble  ");
    }
}
