package com.qacart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage {
    private WebDriver driver;
    //elements
    public final By welcomeMessage = By.cssSelector("[data-testid=\"welcome\"]");
    public final By plusButton = By.cssSelector("[data-testid=\"add\"]");
    public final By todoItem = By.cssSelector("[data-testid=\"todo-item\"]");
    public final By deleteIcon = By.cssSelector("[data-testid=\"delete\"]");
    public final By noTodos = By.cssSelector("[data-testid=\"no-todos\"]");

    //Constructor
    public TodoPage(WebDriver driver){
        this.driver = driver;
    }

    //method,steps

    public Boolean isWelcomeMessageDisplayed() {
        return driver.findElement(welcomeMessage).isDisplayed();
    }

    public void clickAddTodo() {
        driver.findElement(plusButton).click();
    }

    public Boolean isTodoDisplayed() {
        return driver.findElement(todoItem).isDisplayed();
    }

    public void clickDeleteIcon() {
        driver.findElement(deleteIcon).click();
    }

    public Boolean noTodosIsDisplayed() {
        return driver.findElement(noTodos).isDisplayed();
    }
}
