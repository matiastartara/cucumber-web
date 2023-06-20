package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    @FindBy(how = How.XPATH, using = "//a[text()='SIGN-ON']")
    private WebElement signButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSign(){
        click(signButton);
    }

}
