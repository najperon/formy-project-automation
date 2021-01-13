package BasicSendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.setProperty("webdriver.chrome.driver","C:\\Test stuffs\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/keypress");
        WebElement name = driver.findElement(By.id("name"));
        Thread.sleep(3000);
        name.click();
        Thread.sleep(3000);
        name.sendKeys("Najila Peron");
        Thread.sleep(3000);
        WebElement button = driver.findElement(By.id("button"));
        button.click();
        driver.quit();
    }
}
