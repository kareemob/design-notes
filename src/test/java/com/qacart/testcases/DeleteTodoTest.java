package com.qacart.testcases;

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

public class DeleteTodoTest {
    WebDriver driver;
    TodoPage todoPage;


    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(59));
        driver.manage().window().maximize();

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.load();
        registerPage.register();

        todoPage = new TodoPage(driver);
        todoPage.clickAddTodo();
        NewTodoPage newTodoPage = new NewTodoPage(driver);
        newTodoPage.addNewTodo();
    }

    @Test
    public void clickDeleteIcon() {
        todoPage.clickDeleteIcon();
        Assert.assertTrue(todoPage.noTodosIsDisplayed());
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
