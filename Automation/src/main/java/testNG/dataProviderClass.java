package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderClass {
	
	String[] [] data={
		{"demoSalesManager","crmsfa"},
		{"demoSalesManager","crma2"},
		{"232da","crmsfa"},
		{"yinn","p0k"}
	};
	
	
	@DataProvider(name="logindata")
	public String[][] dataprovide()
	{
		return data;
	}

	@Test(dataProvider="logindata")
	public void loginfunction(String uName,String pword)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("uName");
	
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("pword");
	
	WebElement login=driver.findElement(By.className("decorativeSubmit"));
	login.click();
	
	driver.quit();
	}

}

