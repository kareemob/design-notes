package com.qacart.testcases;

import com.qacart.config.ConfigFactory;
import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class RegisterTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
//        Driver.initDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(59));
        driver.get(ConfigFactory.getConfig().url() + "/signup");
        driver.manage().window().maximize();
    }

    @Test
    public void userShouldBeAbleToRegister(){
        RegisterPage registerPage = new RegisterPage();
        registerPage.register(driver);
        TodoPage todoPage = new TodoPage();
        Assert.assertTrue(todoPage.isWelcomeMessageDisplayed(driver));
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
