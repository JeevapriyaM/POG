package jeeva;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class learn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		
		//driver.findElement(By.name("search-suggestions-nykaa")).sendKeys("bag",Keys.ENTER);
		driver.findElement(By.className("css-1upamjb")).sendKeys("watch",Keys.ENTER);
		//Thread.sleep(5000);
		//driver.close();
	}

}
