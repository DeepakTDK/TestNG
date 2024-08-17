package org.deepak.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHrm {
    WebDriver driver = new ChromeDriver();;

    @Test(priority = 1)
    void openapp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 2)
    void testLogo() throws InterruptedException {
        this.openapp();
        Thread.sleep(3000);
        Boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("Logo status:"+status);
    }
    @Test(priority = 3)
    void testlogin(){
        this.openapp();
        WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
        uname.sendKeys("Admin");
        pwd.sendKeys("admin123");
        btn.click();
    }
    @Test(priority = 4)
    void closeApp(){
        this.openapp();
        driver.quit();
    }
}
