package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class02Task1 {

    /*
    HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account

what is the reason, will discuss in next lecture
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        //driver.manage().window().maximize();


        WebElement createBtn = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
        createBtn.click();
        Thread.sleep(2000);

        WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameTextBox.sendKeys("Tom");

        WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastNameTextBox.sendKeys("Snow");

        WebElement mobileOrEmailTextBox = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mobileOrEmailTextBox.sendKeys("444-124-5222");

        WebElement passTextBox = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        passTextBox.sendKeys("5467hello");

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        month.click();

        WebElement selectMonth = driver.findElement(By.xpath("//option[text() = 'Sep']"));
        selectMonth.click();

        WebElement day = driver.findElement(By.xpath("//select[@id = 'day']"));
        day.click();

        WebElement selectDay = driver.findElement(By.xpath("//option[text() = '17']"));
        selectDay.click();

        WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        birthDay.click();

        WebElement selectBDay = driver.findElement(By.xpath("//option[text()='1996']"));
        selectBDay.click();

        WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
        gender.click();

        Thread.sleep(2000);


        driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
