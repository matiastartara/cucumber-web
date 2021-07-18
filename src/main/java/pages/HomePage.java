package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how= How.CSS,using=".login")
    private WebElement signButton;

    @FindBy(how= How.NAME,using="search_query")
    private WebElement searchBar;

    @FindBy(how= How.NAME,using="submit_search")
    private WebElement searchBtn;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSign(){
        click(signButton);
    }

    public void completeSearchBar(String productName){
        completeInformation(searchBar,productName);
    }

    public void clickOnSearchBtn(){
        click(searchBtn);
    }
}
