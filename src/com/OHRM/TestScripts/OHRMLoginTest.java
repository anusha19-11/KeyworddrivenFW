package com.OHRM.TestScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.OHRM.lib.LoginKeywords;

public class OHRMLoginTest {

	@Test
	public void loginTest() throws IOException, InterruptedException {
		LoginKeywords lkw = new LoginKeywords();

		FileInputStream fi = new FileInputStream("./Keywords//ActionKeywords.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Sheet1");

		// to find number of rows
		int rows = ws.getLastRowNum();
		for (int i = 1; i <= rows; i++) {
			// to read runmode
			String runMode = ws.getRow(i).getCell(4).toString();
			if (runMode.equals("Y")) {
				// to read Keyword
				String KW = ws.getRow(i).getCell(3).toString();

				switch (KW) {
				case "launchBrowser":
					lkw.launchBrowser();
					break;
				case "navigateURL":
					lkw.navigateURL();
					break;
				case "enterUsername":
					lkw.enterUsername();
					break;

				case "enterPassword":
					lkw.enterPassword();
					break;
				case "clickLogin":
					lkw.clickLogin();
					break;
				}
			}
		}

	}

}
