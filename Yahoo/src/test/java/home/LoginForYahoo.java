package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by mdislam on 5/9/17.
 */
public class LoginForYahoo extends CommonAPI{
    @Test
    public void loginWithValidCrentail(){
        clickByCss("#uh-signin");
        driver.findElement(By.name("login-username")).sendKeys("abedinmdj@yahoo.com");
        driver.findElement(By.name("signin")).click();
        driver.findElement(By.name("password")).sendKeys("Mithu1981");
        driver.findElement(By.id("login-signin")).click();
        System.out.println("I am a java devloper");
        
        //*[@id="login-passwd"]
    }
}
