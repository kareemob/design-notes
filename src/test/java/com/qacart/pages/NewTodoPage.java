package com.qacart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage {
    private WebDriver driver;
    private final By newTodoInput = By.cssSelector("[data-testid=\"new-todo\"]");
    private final By newTodoSubmit = By.cssSelector("[data-testid=\"submit-newTask\"]");

    public NewTodoPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * The 2 methods below are unnecessary as we have to both hide the implementation and keep everything simple
     */
    private void fillTodoName(String taskDescription) {
        driver.findElement(newTodoInput).sendKeys(taskDescription);
    }

    private void clickCreateTodo(){
        driver.findElement(newTodoSubmit).click();
    }

    public void addNewTodo(){
        fillTodoName("learn anything!");
        clickCreateTodo();
    }

}
