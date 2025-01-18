package com.qacart.testcases;

import com.qacart.base.BaseTest;
import com.qacart.config.ConfigFactory;
import com.qacart.driver.Driver;
import com.qacart.pages.NewTodoPage;
import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import com.qacart.utils.DataUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class DeleteTodoTest extends BaseTest {

    TodoPage todoPage;

    @BeforeMethod
    public void setup(){
        getDriver().get(ConfigFactory.getConfig().url() + "/signup");
        RegisterPage registerPage = new RegisterPage();


        registerPage.register("kareem", "obaidat", DataUtils.generateUniqueEmail(), "Test123!");

        todoPage = new TodoPage();
        todoPage.clickAddTodo();
        NewTodoPage newTodoPage = new NewTodoPage();
        newTodoPage.addNewTodo();
    }

    @Test
    public void clickDeleteIcon() {
        todoPage.loadTodos().get(0).clickDeleteIcon();
        Assert.assertTrue(todoPage.noTodosIsDisplayed());
    }
}
