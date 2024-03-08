package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageBase{
    public SearchResultPage(WebDriver driver){super(driver);}

    /********************Locators********************/
    @FindBy(xpath = "//span[@class = 'a-button-text a-declarative']")
    WebElement sortList;
    @FindBy(id = "s-result-sort-select_2")
    WebElement highToLow;
    @FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
    WebElement firstItemNameEle;

    /********************Steps********************/
    public void sortFromHighToLow(){
        sortList.click();
        highToLow.click();
    }
    public void openProductPage(){
        waitElementVisible(3000,firstItemNameEle);
        firstItemNameEle.click();
    }
}
