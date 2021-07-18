package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Driver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public Driver(){

        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        switch (browser) {
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                driver.set(new ChromeDriver(chromeOptions));
                break;
        }
        driver.get().manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver.get();
    }
}
