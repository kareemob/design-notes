package com.qacart.pages;

import com.qacart.base.BasePage;
import com.qacart.components.TodoComponent;
import com.qacart.config.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class TodoPage implements BasePage {
    //elements
    public final By welcomeMessage = By.cssSelector("[data-testid=\"welcome\"]");
    public final By plusButton = By.cssSelector("[data-testid=\"add\"]");
    public final By todoItem = By.cssSelector("[data-testid=\"todo-item\"]");
    public final By noTodos = By.cssSelector("[data-testid=\"no-todos\"]");
    public final List<TodoComponent> todos = new ArrayList<>();

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

    public List<TodoComponent> loadTodos(){
        List<WebElement> availableTodos = getDriver().findElements(todoItem);
        for (WebElement availableTodo : availableTodos){
            todos.add(new TodoComponent());
        }
        return this.todos;
    }

//    public void clickDeleteIcon() {
//        todos.clickDeleteIcon();
//    }

    public Boolean noTodosIsDisplayed() {
        return getDriver().findElement(noTodos).isDisplayed();
    }
    @Override
    public void load() {
        getDriver().get(ConfigFactory.getConfig().url() + "/todo");
    }
}
