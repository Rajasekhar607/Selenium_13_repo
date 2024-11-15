package extentReport;

import java.security.Timestamp;
import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
	@Test
	public void report() {
		String timestamp = LocalDateTime.now().toString().replace(":","-");
		// create an instance of ExtentsparkReporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_report/extentReport.html");
		
		//create an instance of ExtentReports
		ExtentReports extReport = new ExtentReports();
		
		// attach an instance of Extentsparkreporter to extentreports
		extReport.attachReporter(spark);
		
		// create an instance of extenttest
		ExtentTest test = extReport.createTest("report");
		
		// call log() to provide status & log message
		test.log(Status.PASS,"log message added into report");
		test.log(Status.PASS,"log message updated");
		
		// call flush() to write messages into destination report
		extReport.flush();
	}

}
