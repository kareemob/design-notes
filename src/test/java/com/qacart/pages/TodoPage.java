package com.qacart.pages;

import com.qacart.config.ConfigFactory;
import com.qacart.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage extends BasePage {
    //elements
    public final By welcomeMessage = By.cssSelector("[data-testid=\"welcome\"]");
    public final By plusButton = By.cssSelector("[data-testid=\"add\"]");
    public final By todoItem = By.cssSelector("[data-testid=\"todo-item\"]");
    public final By deleteIcon = By.cssSelector("[data-testid=\"delete\"]");
    public final By noTodos = By.cssSelector("[data-testid=\"no-todos\"]");

    //Constructor
    public TodoPage(WebDriver driver){
        super(driver);
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

    @Override
    public void load(){
        driver.get(ConfigFactory.getConfig().url() + "/todo");
    }
}
