package CleanUpTheTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NiceandClean {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Test stuffs//chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        submitForm(driver);

        waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!",
                getAlertBannerText(driver));

        driver.quit();
    }

        public static void submitForm(WebDriver driver)
        {
        driver.findElement(By.id("first-name")).sendKeys("Najila");
        driver.findElement(By.id("last-name")).sendKeys("Peron");
        driver.findElement(By.id("job-title")).sendKeys("Student");


        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();


        driver.findElement(By.id("datepicker")).sendKeys("07/07/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

    public static void waitForAlertBanner(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedConditions
                .visibilityOfElementLocated(By.className("alert"))));
    }

    public static String getAlertBannerText(WebDriver driver)
    {
        return driver.findElement(By.className("alert")).getText();
    }
}