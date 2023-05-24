package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3Task2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@name ='txtUsername']"));
        userName.sendKeys("Aslan");
        Thread.sleep(2000);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@name = 'Submit']"));
        loginBtn.click();
    }
}
