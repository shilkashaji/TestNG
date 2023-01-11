package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class ForthClass {

	@Test
	public void Nationality()
	{
		System.out.println("India");
	}
	
	@Test(groups={"smoke"})
	public void State()
	{

	System.out.println("Kerala");
	}
	
	@BeforeSuite
	public void Pen()
	{

	System.out.println("I have a pen");
	}
	
	
	@Test
	public void District()
	{

	System.out.println("Kozhikode");
	}
}
