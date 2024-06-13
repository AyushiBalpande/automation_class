package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Base_class;

public class Report extends Base_class{

	public static void main(String[] args) {
	//	use syso . get property method
	String projectpath = System.getProperty("user.dir");
	System.out.println(projectpath);
	
	//create object extentsparkreporter class
	ExtentSparkReporter exs = new ExtentSparkReporter(projectpath + "\\reports\\first report gen");
	exs.config().setDocumentTitle("document1");
	exs.config().setReportName("report");
	exs.config().setTheme(Theme.DARK);
	
	//create object of extendreports class it is responsible for cerate report
	ExtentReports er = new ExtentReports();
	er.attachReporter(exs);
	
	er.setSystemInfo("operating system", "windows");
	er.setSystemInfo("browser", "chrome");
	er.setSystemInfo("tester", "ayushi");
	er.setSystemInfo("ecomerce_site", "meesho");
	//create object
	ExtentTest gg = er.createTest("search on meesho");

	gg.log(Status.INFO, "find web element");
	gg.log(Status.INFO, "click on search");
	gg.log(Status.INFO, "sendkey_sare");
	gg.log(Status.INFO, "search_functinality");
	gg.log(Status.PASS, "pass_testcase_functinality");
	
	launch_Browser("chrome");
	Hiturl("https://www.meesho.com/");
	
	
	
	
	
	
	
	
	
	}

}
