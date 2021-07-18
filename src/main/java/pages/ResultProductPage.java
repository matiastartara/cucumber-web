package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ResultProductPage extends BasePage {


    @FindBy(how= How.CSS,using="#center_column > h1 > span.lighter")
    private WebElement h1text;

    @FindBy(how=How.CSS,using=".product_list  .product-container")
    private List<WebElement> productList;

    public ResultProductPage(WebDriver driver) {
        super(driver);
    }

    public String getH1Text(){
        return getWait().until(ExpectedConditions.visibilityOf(h1text)).getText();
    }

    public int getProductListSize(){
        return productList.size();
    }
}
