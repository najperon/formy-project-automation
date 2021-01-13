package CompleteWebForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebForm {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C://Test stuffs//chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Najila");
        driver.findElement(By.id("last-name")).sendKeys("Peron");
        driver.findElement(By.id("job-title")).sendKeys("Student");
        Thread.sleep(2000);

        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("datepicker")).sendKeys("07/07/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        //Primary it was "class="btn btn-lg btn-primary"
        //remember to use . between the name class)
        //when it is a full name class remember to insert the dot(.) at the beggining or it will not gonna work
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        //driver.quit();
    }
}
