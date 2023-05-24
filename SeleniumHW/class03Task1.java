package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class03Task1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement fName = driver.findElement(By.xpath("//input[@name='first_name']"));
        fName.sendKeys("Aslan");

        WebElement lName = driver.findElement(By.xpath("//input[@name ='last_name']"));
        lName.sendKeys("Gagkaev");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("eqeqw123123@gmail.com");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("2405556622");

        WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys("4422 Broadway #22 ");

        WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Los Angeles");

        WebElement state = driver.findElement(By.xpath("//option[text()='California']"));
        state.click();

        WebElement zip = driver.findElement(By.xpath("//input[@name = 'zip']"));
        zip.sendKeys("20555");

        WebElement webSite = driver.findElement(By.xpath("//input[@name='website']"));
        webSite.sendKeys("www.asdasd2141.com");

        WebElement host = driver.findElement(By.xpath("//input[@value='no']"));
        host.click();

        WebElement textArea = driver.findElement(By.xpath("//textarea[@name='comment']"));
        textArea.sendKeys("Hello World!");






    }
}
