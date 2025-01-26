package com.qacart.testcases;

import com.qacart.base.BaseTest;
import com.qacart.config.ConfigFactory;
import com.qacart.fixtures.UserFixtures;
import com.qacart.models.Todo;
import com.qacart.models.User;
import com.qacart.pages.NewTodoPage;
import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import com.qacart.utils.DataUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.qacart.driver.driverManager.DriverManager.getDriver;
import static com.qacart.fixtures.UserFixtures.getDefaultUser;

public class DeleteTodoTest extends BaseTest {

    TodoPage todoPage;

    @BeforeMethod
    public void setup(){
        getDriver().get(ConfigFactory.getConfig().url() + "/signup");
        RegisterPage registerPage = new RegisterPage();
        todoPage = new TodoPage();
        registerPage.registerApi(getDefaultUser());
        todoPage.load();


        todoPage.clickAddTodo();
        NewTodoPage newTodoPage = new NewTodoPage();
        Todo todo = Todo.builder().item("test").build();
        newTodoPage.addNewTodo(todo);
    }

    @Test
    public void clickDeleteIcon() {
        todoPage.loadTodos().get(0).clickDeleteIcon();
        Assert.assertTrue(todoPage.noTodosIsDisplayed());
    }
}
