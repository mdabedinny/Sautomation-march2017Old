package search;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

import java.io.IOException;

/**
 * Created by mdislam on 5/15/17.
 */
public class SearchPage extends CommonAPI {
@FindBy(how = How.CSS, using = "#autocomplete-enabled") public WebElement searchInputLink;
@FindBy(how = How.CSS, using = "#hf-icon-search") public WebElement searchSubmitLink;
public void sreachForItem(String item){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()+": " + item));
    searchInputLink.sendKeys(item, Keys.ENTER);
}
public void clearSearchInputLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    searchInputLink.clear();
}
public void getDataFromExcelFileAndSearch() throws IOException, InterruptedException{
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    //Create instance of Excel file reader class
    ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
    //Page Factory class init
    SearchPage search = PageFactory.initElements(driver, SearchPage.class);
    //Read data from Excel File.
    String[] value = itemsToBeSearched.getDataFromExcelFile();
    //Running for each loop
    for (int i = 1; i < value.length; i++) {
        search.sreachForItem(value[i]);
        sleepFor(2);
        search.clearSearchInputLink();
    }

}
}
