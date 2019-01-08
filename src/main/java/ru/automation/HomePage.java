package ru.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseActions {
    private static String HOME_PAGE_URL = "http://automationpractice.com/";
    private static By SIGN_IN_MENU = By.cssSelector("a.login");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void home() {
        driver.get(HOME_PAGE_URL);
    }

    public void goToAuthPage() {
        driver.findElement(SIGN_IN_MENU).click();
    }
}
