package home;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by mdislam on 5/13/17.
 */
public class ClickOnHomePageHomeLink extends CommonAPI{
  HomePage homePage;
  @Test(priority = 'a')
    public void clickHomeLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      homePage= PageFactory.initElements(driver, HomePage.class);
      homePage.clickOnhomeLink();
      driver.navigate().back();

  }
  @Test(priority = 'b')
  public void clicMobileLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    homePage= PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnMobileLink();
    driver.navigate().back();
  }
  @Test(priority = 'c')
  public void clicFlickrLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    homePage= PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnFlickrLink();
    driver.navigate().back();
  }
  @Test(priority = 'd')
  public void clickTumblrLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    homePage= PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnTumblrLink();
    driver.navigate().back();
  }
  @Test(priority = 'e')
  public void clickAnswersLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    homePage= PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnAnswersLink();
    driver.navigate().back();
  }
  @Test(priority = 'f')
  public void clickGroupsLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    homePage= PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnGroupsLink();
    driver.navigate().back();
  }
  @Test(priority = 'g')
  public void clickMobileLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    homePage= PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnMobileLink();
    driver.navigate().back();
  }
  @Test(priority = 'h')
  public void clickViewLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    homePage= PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnViewLink();
    driver.navigate().back();
  }
  @Test(priority = 'i')
  public void clickMoreLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    homePage= PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnMoreLink();
    driver.navigate().back();
  }

}
