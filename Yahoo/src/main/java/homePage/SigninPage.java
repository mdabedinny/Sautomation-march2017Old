package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;

/**
 * Created by mdislam on 5/26/17.
 */
public class SigninPage extends CommonAPI {
    public void signin(String email, String pass){
        clickByCss("#uh-signin");
        driver.findElement(By.cssSelector("#login-username")).sendKeys(email);
        driver.findElement(By.cssSelector("#login-signin")).click();
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.id("login-signin")).click();
    }
}
