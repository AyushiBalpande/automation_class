package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import dynamic_code.Base_class;

public class Alerts extends Base_class{

	public static void main(String[] args) throws Throwable  {
		launch_Browser("chrome");
		Hiturl("https://demo.automationtesting.in/Alerts.html");
		
		
		
		//simplealert
driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
   Alert simplealert = driver.switchTo().alert();
System.out.println(simplealert.getText());
Thread.sleep(2000);
simplealert.accept();

//conformationalter
driver.findElement(By.linkText("Alert with OK & Cancel "));
driver.findElement(By.className(" btn btn-primary"));
 Alert conformationalter = driver.switchTo().alert();
System.out.println(conformationalter.getText());
Thread.sleep(3000);
conformationalter.accept();

//promtalter


//driver.findElement(By.className("div#OKTab")).click();


	}

}
