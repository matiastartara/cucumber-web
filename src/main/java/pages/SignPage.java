package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignPage extends BasePage {

    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="passwd")
    private WebElement passwd;

    @FindBy(id="SubmitLogin")
    private WebElement submitButton;

    @FindBy(how= How.CSS,using="#center_column > .alert.alert-danger li")
    private WebElement errorMessage;

    public SignPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email,String password){
        completeInformation(this.email,email);
        completeInformation(this.passwd,password);
        click(submitButton);
    }

    public String getErrorLoginMessage(){
        return errorMessage.getText();
    }
}
