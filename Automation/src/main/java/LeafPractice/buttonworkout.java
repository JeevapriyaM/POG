package LeafPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buttonworkout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
driver.get("https://www.leafground.com/button.xhtml");

//Click and Confirm title.
WebElement clickaction= driver.findElement(By.id("j_idt88:j_idt90"));
clickaction.click();
String title=driver.getTitle();
System.out.println("The Title is:" + title);


//Confirm if the button is disabled.
driver.navigate().back();
WebElement confirmbutton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt92']"));
boolean enabledornot=confirmbutton.isEnabled();
if(enabledornot)
{
	System.out.println("The Confirm button is enabled");
}
else
{
	System.out.println("The confirm button is disabled");
}

//Find the position of the Submit button
 WebElement findposition= driver.findElement(By.name("j_idt88:j_idt94"));
 Point xyposition=findposition .getLocation();
 int xvalue=xyposition.getX();
 int yvalue=xyposition.getY();
 System.out.println("Value of X is "+ xvalue );
 System.out.println("Value of Y is "+ yvalue );
 
 //Find the Save button color
 WebElement colorfind= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
 String color = colorfind.getCssValue("background-color");
 System.out.println(color);
 
 //Find the height and width of this button
WebElement findelement= driver.findElement(By.id("j_idt88:j_idt98"));
int height =findelement.getSize().getHeight();
int width=findelement.getSize().getWidth();
System.out.println("Height is"+height +" " + "Width is"+width );


//Mouse over and confirm the color changed
WebElement button = driver.findElement(By.xpath("//span[text()='Success']"));
String cssValue1 = button.getCssValue("background-color");

Actions hover =new Actions(driver);
hover.moveToElement(button);
String cssValue2 = button.getCssValue("background-color");

if(cssValue1!=cssValue2)
	 System.out.println("color changed");

//Click Image Button and Click on any hidden button
WebElement clicktheimage=driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));	
clicktheimage.click();
WebElement clickedtheimage=driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));	
clickedtheimage.click();
WebElement hiddenimage=driver.findElement(By.id("j_idt88:j_idt102:j_idt104"));
boolean hideimage=hiddenimage.isDisplayed();
if(hideimage)
{
	System.out.println("the image is displayed");
}
else
{
	System.out.println("the image is not displayed");
}

//How many rounded buttons are there?
//List<WebElement> roundedbutton = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following::span"));
//System.out.println(roundedbutton.size());

//List<WebElement> roundedbutton = driver.findElements(By.xpath("//button[contains(@class,'only rounded')]"));
//System.out.println("No.of.buttons available are:"+roundedbutton.size());

List<WebElement> count= driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
System.out.println("total no of rounded button is: " +count.size());
	}
}
