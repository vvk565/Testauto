package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	WebDriver driver;
	
	@BeforeTest
public void login() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pande\\eclipse-workspace\\Testauto\\drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	
	driver.manage().window().maximize();
}
	@Test(dataProvider="wordpress")
	public void test(String username, String psswd) {
	
	driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys(psswd);
	
	driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
	
	}
	
    @AfterTest
	public void after() {
		
		
		driver.quit();
		
	}


@DataProvider(name="wordpress")	
public Object[][] passdata()
{

	Object[][] data= new Object[1][1];
	
	data[0][0] = "Admin";
	data[0][1] = "Admin1";
	data[1][0] = "Admin";
	data[1][1] = "admin123";
	
	return data;
 
}	
	
	
}
