package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstClass {
	
	@AfterTest
	public void last()
	{
		System.out.println("It will execute last");
	}

	@Test
	
	public void Demo()
	{
		System.out.println("hello");
	}
	
    @BeforeMethod
	
	public void Dot()
	{
		System.out.println("Dot print in every method");
	}

    @Test
	
	public void Demo2()
	{
		System.out.println("Bye");
	}
}
