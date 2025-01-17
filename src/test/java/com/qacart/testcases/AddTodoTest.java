package com.qacart.testcases;

import com.qacart.config.ConfigFactory;
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

public class AddTodoTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(59));
        driver.get(ConfigFactory.getConfig().url() + "/signup");
        driver.manage().window().maximize();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register();
    }

    @Test
    public void createTodo() {
        TodoPage todoPage = new TodoPage(driver);
        todoPage.clickAddTodo();
        NewTodoPage newTodoPage = new NewTodoPage(driver);
        newTodoPage.addNewTodo();
        Assert.assertTrue(todoPage.isTodoDisplayed());
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
