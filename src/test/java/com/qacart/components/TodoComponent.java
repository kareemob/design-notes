package com.qacart.components;

import org.openqa.selenium.By;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class TodoComponent {
    public final By deleteIcon = By.cssSelector("[data-testid=\"delete\"]");

    public void clickDeleteIcon() {
        getDriver().findElement(deleteIcon).click();
    }
}
