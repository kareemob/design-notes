package com.qacart.pages;

import com.qacart.config.ConfigFactory;
import com.qacart.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Instant;

public class RegisterPage extends BasePage {

    //elements
    private final By firstNameInput = By.cssSelector("[data-testid=\"first-name\"]");
    private final By lastNameInput = By.cssSelector("[data-testid=\"last-name\"]");
    private final By emailInput = By.cssSelector("[data-testid=\"email\"]");
    private final By passwordInput = By.cssSelector("[data-testid=\"password\"]");
    private final By confirmPasswordInput = By.cssSelector("[data-testid=\"confirm-password\"]");
    private final By submitButton = By.cssSelector("[data-testid=\"submit\"]");

    //Constructor
    public RegisterPage(WebDriver driver){
        super(driver);
    }

    //method,steps

    private void fillFirstName(String firstName){
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    private void fillLastName(String lastName){
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    private void fillEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }

    private void fillPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    private void fillConfirmPassword(String password){
        driver.findElement(confirmPasswordInput).sendKeys(password);
    }

    private void clickSignUp(){
        driver.findElement(submitButton).click();
    }



    //Hiding implementation as test cases cares about functionality

    public void register() {
        fillFirstName("K.com");
        fillLastName("test!");
        fillEmail(Instant.now().toEpochMilli() + "test@gmail.com");
        fillPassword("Test123!");
        fillConfirmPassword("Test123!");
        clickSignUp();
    }
    @Override
    public void load(){
        driver.get(ConfigFactory.getConfig().url() + "/todo/new");
    }
}
