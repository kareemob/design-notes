package com.qacart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class TodoPage {
    //elements
    public final By welcomeMessage = By.cssSelector("[data-testid=\"welcome\"]");
    public final By plusButton = By.cssSelector("[data-testid=\"add\"]");
    public final By todoItem = By.cssSelector("[data-testid=\"todo-item\"]");
    public final By deleteIcon = By.cssSelector("[data-testid=\"delete\"]");
    public final By noTodos = By.cssSelector("[data-testid=\"no-todos\"]");

    //method,steps

    public Boolean isWelcomeMessageDisplayed() {
        return getDriver().findElement(welcomeMessage).isDisplayed();
    }

    public void clickAddTodo() {
        getDriver().findElement(plusButton).click();
    }

    public Boolean isTodoDisplayed() {
        return getDriver().findElement(todoItem).isDisplayed();
    }

    public void clickDeleteIcon() {
        getDriver().findElement(deleteIcon).click();
    }

    public Boolean noTodosIsDisplayed() {
        return getDriver().findElement(noTodos).isDisplayed();
    }
}
