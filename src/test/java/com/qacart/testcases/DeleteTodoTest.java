package com.qacart.testcases;

import com.qacart.base.BaseTest;
import com.qacart.config.ConfigFactory;
import com.qacart.fixtures.TodoFixture;
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

@Feature("Delete Todo")
public class DeleteTodoTest extends BaseTest {

    TodoPage todoPage;

    @BeforeMethod
    public void setup(){
        RegisterPage registerPage = new RegisterPage();
        registerPage.load();
        String token = registerPage.registerApi(getDefaultUser());
        todoPage = new TodoPage();
        Todo todo = TodoFixture.generateTodo();
        todoPage.addTodoApi(todo,token);
        todoPage.load();
    }

    @Test(description = "Should be BLE TO DELETE TODO")
    public void clickDeleteIcon() {
        todoPage.loadTodos().get(0).clickDeleteIcon();
        Assert.assertTrue(todoPage.noTodosIsDisplayed());
    }

}
