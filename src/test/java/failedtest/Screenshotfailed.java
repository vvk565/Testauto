package failedtest;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Screenshotfailed extends Baseclass{
	
	
	
	
   @BeforeMethod
	public void setup() {
		
	   browser();
		
	   
		
		
		
	}
	@AfterMethod
	public void after() {
		
		driver.quit();
		
	}
	@Test
	public void test() {
		
		Assert.assertEquals(false, true);
		
		
	}
	
	
}
