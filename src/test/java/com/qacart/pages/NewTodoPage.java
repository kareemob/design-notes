package com.qacart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class NewTodoPage {
    private final By newTodoInput = By.cssSelector("[data-testid=\"new-todo\"]");
    private final By newTodoSubmit = By.cssSelector("[data-testid=\"submit-newTask\"]");


    private void fillTodoName(String taskDescription) {
        getDriver().findElement(newTodoInput).sendKeys(taskDescription);
    }

    private void clickCreateTodo(){
        getDriver().findElement(newTodoSubmit).click();
    }

    public void addNewTodo(){
        getDriver().findElement(newTodoInput).sendKeys("learn anything!");
        getDriver().findElement(newTodoSubmit).click();
    }

}
