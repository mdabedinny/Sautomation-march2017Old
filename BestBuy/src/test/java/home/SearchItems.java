package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.SearchPage;
import utility.reporting.TestLogger;

import java.io.IOException;

/**
 * Created by mdislam on 5/25/17.
 */
public class SearchItems extends CommonAPI {
    @Test
    public void search() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.getDataFromExcelFileAndSearch();
    }
}
