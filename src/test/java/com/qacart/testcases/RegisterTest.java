package com.qacart.testcases;

import com.qacart.base.BaseTest;
import com.qacart.fixtures.UserFixtures;
import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("User auth")
public class RegisterTest extends BaseTest {

    @Story("test case")
    @Test(description = "Should be able to register")
    public void userShouldBeAbleToRegister(){
        RegisterPage registerPage = new RegisterPage();
        registerPage.load();
        registerPage.register(UserFixtures.getDefaultUser());
        TodoPage todoPage = new TodoPage();
        Assert.assertTrue(todoPage.isWelcomeMessageDisplayed());
    }
}
