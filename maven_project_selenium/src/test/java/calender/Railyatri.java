package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Railyatri extends Base_class {

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		Hiturl("https://www.railyatri.in");
		takesscreenshot("urlhit");
		
	WebElement enter_tex = driver.findElement(By.cssSelector("input#search_status"));
		
	enter_tex.click();
	enter_tex.sendKeys("12121");
	takesscreenshot("text");
	
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
		
		
		
	}

}
