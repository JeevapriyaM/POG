package LeafPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class textbox {
	

	public static void main(String[] args) throws InterruptedException {

		// Chrome browser is opened
		ChromeDriver driver=new ChromeDriver();
		
		//opening the mentioned url
		driver.get("https://www.leafground.com/input.xhtml");
		
		//Type your name
	   WebElement name= driver.findElement(By.id("j_idt88:name"));
	   name .sendKeys("Jeeva");
	    
	   //Append Country to this City.
	  WebElement append= driver.findElement(By.id("j_idt88:j_idt91"));
	  append.sendKeys("India");
	  
	  //Verify if text box is disabled
	  WebElement disabledornot=driver.findElement(By.id("j_idt88:j_idt93"));
	  boolean disabledresult=disabledornot.isEnabled();
	  System.out.println("The textbox is " +disabledresult);
	  
	  //Clear the typed text.
	  WebElement cleartext=driver.findElement(By.id("j_idt88:j_idt95"));
	  cleartext.clear();
	  
	  //Retrieve the typed text.
	  WebElement retrievetext=driver.findElement(By.id("j_idt88:j_idt97"));
	 String retrievevalue= retrievetext.getAttribute("value");
	 System.out.println("The retrieved tex is: " + retrievevalue);
	 
	 
	//Type email and Tab. Confirm control moved to next element.
	 WebElement typeemail=driver.findElement(By.id("j_idt88:j_idt99"));
	 typeemail.sendKeys("jeevriyam@gmail.com" + Keys.TAB);
	 
	 //Type about yourself
	 WebElement Richtext=driver.findElement(By.id("j_idt88:j_idt101"));
	 Richtext.sendKeys("practising selenium by surfing thriug youtube and google");
	 
	 //Text Editor
	 WebElement entervalue= driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[8]/div/div/div[2]/div[1]"));
	 entervalue.sendKeys("Text Editor"+Keys.CONTROL+"A");
	 WebElement boldtext=driver.findElement(By.className("ql-bold"));
	 boldtext.click();
	 entervalue.click();
	 
	 //Just Press Enter and confirm error message*
	 WebElement pressenter=driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
	 pressenter.sendKeys(Keys.ENTER);
	 
	 WebElement confirmmessage=driver.findElement(By.xpath("//span[@id='j_idt106:thisform:j_idt110_error-detail']"));
	 boolean confirmerror=confirmmessage.isEnabled();
	 if(confirmerror)
	 {
		 System.out.println("The error message is displayed as expected");
	 }
	 else
	 {
		 System.out.println("The error message is not displayed.");
	 }
	 
	//Click and Confirm Label Position Changes
	 
	 WebElement floatinglabel= driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
	 Point floatinglabelposition= floatinglabel.getLocation();
	 System.out.println(floatinglabelposition);
	 floatinglabel.click();
	 
	 WebElement labelname= driver.findElement(By.xpath("//label[@id='j_idt106:j_idt113']"));
	 Point labelposition=labelname.getLocation();
     System.out.println(labelposition);
    
	 if(labelposition!=floatinglabelposition)
	 {
		 System.out.println("The poistion is changed");
	 }
	 else
	 {
		 System.out.println("The Position is not changed");
	 }
	 
	 //Type your DOB (mm/dd/yyyy) and confirm date chosen 
	 WebElement Dobvalue= driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']"));
	 Dobvalue.sendKeys("05/07/1993");
	 String dob=Dobvalue.getAttribute("value");
	 System.out.println(dob);
	 
	 if(dob.contains("2/5/1995"))
			System.out.println("The DOB Selected Correctly");
		else
			System.out.println("The DOB not selected Correctly");
	 
	/*Type number and spin to confirm value changed*/
	 WebElement enternumber= driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
	 enternumber.sendKeys("60");
	 String oldvalue=enternumber.getAttribute("value");
	     //System.out.println(oldvalue);
	 
	 WebElement spinup=driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']"));
	 spinup.click();
	 
	 String newvalue=spinup.getAttribute("aria-valuenow");
	   //System.out.println(newvalue);
	
	 
	 if(!(oldvalue.equals(newvalue))) {
		   System.out.println("confirmed value changed");
	   }
	   else {
		   System.out.println("value not changed");
	   }
	 
	 
	 
	}

}
