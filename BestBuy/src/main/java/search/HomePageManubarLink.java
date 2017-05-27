package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mdislam on 5/21/17.
 */
public class HomePageManubarLink extends CommonAPI {
    @FindBy(how = How.CSS, using = "a[data-lid='hdr_esup']") public WebElement expertServiceLink;
    public WebElement setExpertServiceLink() {
        return expertServiceLink;
    }
    public void getExpertServiceLink(){
       setExpertServiceLink().click();
    }

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_crd']") public WebElement creditCardLink;
    public WebElement setCreditCardLink() {
        return creditCardLink;
    }
    public void getCreditCardLink(){
        setCreditCardLink().click();
    }

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_ost']") public WebElement olderStatusLink;
    public void getOlderStatusLink(){olderStatusLink.click();}

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_stl']") public WebElement storeLocatorLink;
    public void getStoreLocatorLink(){storeLocatorLink.click();}

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_signin']") public WebElement accountLink;
    public void getAccountLink(){accountLink.click();}

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_shistory']") public WebElement shoppingHistoryLink;
    public void getShoppingHistoryLink(){shoppingHistoryLink.click();}

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_saved']") public WebElement saveItemLink;
    public void getSaveItemLink(){saveItemLink.click();}

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_carticon']") public WebElement cartLink;
    public void getCartLink(){cartLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p1_TVs']") public WebElement tvsLink;
    public void getTvsLink(){tvsLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p2_Laptops & Computers']") public WebElement laptopsandComputerLink;
    public void getlaptopsandComputerLink(){laptopsandComputerLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p3_Tablets & <br> E-Readers']") public WebElement tabletandEreaderLink;
    public void getTabletandEreaderLink(){tabletandEreaderLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p4_Video Games & Virtual Reality']") public WebElement vedioGamesLink;
    public void getVedioGamesLink(){vedioGamesLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p5_Headphones & Speakers']") public WebElement headphonesLink;
    public void getHeadphinesLink(){headphonesLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p6_Cell Phones']") public WebElement cellPhonesLink;
    public void getCellPhonesLink(){cellPhonesLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p7_Movies, TV Shows & Music']") public WebElement movesTvShowsLink;
    public void getMovesTvShowLink(){movesTvShowsLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p8_Tech Toys & Drones']") public WebElement techToysLink;
    public void getTechToysLink(){techToysLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p9_Cameras & Camcorders']") public WebElement camerasLink;
    public void getCamerasLink(){camerasLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p10_Wearable Tech & Smartwatches']") public WebElement wearableLink;
    public void getWearableLink(){wearableLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p11_Home Theater & Audio']") public WebElement homeTheaterLink;
    public void getHomeTheaterLink(){homeTheaterLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p12_Streaming Devices & Video']") public WebElement streamingDevicesLink;
    public void getStreamDevicesLink(){streamingDevicesLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p13_Major Appliances']") public WebElement majorApplicationLink;
    public void getMajorApplicationLink(){majorApplicationLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p14_Small Appliances']") public WebElement smallApplicationLink;
    public void getSmallApplicationLink(){smallApplicationLink.click();}

    @FindBy(how = How.CSS, using = "a[data-track='flex_r1c2w1p15_Smart Home']") public WebElement smartHomeLink;
    public void getSmartHomeLink(){smartHomeLink.click();}

    @FindBy(how = How.CSS, using = ".logo") public WebElement logoText;
    public WebElement setLogoText() {
        return logoText;
    }
    public void getLogoText(){
        setLogoText().getText();
        String text =setLogoText().getText();
        System.out.println(text);
    }

    @FindBy(how = How.CSS, using = "#menu0") public WebElement productLink;
    public WebElement setProductLink(){return productLink;}
    public void getProductLink(){productLink.click();}

    @FindBy(how = How.CSS, using = "#menu1") public WebElement brandsLink;
    public WebElement setBrandsLink(){return brandsLink;}
    public void getBrandsLink(){brandsLink.click();}

    @FindBy(how = How.CSS, using = "#menu2") public WebElement dealsLink;
    public WebElement setDealsLink(){return productLink;}
    public void getDealsLink(){dealsLink.click();}

    @FindBy(how = How.CSS, using = "#menu3") public WebElement servicesLink;
    public WebElement setservicesLink(){return servicesLink;}
    public void getServicesLink(){servicesLink.click();}

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_wky']") public WebElement weeklyAdLink;
    public WebElement setWeeklyAdLink(){return weeklyAdLink;}
    public void getWeeklyAdLink(){weeklyAdLink.click();}

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_dotd']") public WebElement dealOfTheDayLink;
    public WebElement setDealOfTheDayLink(){return dealOfTheDayLink;}
    public void getDealOfTheDayLink(){dealOfTheDayLink.click();}

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_gft_crd']") public WebElement giftCardLink;
    public WebElement setGiftCardLink(){return giftCardLink;}
    public void getGiftCardLink(){giftCardLink.click();}

    @FindBy(how = How.CSS, using = "a[data-lid='hdr_gft_gct']") public WebElement giftIdeaRegistryLink;
    public WebElement setGiftIdeaRegistryLink(){return giftIdeaRegistryLink;}
    public void getGiftIdeaRegistryLink(){giftIdeaRegistryLink.click();}

    @FindBy(how = How.CSS, using = ".link") public WebElement showNowLink;
    public void getShowNowLink(){showNowLink.click();}

    @FindBy(how = How.CSS, using = "div[class='col-xs-12']") public WebElement stringTextFeaturedOffer;
    public String setFeaturedOfferText(){
        String aText=stringTextFeaturedOffer.getText();
        System.out.println(aText);
        return aText;
    }
    public void getFeaturedOfferText(){
        setFeaturedOfferText();
    }


}
