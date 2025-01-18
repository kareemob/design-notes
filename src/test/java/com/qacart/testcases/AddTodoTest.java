package com.qacart.testcases;

import com.qacart.base.BaseTest;
import com.qacart.config.ConfigFactory;
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

public class AddTodoTest extends BaseTest {
    @BeforeMethod
    public void setup(){

        getDriver().get(ConfigFactory.getConfig().url() + "/signup");
        RegisterPage registerPage = new RegisterPage();
        User user = User.builder()
                .setFirstName("kareem")
                .setLastName("obaidat")
                .setEmail(DataUtils.generateUniqueEmail())
                .setPassword("Test123!")
                .build();

        registerPage.register(user);
    }

    @Test
    public void createTodo() {
        TodoPage todoPage = new TodoPage();
        todoPage.clickAddTodo();
        NewTodoPage newTodoPage = new NewTodoPage();
        Todo todo = Todo.builder().taskName("test").build();
        newTodoPage.addNewTodo(todo);
        Assert.assertTrue(todoPage.isTodoDisplayed());
    }

}
