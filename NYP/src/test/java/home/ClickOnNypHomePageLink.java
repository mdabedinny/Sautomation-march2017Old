package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mdislam on 5/13/17.
 */
public class ClickOnNypHomePageLink extends CommonAPI {
    HomePageManuBarLink homePageManuBarLink;
    @Test(priority = '1')
    public void clickOnHomepageSectionLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageManuBarLink = PageFactory.initElements(driver, HomePageManuBarLink.class);
        homePageManuBarLink.clickOnSectionLink();
        driver.navigate().back();
    }
    @Test(priority = '2')
    public void clickOnHomePageSearchLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageManuBarLink = PageFactory.initElements(driver, HomePageManuBarLink.class);
        homePageManuBarLink.clickOnSearchLink();
    }


}
