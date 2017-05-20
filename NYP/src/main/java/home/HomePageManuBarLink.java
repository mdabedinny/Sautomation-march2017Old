package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mdislam on 5/13/17.
 */
public class HomePageManuBarLink extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//*[@id=\"sections\"]/span[2]") public  WebElement sectionLink;
    public  WebElement getSectionLink(){return sectionLink;}
    public  void clickOnSectionLink(){getSectionLink().click();}

    @FindBy(how = How.ID, using = "search") public WebElement searchLink;
    public  WebElement getSearchLink(){return searchLink;}
    public  void clickOnSearchLink(){
        getSearchLink().click();
    }
}
