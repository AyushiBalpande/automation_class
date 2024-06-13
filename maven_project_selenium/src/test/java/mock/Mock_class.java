package mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Mock_class {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.meesho.com/");
		driver.getTitle();
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
 File target = new File("./screenshots/meesho browser.png");
FileHandler.copy(source, target);


  WebElement search = driver.findElement(By.className("sc-eDvSVe gUjMRV sc-csuSiG iLNtff search-input-elm sc-csuSiG iLNtff search-input-elm"));
	search.click();
	search.sendKeys("iphone");
	}

}
