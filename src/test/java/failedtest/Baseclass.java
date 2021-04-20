package failedtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	public static void browser() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pande\\eclipse-workspace\\Testauto\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		
		
	}
	
	
	public void  screen() {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File screenshot =ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./ScreenShots","fail.png");
		
		try {
			FileUtils.copyFile(screenshot, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
