package Implicit.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaits {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver",
                "C://Test stuffs//chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/autocomplete");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd. Pablo Alto, CA");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        driver.quit();
    }
}
