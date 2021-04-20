package testngframe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testingdemo {

	WebDriver driver;
	
	@BeforeMethod
	public void tesdemo() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pande\\eclipse-workspace\\Testauto\\drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}
		
		@Test
		public  void testcaseone() {
			
			
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"][@ng-model=\"FirstName\"]")).sendKeys("vivek");
		
		

		Actions act = new Actions(driver);
		
		
	   act.moveToElement(driver.findElement(By.xpath("//a[@href=\"SwitchTo.html\"][1]"))).moveToElement(driver.findElement(By.xpath("//a[text()=\"Windows\"]"))).build().perform();
	   
	   driver.findElement(By.xpath("//a[text()=\"Windows\"]")).click();
		
		
	   
	   
		}
	  @Test
		public void testthree() throws IOException {
			
			TakesScreenshot ts =  (TakesScreenshot)driver;
			
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./ScreenShots","bug.png");
			
			FileUtils.copyFile(screenshot, dest);
			 
			 
			
			
			
		}
	        @AfterTest
			public void after() {
				
				driver.quit();
				
				
			}
			
		}
		
	
	
	

