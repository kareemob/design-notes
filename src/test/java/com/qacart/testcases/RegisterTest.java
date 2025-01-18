package com.qacart.testcases;

import com.qacart.base.BaseTest;
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
        User user = new User.UserBuilder()
                .setFirstName("kareem")
                .setLastName("obaidat")
                .setEmail(DataUtils.generateUniqueEmail())
                .setPassword("Test123!")
                .build();

        registerPage.register(user);
        TodoPage todoPage = new TodoPage();
        Assert.assertTrue(todoPage.isWelcomeMessageDisplayed());
    }
}
