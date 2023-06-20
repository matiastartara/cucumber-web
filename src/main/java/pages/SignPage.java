package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignPage extends BasePage {
    @FindBy(name = "userName")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement passwd;

    @FindBy(name = "submit")
    private WebElement submitButton;

    @FindBy(css = "table tr > td > p  b")
    private WebElement welcomeMessage;

    public SignPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        closePopup();
        type(this.username, username);
        type(this.passwd, password);
        click(submitButton);
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

}
