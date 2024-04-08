package LeafPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdownworkout {

	public static void main(String[] args) throws InterruptedException {

		// entering the given URLthrough Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");  
		
 //Which is your favorite UI Automation tool?	
	WebElement dropdown1=driver.findElement(By.className("ui-selectonemenu"));
    Select value1=new Select(dropdown1);
    value1.selectByIndex(1);
    
	/*
	 * List<WebElement> listfoptions=value1.getOptions(); int
	 * noofoptions=listfoptions.size(); System.out.println(noofoptions);
	 */
    //Choose your preferred country.
    WebElement dropdown2=driver.findElement(By.id("j_idt87:country_label"));
    dropdown2.click();
  WebElement dropdown2value=driver.findElement(By.id("j_idt87:country_2"));
  dropdown2value.click();
  
  // Wait for a while to let the cities load
  Thread.sleep(2000);
 
  //Confirm Cities belongs to Country is loaded
  WebElement citydropdown=driver.findElement(By.id("j_idt87:city"));   // Find the cities dropdown/select box
  citydropdown.click();
  
 List<WebElement> Check=driver.findElements(By.xpath("//Select[contains(@id,'j_idt87:city')]//option")); // Retrieve all the options (cities) from the dropdown
 System.out.println("No.of.options: "+Check.size()); //print number of options available 
 for(WebElement Each:Check)
 { 
	 
	 System.out.println(Each.getAttribute("value"));
	 
 }

	}
	}
