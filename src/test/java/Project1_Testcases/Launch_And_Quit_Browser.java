package Project1_Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Launch_And_Quit_Browser 
{
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch_browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void close_browser() throws IOException, InterruptedException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Project1\\Project1_Screenshots\\test_"+Math.random()+".png");
		FileHandler.copy(source, dest);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
