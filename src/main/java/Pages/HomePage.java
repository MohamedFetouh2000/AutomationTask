package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver){
        super(driver);
    }

    /********************Locators********************/
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBar;

    /********************Steps********************/
    public void searchForItem(String itemName){
        searchBar.click();
        searchBar.sendKeys(itemName);
        searchBar.sendKeys(Keys.ENTER);
    }
}