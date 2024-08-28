package org.deepak.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {

    WebDriver driver;
    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(dataProvider = "login")
    void logintest(String name, String pwd) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);
        boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
        if(status == true){
            Assert.assertTrue(true);
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
        }else{
            Assert.fail();
        }
    }

    @DataProvider(name = "login")
    Object[][] testdata(){
        Object[][] cred = {
                {"abc@xyz.com", "123"},
                {"def@xyz.com", "123"},
                {"ghi@xyz.com", "123"},
                {"jkl@xyz.com", "123"},
                {"dkfalcon97@gmail.com", "Thamandk25"},
        };

        return cred;
    }

    @AfterClass
    void teardown(){
        driver.close();
    }
}
