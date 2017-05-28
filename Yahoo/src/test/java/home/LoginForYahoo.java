package home;

import base.CommonAPI;
import homePage.HomePage;
import homePage.SigninPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

import java.util.concurrent.TimeUnit;

/**
 * Created by mdislam on 5/9/17.
 */
public class LoginForYahoo extends CommonAPI{
    SigninPage signinPage;
    @Test()
    public void loginWithValidCrentail(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPage = PageFactory.initElements(driver, SigninPage.class);
        signinPage.signin("abedinmdj@yahoo.com", "Mithu1981");
        String text = driver.getTitle();
        Assert.assertEquals(text, "Yahoo - login");
    }

}
