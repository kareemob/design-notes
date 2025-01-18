package com.qacart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage {
    private final By newTodoInput = By.cssSelector("[data-testid=\"new-todo\"]");
    private final By newTodoSubmit = By.cssSelector("[data-testid=\"submit-newTask\"]");


    private void fillTodoName(WebDriver driver, String taskDescription) {
        driver.findElement(newTodoInput).sendKeys(taskDescription);
    }

    private void clickCreateTodo(WebDriver driver){
        driver.findElement(newTodoSubmit).click();
    }

    public void addNewTodo(WebDriver driver){
        driver.findElement(newTodoInput).sendKeys("learn anything!");
        driver.findElement(newTodoSubmit).click();
    }

}
