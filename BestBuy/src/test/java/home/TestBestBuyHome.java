package home;

import base.CommonAPI;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by mdislam on 5/8/17.
 */
public class TestBestBuyHome extends CommonAPI {
@Test
    public void bestBuyTittle(){
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    String var=driver.getTitle();
    System.out.println(var);

}
}
