package com.qacart.testcases;

import com.qacart.base.BaseTest;
import com.qacart.fixtures.UserFixtures;
import com.qacart.models.User;
import com.qacart.pages.RegisterPage;
import com.qacart.pages.TodoPage;
import com.qacart.utils.DataUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void userShouldBeAbleToRegister(){
        RegisterPage registerPage = new RegisterPage();
        registerPage.load();
        registerPage.register(UserFixtures.getDefaultUser());
        TodoPage todoPage = new TodoPage();
        Assert.assertTrue(todoPage.isWelcomeMessageDisplayed());
    }
}
