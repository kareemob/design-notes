package com.qacart.testcases;

import com.qacart.config.ConfigFactory;
import com.qacart.driver.Driver;
import com.qacart.driver.driverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class RegisterTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        Driver.initDriver();
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(59));
    }

    @Test
    public void userShouldBeAbleToRegister(){

        driver.get(ConfigFactory.getConfig().url() + "/signup");
        driver.findElement(By.cssSelector("[data-testid=\"first-name\"]")).sendKeys("K.com");
        driver.findElement(By.cssSelector("[data-testid=\"last-name\"]")).sendKeys("test!");
        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys(Instant.now().toEpochMilli() + "test@gmail.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Test123!");
        driver.findElement(By.cssSelector("[data-testid=\"confirm-password\"]")).sendKeys("Test123!");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();
    }
}
