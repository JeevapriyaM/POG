package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dataProvideExcel {
	ChromeDriver driver ;
	String[][] data = null;

	@DataProvider(name = "logindata")
	public String[][] dataprovide() throws BiffException, IOException {
		
		data=getexcelData();
		return data;
	}

	//Read the test data from excel file
	public String[][] getexcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\j_mahendran\\OneDrive - INFOTEL CONSEIL\\TestData.xls");

		Workbook workbook = Workbook.getWorkbook(excel);

		Sheet sheet = workbook.getSheet(0);

		int rowcount = sheet.getRows();
		int columncount = sheet.getColumns();

		System.out.println("Number of Rows:" +rowcount);
		System.out.println("Number of Columns:" +columncount);
		
		
		 // Get the data from excel file

		
		 String testdata[][]=new String[rowcount-1][columncount];
		 for(int i=1;i<rowcount;i++) 
		 {
			 for(int j=0;j<columncount;j++)
			 {
				 testdata[i-1][j]=sheet.getCell(j,i).getContents();
				 
			 }
		 
		 }
		 return testdata;
		
	}
	
	@BeforeTest
	public void beforetest()
	{
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	}

	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
	
	@Test(dataProvider = "logindata")
	public void loginfunction(String uName, String pword) {
	

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("uName");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("pword");

		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();

		

	}

}
