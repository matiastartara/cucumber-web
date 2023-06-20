package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

public class BaseStep {

    @Before
    public void setUp(){
        Driver.getDriver().navigate().to("https://demo.guru99.com/test/newtours/index.php");
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(){
        Driver.quit();
    }

}
