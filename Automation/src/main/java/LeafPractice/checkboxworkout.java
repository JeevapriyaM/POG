package LeafPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxworkout {

	public static void main(String[] args) {

		// Chrome browser is opened
				ChromeDriver driver=new ChromeDriver();
				
				//opening the mentioned url
				driver.get("https://www.leafground.com/checkbox.xhtml");
				
		//Basic Checkbox
				WebElement basic=driver.findElement(By.id("j_idt87:j_idt89"));
				basic.click();
				
	   //Notification
				
				WebElement notification=driver.findElement(By.id("j_idt87:j_idt91"));
				notification.click();
				//driver.switchTo().alert();
				
				
	  //
	
	}

}
