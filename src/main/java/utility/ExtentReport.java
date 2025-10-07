package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    ExtentReports extent;

    public void config()
    {
        String path= System.getProperty("/home/anuj/IdeaProjects/mobile_Hrms_Automate/reports/index.html");
        ExtentSparkReporter reporter= new ExtentSparkReporter(path);
        reporter.config().setReportName("HRMS Result");
        reporter.config().setDocumentTitle("Test Result");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Anuj kumar");
    }

}
