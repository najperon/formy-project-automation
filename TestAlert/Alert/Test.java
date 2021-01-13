package TestAlert.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Test stuffs//chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();


        driver.quit();
    }
}
