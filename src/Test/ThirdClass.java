package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThirdClass {

	@Test(groups={"smoke"})
	public void address()
	{
		System.out.println("Cheriyapurayil puthiyappa (po) puthiyangadi");
	}
	
	@AfterSuite
	public void Pen()
	{

	System.out.println("I have a pen");
	}
	
	@BeforeClass
	public void cook()
	{

	System.out.println("before class annotation");
	}
	
	@Test
	public void phone()
	{

	System.out.println("7012599162");
	}
	
	@BeforeTest
	public void First()
	{

	System.out.println("it will execute first");
	}
	
}
