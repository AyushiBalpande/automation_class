package database_testing;

import java.sql.SQLException;

import org.openqa.selenium.By;

import dynamic_code.Sql_connecter;

public class Facebook_connecter extends Sql_connecter {

	public static void main(String[] args) throws SQLException {
		launch_Browser_1("chrome");
		Hiturl_1("https://in.linkedin.com/");
		driver.findElement(By.xpath("//a[@class='nav__button-secondary btn-md btn-secondary-emphasis']")).click();
		
		connection("/sql_automation","select email_id, password from linkedin where sr_no = 2" );


	}

}
