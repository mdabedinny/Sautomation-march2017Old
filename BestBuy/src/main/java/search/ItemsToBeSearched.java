package search;

import base.CommonAPI;
import utility.reader.DataReader;
import utility.reporting.TestLogger;

import java.io.IOException;

/**
 * Created by mdislam on 5/25/17.
 */
public class ItemsToBeSearched extends CommonAPI {
    DataReader dr = new DataReader();
    public String [] getDataFromExcelFile()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir")+"/data/file.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
