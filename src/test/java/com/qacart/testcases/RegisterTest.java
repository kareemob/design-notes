package com.qacart.testcases;


import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class RegisterTest {
    WebDriver driver;
    RegisterPage registerPage;

    @BeforeMethod
    public void setup(){
//        Driver.initDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(59));
        registerPage = new RegisterPage(driver);
        registerPage.load();
        driver.manage().window().maximize();
    }

    @Test
    public void userShouldBeAbleToRegister(){

        registerPage.register();
        TodoPage todoPage = new TodoPage(driver);
        Assert.assertTrue(todoPage.isWelcomeMessageDisplayed());
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
