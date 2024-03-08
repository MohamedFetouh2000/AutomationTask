package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    WebDriver driver;
    JavascriptExecutor js;

    public PageBase (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    protected void jsClick(WebElement ele){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ele);
    }
    protected void jsScroll (WebElement ele){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ele);
    }
    protected void waitElementVisible(int seconds, WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
}
