package com.qacart.pages;

import com.qacart.base.BasePage;
import com.qacart.config.ConfigFactory;
import com.qacart.models.Todo;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class NewTodoPage implements BasePage {
    private final By newTodoInput = By.cssSelector("[data-testid=\"new-todo\"]");
    private final By newTodoSubmit = By.cssSelector("[data-testid=\"submit-newTask\"]");

    @Step("Add new todo")
    public void addNewTodo(Todo todo){
        getDriver().findElement(newTodoInput).sendKeys(todo.getItem());
        getDriver().findElement(newTodoSubmit).click();
    }
    @Override
    @Step("Load new todo page")
    public void load() {
        getDriver().get(ConfigFactory.getConfig().url() + "/todo/new");
    }
}
