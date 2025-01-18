package com.qacart.pages.base;

import com.qacart.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected final WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public abstract void load();
}
