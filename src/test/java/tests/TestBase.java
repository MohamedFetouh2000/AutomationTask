package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    WebDriver driver;

    @BeforeTest
    public void setUpEnvironment(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.eg/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        String expectedResult = "https://www.amazon.eg/";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"current url of amazon Assertion");
    }
    @AfterTest
    public void closeWindow() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
