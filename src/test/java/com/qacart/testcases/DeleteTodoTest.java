package com.qacart.testcases;

import com.qacart.config.ConfigFactory;
import com.qacart.driver.Driver;
import com.qacart.pages.NewTodoPage;
import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class DeleteTodoTest {
    WebDriver driver;
    TodoPage todoPage;


    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(59));
        driver.get(ConfigFactory.getConfig().url() + "/signup");
        driver.manage().window().maximize();

        RegisterPage registerPage = new RegisterPage(driver);


        registerPage.fillFirstName("K.com");
        registerPage.fillLastName("test!");
        registerPage.fillEmail(Instant.now().toEpochMilli() + "test@gmail.com");
        registerPage.fillPassword("Test123!");
        registerPage.fillConfirmPassword("Test123!");
        registerPage.clickSignUp();

        todoPage = new TodoPage(driver);
        todoPage.clickAddTodo();
        NewTodoPage newTodoPage = new NewTodoPage(driver);
        newTodoPage.fillTodoName("Learn");
        newTodoPage.clickCreateTodo();
    }

    @Test
    public void clickDeleteIcon() {
        todoPage.clickDeleteIcon();
        Assert.assertTrue(todoPage.noTodosIsDisplayed());
    }

}
