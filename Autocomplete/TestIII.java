package Autocomplete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIII {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C://Test stuffs//chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/autocomplete");
        Thread.sleep(1000);
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd. Pablo Alto, CA");
        Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        driver.quit();

    }
}
