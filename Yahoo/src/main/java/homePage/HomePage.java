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

    @FindBy(how = How.CSS, using = "a[data-ylk='slk:flickr;t5:flickr;cpos:3;']") public WebElement flickrLink;
    public WebElement getFlickrLink(){return flickrLink;}
    public void clickOnFlickrLink(){getFlickrLink().click();}

    @FindBy(how = How.CSS, using = "a[data-ylk='slk:tumblr;t5:tumblr;cpos:4;']") public WebElement tumblrLink;
    public WebElement getTumblrLink(){return tumblrLink;}
    public void clickOnTumblrLink(){getTumblrLink().click();}

    @FindBy(how = How.CSS, using = "a[data-ylk='slk:answers;t5:answers;cpos:5;']") public  WebElement answersLink;
    public WebElement getAnswersLink(){return answersLink;}
    public void clickOnAnswersLink(){getAnswersLink().click();}

    @FindBy(how = How.CSS, using = "a[data-ylk='slk:groups;t5:groups;cpos:6;']") public  WebElement groupsLink;
    public WebElement getGroupsLink(){return groupsLink;}
    public void clickOnGroupsLink(){getGroupsLink().click();}

    @FindBy(how = How.CSS, using = "a[data-ylk='slk:mobile;t5:mobile;cpos:7;']") public WebElement mobileLink;
    public WebElement getMobileLink(){return mobileLink;}
    public void clickOnMobileLink(){getMobileLink().click();}

    @FindBy(how = How.CSS, using = "a[data-ylk='slk:view;t5:view;cpos:8;']") public WebElement viewLink;
    public WebElement getViewLink(){return viewLink;}
    public void clickOnViewLink(){getViewLink().click();}

    @FindBy(how = How.CSS, using = "a[data-ylk='rspns:op;t5:more;slk:more;itc:1;elmt:mu;cpos:9;']")
    public  WebElement moreLink;
    public WebElement getMoreLink(){return moreLink;}
    public void clickOnMoreLink(){getMoreLink().click();}

}
