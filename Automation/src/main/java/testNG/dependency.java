package testNG;

import org.testng.annotations.Test;

public class dependency {


		@Test(enabled=true)
		public void highchool()
		{
		System.out.println("passed highschool");
		}
		
		@Test(dependsOnMethods="highchool")
		public void highersecondary()
		{
		System.out.println("Pass higher secondary school");
		}
		
		@Test(dependsOnMethods="highersecondary")
		public void college()
		{
		System.out.println("go to college");
		}
		
		
	}

