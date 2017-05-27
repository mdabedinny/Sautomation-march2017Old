package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.HomePageManubarLink;
import utility.reporting.TestLogger;

/**
 * Created by mdislam on 5/25/17.
 */
public class ServicesLinkPageTest extends CommonAPI {
    HomePageManubarLink homePageManubarLink;
    @Test
    public void clickOnSercivesLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageManubarLink= PageFactory.initElements(driver, HomePageManubarLink.class);
        homePageManubarLink.getServicesLink();
    }
}