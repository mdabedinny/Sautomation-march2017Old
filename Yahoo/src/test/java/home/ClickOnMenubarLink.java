package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by mdislam on 5/9/17.
 */
public class ClickOnMenubarLink extends CommonAPI{
    @Test
    public void clickOnMobileLink(){
       driver.findElement(By.cssSelector("a[class='C(#fff) Fz(13px)']")).click();
       driver.navigate().back();
    }
    @Test
    public void clickOnViewLink(){
        driver.findElement(By.cssSelector("a[class='C(#fff) Fz(13px)']")).click();
    }
    // go to yahoo site then click on mibile link;
}
