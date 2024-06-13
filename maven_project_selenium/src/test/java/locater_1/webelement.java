package locater_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/");
		  WebElement shortcut = driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 _6luy\"]"));
		
		shortcut.click();
		shortcut.sendKeys("ayushi");
		WebElement object = driver.findElement(By.cssSelector("input[id =\"pass\"]"));
		
		object.click();
		object.sendKeys("hdgfeuef");
		
		
		
		shortcut.clear();
		object.clear();
		
		
	}

}
