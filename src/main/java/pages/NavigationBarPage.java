package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBarPage extends BasePage {

    public NavigationBarPage(WebDriver driver) {
        super(driver);
    }

    public void selectOption(String option) {
        WebElement e = getDriver().findElement(By.xpath("//a[text()='" + option + "']"));
        click(e);
        closePopup();
    }

}
