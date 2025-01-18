package com.qacart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage {
    //elements
    public final By welcomeMessage = By.cssSelector("[data-testid=\"welcome\"]");
    public final By plusButton = By.cssSelector("[data-testid=\"add\"]");
    public final By todoItem = By.cssSelector("[data-testid=\"todo-item\"]");
    public final By deleteIcon = By.cssSelector("[data-testid=\"delete\"]");
    public final By noTodos = By.cssSelector("[data-testid=\"no-todos\"]");

    //method,steps

    public Boolean isWelcomeMessageDisplayed(WebDriver driver) {
        return driver.findElement(welcomeMessage).isDisplayed();
    }

    public void clickAddTodo(WebDriver driver) {
        driver.findElement(plusButton).click();
    }

    public Boolean isTodoDisplayed(WebDriver driver) {
        return driver.findElement(todoItem).isDisplayed();
    }

    public void clickDeleteIcon(WebDriver driver) {
        driver.findElement(deleteIcon).click();
    }

    public Boolean noTodosIsDisplayed(WebDriver driver) {
        return driver.findElement(noTodos).isDisplayed();
    }
}
