package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

/**
 * Created by mdislam on 5/13/17.
 */
public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using = "a[class='C(#fff) Fz(13px)']") public  WebElement homeLink;
    public  WebElement getHomeLink(){return homeLink;}
    public  void clickOnhomeLink(){getHomeLink().click();}

    @FindBy(how = How.CSS, using = ".C(#fff) Fz(13px)") public  WebElement mailLink;
    public WebElement getMailLink(){return mailLink;}
    public void clickOnMailLink(){getMailLink().click();}

    @FindBy(how = How.CSS, using = ".C(#fff) Fz(13px)") public WebElement flickrLink;
    public WebElement getFlickrLink(){return flickrLink;}
    public void clickOnFlickrLink(){getFlickrLink().click();}
    @FindBy(how = How.CSS, using = ".C(#fff) Fz(13px)") public WebElement tumblrLink;
    public WebElement getTumblrLink(){return tumblrLink;}
    public void clickOnTumblrLink(){getTumblrLink().click();}
    @FindBy(how = How.CSS, using = ".C(#fff) Fz(13px)") public  WebElement answersLink;
    public WebElement getAnswersLink(){return answersLink;}
    public void clickOnAnswersLink(){getAnswersLink().click();}
    @FindBy(how = How.CSS, using = ".C(#fff) Fz(13px)") public  WebElement groupsLink;
    public WebElement getGroupsLink(){return groupsLink;}
    public void clickOnGroupsLink(){getGroupsLink().click();}
    @FindBy(how = How.CSS, using = "#mega-topbar li:nth-child(7)>a") public WebElement mobileLink;
    public WebElement getMobileLink(){return mobileLink;}
    public void clickOnMobileLink(){getMobileLink().click();}
    @FindBy(how = How.CSS, using = ".C(#fff) Fz(13px)") public WebElement viewLink;
    public WebElement getViewLink(){return viewLink;}
    public void clickOnViewLink(){getViewLink().click();}
    @FindBy(how = How.CSS, using = ".navigation-menu-title Pos(r) C(#fff) Pstart(12px) Pend(24px) Py(4px) Fz(13px) menu-open_C($topbarMenu) menu-open_Bgc(#fff) menu-open_Z(8) rapidnofollow")
    public  WebElement moreLink;
    public WebElement getMoreLink(){return moreLink;}
    public void clickOnMoreLink(){getMoreLink().click();}

}
