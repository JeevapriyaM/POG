package LeafPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertworkout {

	public static void main(String[] args) throws InterruptedException {
		
		// Chrome browser is opened
		ChromeDriver driver=new ChromeDriver();
		
		//opening the mentioned url
		driver.get("https://www.leafground.com/alert.xhtml");

		//Alert (Simple Dialog)
		WebElement alert1=driver.findElement(By.id("j_idt88:j_idt91"));
		alert1.click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		WebElement simpledialog=driver.findElement(By.xpath("//span[contains(@id,'simple_result')]"));
		String alert1msg=simpledialog.getText();
		System.out.println("Alert-1 Dialog is : "+alert1msg);
		
		//Alert (Confirm Dialog)
		WebElement alert2=driver.findElement(By.id("j_idt88:j_idt93"));
		alert2.click();
		driver.switchTo().alert().accept();
		WebElement Confirmdialog=driver.findElement(By.xpath("//span[@id='result']"));
		String alertmsg2=Confirmdialog.getText();
		System.out.println(alertmsg2);
		
		WebElement alert22=driver.findElement(By.id("j_idt88:j_idt93"));
		alert22.click();
		driver.switchTo().alert().dismiss();  //switching to promptbox and clicking on cancel button
		WebElement Confirmmdialog=driver.findElement(By.xpath("//span[@id='result']")); 
		String alertmsg22=Confirmmdialog.getText();
		System.out.println(alertmsg22);
		
		//Sweet Alert (Simple Dialog)
		 driver.findElement(By.id("j_idt88:j_idt95")).click();
		 String gettingtext=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div[2]/p")).getText();
		 System.out.println(gettingtext);
		 driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		 //Sweet Modal Dialog
		 driver.findElement(By.id("j_idt88:j_idt100")).click();
		 String modaltext=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div[2]/p")).getText();
		 //System.out.println("Modal text is: " +modaltext);
		 driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div[1]/a/span")).click();
			
		 //Alert (Prompt Dialog)
		 WebElement promptbox=driver.findElement(By.id("j_idt88:j_idt104"));
		 promptbox.click();
		Alert alert5= driver.switchTo().alert();
		 String text5 = alert5.getText();
			System.out.println(text5);
			alert5.sendKeys("ArunC");
			alert5.accept();
			System.out.println(driver.findElement(By.id("confirm_result")).getText());
			Thread.sleep(5000);
			
			
	}

}
