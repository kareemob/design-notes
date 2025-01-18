package com.qacart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Instant;

public class RegisterPage {
    //elements
    private final By firstNameInput = By.cssSelector("[data-testid=\"first-name\"]");
    private final By lastNameInput = By.cssSelector("[data-testid=\"last-name\"]");
    private final By emailInput = By.cssSelector("[data-testid=\"email\"]");
    private final By passwordInput = By.cssSelector("[data-testid=\"password\"]");
    private final By confirmPasswordInput = By.cssSelector("[data-testid=\"confirm-password\"]");
    private final By submitButton = By.cssSelector("[data-testid=\"submit\"]");


    //method,steps

    private void fillFirstName(WebDriver driver, String firstName){
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    private void fillLastName(WebDriver driver ,String lastName){
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    private void fillEmail(WebDriver driver, String email){
        driver.findElement(emailInput).sendKeys(email);
    }

    private void fillPassword(WebDriver driver, String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    private void fillConfirmPassword(WebDriver driver, String password){
        driver.findElement(confirmPasswordInput).sendKeys(password);
    }

    private void clickSignUp(WebDriver driver){
        driver.findElement(submitButton).click();
    }



    //Hiding implementation as test cases cares about functionality

    public void register(WebDriver driver) {
        driver.findElement(firstNameInput).sendKeys("K.com");
        driver.findElement(lastNameInput).sendKeys("test!");
        driver.findElement(emailInput).sendKeys(Instant.now().toEpochMilli() + "test@gmail.com");
        driver.findElement(passwordInput).sendKeys("Test123!");
        driver.findElement(confirmPasswordInput).sendKeys("Test123!");
        driver.findElement(submitButton).click();
    }
}
