package ru.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.automation.AuthPage;
import ru.automation.HomePage;
import ru.automation.RegistrationPage;

public class BaseUITest {
    WebDriver driver;
    WebDriverWait wait;

    HomePage homePage;
    AuthPage authPage;
    RegistrationPage registrationPage;

    @BeforeMethod
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, 5);
        this.homePage = new HomePage(driver, wait);
        this.authPage = new AuthPage(driver, wait);
        this.registrationPage = new RegistrationPage(driver, wait);
    }

    @AfterMethod
    public void shutdown() {
        driver.quit();
    }
}
