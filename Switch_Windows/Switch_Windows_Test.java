package Switch_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Windows_Test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C://Test stuffs//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/switch-window");

        WebElement NewTabButton = driver.findElement(By.id("new-tab-button"));
        NewTabButton.click();
        Thread.sleep(1000);
        String originalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        Thread.sleep(1000);
        driver.switchTo().window(originalHandle);
        Thread.sleep(1000);
        driver.quit();
    }
}
