package testNG;

import org.testng.annotations.Test;

public class sampleTestCase {
	
	@Test(priority=0)
	public void firsttestcase()
	{
	System.out.println("this is firstcase");
	}
	
	@Test(priority=1)
	public void secondtestcase()
	{
	System.out.println("this is secondcase");
	}
	
	@Test(priority=2)
	public void thirdtestcase()
	{
	System.out.println("this is thirdcase");
	}
	
	@Test(priority=3)
	public void lasttestcase()
	{
	System.out.println("this is lastcase");
	}

}
