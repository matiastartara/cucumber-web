package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightPage extends BasePage {

    @FindBy(name = "fromPort")
    private WebElement fromPort;

    @FindBy(name = "toPort")
    private WebElement toPort;

    @FindBy(name = "findFlights")
    private WebElement findBtn;

    @FindBy(css = "p > font > b > font")
    private WebElement resultMsg;

    public FlightPage(WebDriver driver) {
        super(driver);
    }

    public FlightPage selectFrom(String from) {
        selectByValue(fromPort, from);
        return this;
    }

    public FlightPage selectTo(String to) {
        selectByValue(toPort, to);
        return this;
    }

    public void findFlights() {
        click(findBtn);
    }

    public String getSearchResponse() {
        getWait().until(ExpectedConditions.visibilityOf(resultMsg));
        return resultMsg.getText();
    }
}
