package script_executor;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Railyatri extends Base_class{

	public static void main(String[] args) {
		launch_Browser("chrome");
		Hiturl("https://www.railyatri.in/");
		   WebElement enter_text = driver.findElement(By.cssSelector("input#search_status"));
enter_text.click();
enter_text.sendKeys("12444");

	
// scroll 
JavascriptExecutor js = (JavascriptExecutor)driver;

	}

}
