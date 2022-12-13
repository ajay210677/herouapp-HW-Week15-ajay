package com.herokuapp.internet.pages;


import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class LoginPage extends Utility {
    @FindBy(
            id = "username"
    )
    WebElement userNameField;
    @FindBy(
            name = "password"
    )
    WebElement passwordField;
    @FindBy(
            xpath = "//i[contains(text(),'Login')]"
    )
    WebElement loginButton;
    @FindBy(
            xpath = "//h2[text()=' Secure Area']"
    )
    WebElement loginTextMessage;
    @FindBy(
            xpath = "//div[@id='flash']"
    )
    WebElement userNameErrorMessage;
    @FindBy(
            xpath = "//div[@id='flash']"
    )
    WebElement passwordErrorMessage;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String userName) {
        Reporter.log("Entered username " + userName + " in username field " + this.userNameField.toString());
        this.sendTextToElement(this.userNameField, userName);
    }

    public void enterPassword(String password) {
        Reporter.log("Entered password " + password + " in password field " + this.passwordField.toString());
        this.sendTextToElement(this.passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicked on login button " + this.loginButton.toString());
        this.clickOnElement(this.loginButton);
    }

    public String getLoginTextMessage() {
        return this.getTextFromElement(this.loginTextMessage);
    }

    public String getUserNameErrorMessage() {
        return this.getTextFromElement(this.userNameErrorMessage);
    }

    public String getPasswordErrorMessage() {
        return this.getTextFromElement(this.passwordErrorMessage);
    }
}
