package com.qacart.pages;

import com.qacart.base.BasePage;
import com.qacart.client.TodoClient;
import com.qacart.components.TodoComponent;
import com.qacart.config.ConfigFactory;
import com.qacart.models.Todo;
import io.qameta.allure.Step;
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
    @Step("Is welcome message displayed")
    public Boolean isWelcomeMessageDisplayed() {
        return getDriver().findElement(welcomeMessage).isDisplayed();
    }
    @Step("Click add todo button")
    public void clickAddTodo() {
        getDriver().findElement(plusButton).click();
    }
    @Step("Is todo displayed")
    public Boolean isTodoDisplayed() {
        return getDriver().findElement(todoItem).isDisplayed();
    }
    @Step("Load todos")
    public List<TodoComponent> loadTodos(){
        List<WebElement> availableTodos = getDriver().findElements(todoItem);
        for (WebElement availableTodo : availableTodos){
            todos.add(new TodoComponent());
        }
        return this.todos;
    }

    @Step("Is no todos message displayed")
    public Boolean noTodosIsDisplayed() {
        return getDriver().findElement(noTodos).isDisplayed();
    }
    @Override
    public void load() {
        getDriver().get(ConfigFactory.getConfig().url() + "/todo");
    }
    @Step("Adding todo through api")
    public void addTodoApi(Todo todo, String token){
        TodoClient.addTask(token, todo);
    }
}
