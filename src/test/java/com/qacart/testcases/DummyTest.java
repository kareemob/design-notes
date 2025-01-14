package com.qacart.testcases;

import com.qacart.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DummyTest {

    @Test
    public void dd(){
        WebDriver driver = new DriverFactory().initDriver();
        driver.manage().window().maximize();
        driver.get("https://todo.qacart.com");
        driver.quit();
    }
}
