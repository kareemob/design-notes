package com.qacart.pages;

import com.qacart.config.ConfigFactory;
import com.qacart.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage extends BasePage {
    private final By newTodoInput = By.cssSelector("[data-testid=\"new-todo\"]");
    private final By newTodoSubmit = By.cssSelector("[data-testid=\"submit-newTask\"]");

    public NewTodoPage(WebDriver driver){
        super(driver);
    }

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
    @Override
    public void load(){
        driver.get(ConfigFactory.getConfig().url() + "/signup");
    }
}
