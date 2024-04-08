package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelTesting {
	
	@Test
public void google()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}

	@Test
public void openBing()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bing.com/");
}
}
