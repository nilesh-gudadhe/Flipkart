package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable {
	@Before
	public void before(Scenario scenario) throws UnknownHostException{
	HTMLReportGenerator.TestSuiteStart("D:\\IT\\Projects\\Flipkart_IT3\\Report\\Flipkart.html", "Nilesh");
	HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
	System.out.println("-------------------------------Scenario Start----------------------------------");
	}
	
	@After
	public void after(Scenario scenario){
		System.out.println("-------------------------------Scenario End----------------------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}

}
