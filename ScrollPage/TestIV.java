package ScrollPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestIV {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Test stuffs//chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/scroll");
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Najla Peron");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("03/05/2019");
        driver.quit();



    }
}
