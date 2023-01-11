package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SecondClass {
    @AfterMethod
    public void open()
    {
		System.out.println("After method printing");

    }
	@Test(groups={"smoke"})
	public void name()
	{
		System.out.println("Shilka");
	}
	
	@AfterClass
	public void pick()
	{
		System.out.println("after class annotation");
	}
	
}
