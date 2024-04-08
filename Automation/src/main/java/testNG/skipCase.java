package testNG;

import org.testng.annotations.Test;

public class skipCase {

	@Test(priority=0)
	public void startcar()
	{
	System.out.println("Start the car");
	}
	
	@Test(priority=1)
	public void Musicon()
	{
	System.out.println("Start the car and music on");
	}
	
	@Test(priority=2)
	public void putfirstgear()
	{
	System.out.println("changing to firstgear");
	}
	
	@Test(priority=3,enabled=false)
	public void putsecondgear()
	{
	System.out.println("changing to secondgear");
	}
	
	@Test(priority=4)
	public void stopcar()
	{
	System.out.println("stop the car");
	}
}
