package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends PageBase{
    public CartPage (WebDriver driver){super(driver);}

    /********************Locators********************/
    @FindBy(xpath = "//span[@class='a-truncate-cut']")
    WebElement itemNameEle;
    @FindBy(xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    WebElement itemPriceEle;

    public void isItemNameSame(String itemName){
        Assert.assertEquals(itemNameEle.getText(), itemName, "The item name is not the same");
    }
    /********************Assertions********************/
    public void isItemPriceSame(int expectedItemPrice){
        String itemPriceString = itemPriceEle.getText();
        itemPriceString = itemPriceString.replaceAll("[^\\d]", "");
        int itemPrice = Integer.parseInt(itemPriceString);
        Assert.assertEquals(itemPrice, expectedItemPrice*100, "The item price is not the same");
    }
}
