package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.Driver;


public class BaseStep {

    private static Driver driver;

    @Before
    public void setUp(){
        driver = new Driver();
        driver.getDriver().navigate().to("http://automationpractice.com/index.php");
    }

    public WebDriver getDriver() {
        return driver.getDriver();
    }

    @After
    public void tearDown(){
        driver.getDriver().close();
    }
}
