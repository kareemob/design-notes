package com.qacart.testcases;

import com.qacart.config.ConfigFactory;
import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
        driver.manage().window().fullscreen();
    }

    @Test
    public void userShouldBeAbleToRegister(){
        RegisterPage registerPage = new RegisterPage(driver);


        registerPage.fillFirstName("K.com");
        registerPage.fillLastName("test!");
        registerPage.fillEmail(Instant.now().toEpochMilli() + "test@gmail.com");
        registerPage.fillPassword("Test123!");
        registerPage.fillConfirmPassword("Test123!");
        registerPage.clickSignUp();

        TodoPage todoPage = new TodoPage(driver);
        Assert.assertTrue(todoPage.isWelcomeMessageDisplayed());
    }
}
