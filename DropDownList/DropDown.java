package DropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C://Test stuffs//chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/dropdown");

        WebElement dropdownButtun = driver.findElement(By.id("dropdownMenuButton"));
        dropdownButtun.click();
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
        driver.quit();
    }
}
