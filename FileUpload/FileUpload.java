package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void  main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Test stuffs//chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadfield = driver.findElement(By.id("file-upload-field"));
        fileUploadfield.sendKeys("upload-image.jpg");

        driver.quit();
    }
}
