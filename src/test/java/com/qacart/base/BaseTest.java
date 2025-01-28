package com.qacart.base;

import com.qacart.driver.Driver;
import com.qacart.utils.ScreenshotUtils;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class BaseTest {
    @BeforeMethod
    protected void driverSetup(){
        Driver.initDriver();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().manage().window().maximize();
    }

    @AfterMethod
    protected void tearDown(ITestResult testResult){
        //Take screenshot
        ScreenshotUtils.takeScreenshot(testResult);
        getDriver().quit();
    }
}
