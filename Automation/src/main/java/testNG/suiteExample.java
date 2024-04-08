package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suiteExample {
	ChromeDriver driver;
	long starttime;
	long endtime;
	long finaltime;
	@BeforeSuite
	public void launchbroswer()
	{
		starttime=System.currentTimeMillis();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\j_mahendran\\Documents\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void opengoogle()
	{
	 driver.get("https://www.google.com/");
	}

	@Test
	public void openBing()
	{
		driver.get("https://www.bing.com/");
	}
	
	@AfterSuite
	
	public void closebrwoser()
	{
		driver.quit();
		 endtime=System.currentTimeMillis();
		 finaltime=endtime-starttime;
		 System.out.println("The total time is:"+finaltime);
	}
}
