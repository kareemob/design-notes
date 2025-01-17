package com.qacart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public void fillFirstName(String firstName){
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void fillLastName(String lastName){
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void fillEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }

    public void fillPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void fillConfirmPassword(String password){
        driver.findElement(confirmPasswordInput).sendKeys(password);
    }

    public void clickSignUp(){
        driver.findElement(submitButton).click();
    }

//    public void register(WebDriver driver, User user) {
//
//        driver.findElement(firstNameInput).sendKeys(user.getFirstName());
//        driver.findElement(lastNameInput).sendKeys(user.getLastName());
//        driver.findElement(emailInput).sendKeys(user.getEmail());
//        driver.findElement(passwordInput).sendKeys(user.getPassword());
//        driver.findElement(confirmPasswordInput).sendKeys(user.getPassword());
//        driver.findElement(submitButton).click();
//    }
}
