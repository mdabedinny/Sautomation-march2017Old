package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mdislam on 5/26/17.
 */
public class SigninPage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#uh-signin") public WebElement signinElementLink;
    @FindBy(how = How.CSS, using = "#login-signin") public WebElement emailFieldLink;
    @FindBy(how = How.CSS, using = "#login-signin") public WebElement nextFieldLink;
    @FindBy(how = How.CSS, using = "#login-username") public WebElement passFieldLink;
    @FindBy(how = How.CSS, using = "#login-signin") public  WebElement signSubmitLink;
    public void signin(String email, String pass){
        signinElementLink.click();
        emailFieldLink.sendKeys("email");
        nextFieldLink.click();
        passFieldLink.sendKeys("pass");
        signSubmitLink.click();
    }
}
