package com.qacart.testcases;

import com.qacart.driver.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DummyTest {
    @Test
    public void ddd(){
        WebDriver driver = DriverFactory.initDriver();
        driver.get("https://todo.qacart.com");
        driver.quit();
    }
}
