package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

    // ✅ DataProvider for Login Test
    @DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {

        // Path of Excel file
        String path = System.getProperty("user.dir") + "/testData/Test_Data.xlsx";

        // Create object of ExcelUtility
        ExcelUtility xlutil = new ExcelUtility(path);

        // Get total rows and columns
        int totalrows = xlutil.getRowCount("Sheet1");
        int totalcols = xlutil.getCellCount("Sheet1", 1);

        // Create 2D array
        String logindata[][] = new String[totalrows][totalcols];

        // Read data from Excel and store in array
        for (int i = 1; i <= totalrows; i++) {   // rows start from 1 (skip header)

            for (int j = 0; j < totalcols; j++) {

                logindata[i - 1][j] = xlutil.getCellData("Sheet1", i, j);
            }
        }

        return logindata;
    }
}