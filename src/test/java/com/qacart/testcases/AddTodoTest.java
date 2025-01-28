package com.qacart.testcases;

import com.qacart.base.BaseTest;
import com.qacart.config.ConfigFactory;
import com.qacart.models.Todo;
import com.qacart.pages.NewTodoPage;
import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.qacart.driver.driverManager.DriverManager.getDriver;
import static com.qacart.fixtures.UserFixtures.getDefaultUser;

@Feature("Adding todo")
public class AddTodoTest extends BaseTest {
    TodoPage todoPage;
    RegisterPage registerPage;
    @BeforeMethod
    public void setup(){
        registerPage = new RegisterPage();
        todoPage = new TodoPage();
        getDriver().get(ConfigFactory.getConfig().url() + "/signup");
        registerPage.registerApi(getDefaultUser());
        todoPage.load();
    }

    @Test(description = "Should be able to add todo")
    public void createTodo() {
        todoPage.clickAddTodo();
        NewTodoPage newTodoPage = new NewTodoPage();
        Todo todo = Todo.builder().item("test").build();
        newTodoPage.addNewTodo(todo);
        Assert.assertTrue(todoPage.isTodoDisplayed());
    }

}
