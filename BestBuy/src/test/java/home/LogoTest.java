package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import search.HomePageManubarLink;
import utility.reporting.TestLogger;

/**
 * Created by mdislam on 5/23/17.
 */
public class LogoTest extends CommonAPI{
    HomePageManubarLink homePageManubarLink;
    @Test
    private void logoText(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageManubarLink = PageFactory.initElements(driver, HomePageManubarLink.class);
        homePageManubarLink.getLogoText();

    }

}
