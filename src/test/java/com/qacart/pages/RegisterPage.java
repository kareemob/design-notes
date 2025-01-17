package com.qacart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Instant;

public class RegisterPage {
    private WebDriver driver;
    //elements
    private final By firstNameInput = By.cssSelector("[data-testid=\"first-name\"]");
    private final By lastNameInput = By.cssSelector("[data-testid=\"last-name\"]");
    private final By emailInput = By.cssSelector("[data-testid=\"email\"]");
    private final By passwordInput = By.cssSelector("[data-testid=\"password\"]");
    private final By confirmPasswordInput = By.cssSelector("[data-testid=\"confirm-password\"]");
    private final By submitButton = By.cssSelector("[data-testid=\"submit\"]");

    //Constructor
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    //method,steps

    /**
     * No need for the below methods!
     */

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
        WebElement firstNameInputElement = driver.findElement(firstNameInput);
        firstNameInputElement.sendKeys("K.com");
        WebElement lastNameInputElement = driver.findElement(lastNameInput);
        lastNameInputElement.sendKeys("test!");
        WebElement email = driver.findElement(emailInput);
        email.sendKeys(generateUniqueEmail());
        WebElement password = driver.findElement(passwordInput);
        password.sendKeys("Test123!");
        WebElement confirmPassword = driver.findElement(confirmPasswordInput);
        confirmPassword.sendKeys("Test123!");
        WebElement signupButton = driver.findElement(submitButton);
        signupButton.click();
    }

    private String generateUniqueEmail() {
        return Instant.now().toEpochMilli() + "test@gmail.com";
    }
}
