package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.HomePageManubarLink;
import utility.reporting.TestLogger;

/**
 * Created by mdislam on 5/26/17.
 */
public class GetfeaturedOfferText extends CommonAPI {
    HomePageManubarLink homePageManubarLink;
    @Test
    public void getFeaturedOfferLinkText(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageManubarLink= PageFactory.initElements(driver, HomePageManubarLink.class);
        homePageManubarLink.getTvsLink();
    }
}
