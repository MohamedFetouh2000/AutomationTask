package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{
    public ProductPage(WebDriver driver){super(driver);}

    /********************Locators********************/
    @FindBy(xpath = "//span[@class='a-size-large product-title-word-break']")
    WebElement itemNameEle;
    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    WebElement itemPriceEle;
    @FindBy(id = "add-to-cart-button")
    WebElement addToCartBtn;
    @FindBy(id = "attachSiNoCoverage-announce")
    WebElement noThanksBtn;
    @FindBy(id = "nav-cart")
    WebElement cartBtn;

    /********************Steps********************/
    public String getItemName(){
        return itemNameEle.getText();
    }
    public int getItemPrice(){
        String itemPriceString;
        itemPriceString = itemPriceEle.getText();
        itemPriceString = itemPriceString.replaceAll("[^\\d]", "");
        return Integer.parseInt(itemPriceString);
    }
    public void addItemToCart() throws InterruptedException {
        addToCartBtn.click();
        jsClick(noThanksBtn);
        Thread.sleep(3000);
    }
    public void openCartPage(){
        jsClick(cartBtn);
    }
}
