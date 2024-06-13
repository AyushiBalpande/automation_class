package automate_with_baseclass;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;
import locater_1.webelement;

public class amazon_for_screenshots extends Base_class {

	public static void main(String[] args) throws IOException {
		
launch_Browser("chrome");
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("./screenshots/railyatri browser.png");
	org.openqa.selenium.io.FileHandler.copy(source, target);
	
	Hiturl("https://www.amazon.in/");
	TakesScreenshot take = (TakesScreenshot) driver;
	 File copy = take.getScreenshotAs(OutputType.FILE);
	File past = new File("./screenshots/amazon hit.png");
org.openqa.selenium.io.FileHandler.copy(copy, past);
	
WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	search.click();
	search.sendKeys("iphone");
	
	String projectpth = System.getProperty("user.dir");
	System.out.println(projectpth);
	
	TakesScreenshot ss = (TakesScreenshot) driver;
    File source1 = ss.getScreenshotAs(OutputType.FILE);
	File target1 = new File(projectpth + "\\screenshots\\search.png");
	org.openqa.selenium.io.FileHandler.copy(source1, target1);
	
	
	
	}

}
