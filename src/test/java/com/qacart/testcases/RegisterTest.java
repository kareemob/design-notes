package com.qacart.testcases;

import com.qacart.config.ConfigFactory;
import com.qacart.config.FrameWorkConfig;
import com.qacart.config.converters.StringToBrowserTypeConverter;
import com.qacart.driver.Driver;
import com.qacart.driver.driverManager.DriverManager;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class RegisterTest {

    @BeforeMethod
    public void setup(){
        Driver.initDriver();
    }

    @Test
    public void userShouldBeAbleToRegister(){

        DriverManager.getDriver().get(ConfigFactory.getConfig().url() + "/signup");
        DriverManager.getDriver().findElement(By.cssSelector("[data-testid=\"first-name\"]")).sendKeys("K.com");
        DriverManager.getDriver().findElement(By.cssSelector("[data-testid=\"last-name\"]")).sendKeys("test!");
        DriverManager.getDriver().findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys(Instant.now().toEpochMilli() + "test@gmail.com");
        DriverManager.getDriver().findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Test123!");
        DriverManager.getDriver().findElement(By.cssSelector("[data-testid=\"confirm-password\"]")).sendKeys("Test123!");
        DriverManager.getDriver().findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(59));
        DriverManager.getDriver().findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();
    }
}
