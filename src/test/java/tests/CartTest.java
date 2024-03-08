package tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.SearchResultPage;
import org.testng.annotations.Test;

public class CartTest extends TestBase{

    HomePage homePage;
    SearchResultPage searchResultPage;
    ProductPage productPage;
    CartPage cartPage;

    @Test
    public void addToCart() throws InterruptedException {
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        homePage.searchForItem("ipad");
        searchResultPage.sortFromHighToLow();
        searchResultPage.openProductPage();
        String itemName = productPage.getItemName();
        int itemPrice = productPage.getItemPrice();
        productPage.addItemToCart();
        productPage.openCartPage();
        cartPage.isItemNameSame(itemName);
        cartPage.isItemPriceSame(itemPrice);
    }
}
