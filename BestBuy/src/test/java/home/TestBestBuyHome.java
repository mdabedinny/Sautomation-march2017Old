package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by mdislam on 5/8/17.
 */
public class TestBestBuyHome extends CommonAPI {
@Test
    public void bestBuyTittle(){
    String var=driver.getTitle();
    System.out.println(var);

}
}
