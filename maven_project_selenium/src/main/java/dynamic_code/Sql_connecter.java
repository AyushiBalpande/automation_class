package dynamic_code;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sql_connecter {

	public static WebDriver driver;
	public static String host = "localhost";
	public static String portnumber = "3306";
	 public static ResultSet result ;
	public static void launch_Browser_1(String browser) {
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
	
		public static void Hiturl_1(String url) {
			driver.get(url);
			System.out.println(driver.getTitle());
				}
		
		public static void takesscreenshot(String screenshot_name) throws Throwable {
			TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./ screenshots/"+screenshot_name+".png");
		org.openqa.selenium.io.FileHandler.copy(source, target);
		}
		
			
		
		public static void connection (String databasename, String sql_query) throws SQLException {
			
		Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+databasename, "root","ayushi.com");
		
		Statement cs = connect.createStatement();
		 result = cs.executeQuery(sql_query);
		result.next();
		//use next method for to jump on next index  (index start in sql from 1 and array 0)
		}
		
		public static void database_coloumn(String coloumn, String locater) throws Exception  {
			
		System.out.println(result.getString(coloumn));
		driver.findElement(By.xpath(coloumn)).sendKeys(result.getString( coloumn
				));
		}
		
		
		
}
