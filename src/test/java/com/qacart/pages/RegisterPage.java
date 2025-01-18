package com.qacart.pages;

import com.qacart.base.BasePage;
import com.qacart.config.ConfigFactory;
import com.qacart.models.User;
import org.openqa.selenium.By;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class RegisterPage implements BasePage {
    //elements
    private final By firstNameInput = By.cssSelector("[data-testid=\"first-name\"]");
    private final By lastNameInput = By.cssSelector("[data-testid=\"last-name\"]");
    private final By emailInput = By.cssSelector("[data-testid=\"email\"]");
    private final By passwordInput = By.cssSelector("[data-testid=\"password\"]");
    private final By confirmPasswordInput = By.cssSelector("[data-testid=\"confirm-password\"]");
    private final By submitButton = By.cssSelector("[data-testid=\"submit\"]");

    //Hiding implementation as test cases cares about functionality

    public void register(User user) {
//        getDriver().findElement(firstNameInput).sendKeys("K.com");
//        getDriver().findElement(lastNameInput).sendKeys("test!");
//        getDriver().findElement(emailInput).sendKeys(Instant.now().toEpochMilli() + "test@gmail.com");
//        getDriver().findElement(passwordInput).sendKeys("Test123!");
//        getDriver().findElement(confirmPasswordInput).sendKeys("Test123!");
//        getDriver().findElement(submitButton).click();
        getDriver().findElement(firstNameInput).sendKeys(user.getFirstName());
        getDriver().findElement(lastNameInput).sendKeys(user.getLastName());
        getDriver().findElement(emailInput).sendKeys(user.getEmail());
        getDriver().findElement(passwordInput).sendKeys(user.getPassword());
        getDriver().findElement(confirmPasswordInput).sendKeys(user.getPassword());
        getDriver().findElement(submitButton).click();
    }



    @Override
    public void load() {
        getDriver().get(ConfigFactory.getConfig().url() + "/signup");
    }
}
