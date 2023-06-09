package SeleniumHW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HMJune7 extends CommonMethods {
    /*
    hw:
goto syntax hrms
login
click on recruitment
select a date on the calanader
     */

    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        //        Click on Recruitment
        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentBtn.click();
        //        Open Calendar
        WebElement calendarBtn= driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calendarBtn.click();
        // click year btn
        WebElement yearBtn = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        yearBtn.click();
        // select year
        Select select = new Select(yearBtn);
        select.selectByVisibleText("2020");
        // click month btn
        WebElement monthBtn = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        monthBtn.click();
        // select month
        Select sel = new Select(monthBtn);
        sel.selectByVisibleText("Sep");

        List<WebElement> allDay = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day:allDay){
            String currentDay = day.getText();
            if (currentDay.equals("7")) {
                day.click();
                break;
            }
        }
    }
}
