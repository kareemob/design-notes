package com.qacart.testcases;

import com.qacart.base.BaseTest;
import com.qacart.config.ConfigFactory;
import com.qacart.driver.Driver;
import com.qacart.pages.NewTodoPage;
import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class AddTodoTest extends BaseTest {
    @BeforeMethod
    public void setup(){

        getDriver().get(ConfigFactory.getConfig().url() + "/signup");
        RegisterPage registerPage = new RegisterPage();
        registerPage.register();
    }

    @Test
    public void createTodo() {
        TodoPage todoPage = new TodoPage();
        todoPage.clickAddTodo();
        NewTodoPage newTodoPage = new NewTodoPage();
        newTodoPage.addNewTodo();
        Assert.assertTrue(todoPage.isTodoDisplayed());
    }

}
