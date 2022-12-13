package com.herokuapp.internet.utility;

import com.herokuapp.internet.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends ManageBrowser {
    public Utility() {
    }

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(new CharSequence[]{text});
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(new CharSequence[]{str});
    }
}