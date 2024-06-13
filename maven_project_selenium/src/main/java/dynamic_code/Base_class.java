package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	public static WebDriver driver;
public static void launch_Browser(String browser) {
	 if(browser.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
		 
	 }else if(browser.equalsIgnoreCase("firefox")) {
		  driver = new FirefoxDriver();
		 
		 
	 }else if (browser.equalsIgnoreCase("edge")) {
		  driver = new EdgeDriver();
		 
	 }
	 System.out.println("the browser launched is  : "+ browser);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
	public static void Hiturl(String url) {
		driver.get(url);
		System.out.println(driver.getTitle());
	
		
			
		}
	public static void takesscreenshot(String screenshot_name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("./ screenshots/"+screenshot_name+".png");
	org.openqa.selenium.io.FileHandler.copy(source, target);
	}
	
		
		
	

}











