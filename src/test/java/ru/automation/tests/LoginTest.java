package ru.automation.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseUITest {
    @DataProvider(name = "emailPasswordResult")
    public Object[][] clickDealsData() {
        return new Object[][]{
                {"sdfsdfef", "kdsjfefe", "Invalid email address."},
                {"ergregreg", "kds435345345jfefe", "Invalid email address."},
                {"rbereger", "325345", "Invalid email address."}
        };
    }

    @Test(dataProvider = "emailPasswordResult")
    public void tryToLogin(String email, String password, String result) {
        homePage.home();
        homePage.goToAuthPage();
        authPage.fillSignInFormAndConfirm(email, password);
        Assert.assertTrue(authPage.isAlertPresent());
        Assert.assertEquals(result, authPage.getAlertContainerText());
    }
}
