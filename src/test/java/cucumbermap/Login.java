package cucumbermap;

import java.util.Hashtable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class Login {
	
	@When("^user opens \"(.*)\" browser with exe as$")
	public void bLaunch(String bname) throws Throwable {
		Object[] input= new Object[1];
		input[0]=bname;
		Hashtable<String, Object> output=SeleniumOperation.browerLaunch(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user opens \"(.*)\" browser with exe as \"(.*)\"$", output.get("MESSAGE").toString());
	}

	@When("^user enter url as$")
	public void openUrl() throws Throwable {
		
	Hashtable<String, Object> output =SeleniumOperation.openApp();
	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user enter url as \"([^\"]*)\"$", output.get("MESSAGE").toString());
		
	}

	@When("^user cancels initial login window$")
	public void clickCancel() throws Throwable {
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String, Object> output2= SeleniumOperation.clickOn(input2);
		HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^user cancels initial login window$", output2.get("MESSAGE").toString());
		
	 
	}

	@When("^user navigate to Login button$")
	public void navigateToLogin() throws Throwable {
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		Hashtable<String, Object>output3 =SeleniumOperation.mouseOver(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate to Login button$", output3.get("MESSAGE").toString());
	   
	}

	@When("^user clicks on My Profile$")
	public void user_clicks_on_My_Profile() throws Throwable {
		Object[] input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		Hashtable<String, Object>output4= SeleniumOperation.clickOn(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user clicks on My Profile$", output4.get("MESSAGE").toString());
	    
	}

	@When("^user enter username as \"([^\"]*)\"$")
	public void enter_username(String username) throws Throwable {
		Object[] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]=username;
		Hashtable<String, Object>output5= SeleniumOperation.sendKeys(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter username as \"([^\"]*)\"$", output5.get("MESSAGE").toString());
	}

	@When("^user enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) throws Throwable {
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1]=password;
		Hashtable<String, Object>output6=SeleniumOperation.sendKeys(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter password as \"([^\"]*)\"$", output6.get("MESSAGE").toString());
	}

	@When("^user clicks on Login button$")
	public void click_on_Login() throws Throwable {
		Object[] input7=new Object[1];
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String, Object>output7= SeleniumOperation.clickOn(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user clicks on Login button$", output7.get("MESSAGE").toString());
	}

	@Then("^application shows user his profile$")
	public void application_shows_user_his_profile() throws Throwable {
		Object[] input8=new Object[2];
		input8[0]="//*[text()='Nilesh Gudadhe']";
		input8[1]="Nilesh Gudadhe";
		Hashtable<String, Object>output8= SeleniumOperation.validation(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows user his profile$", output8.get("MESSAGE").toString());
	}
	@Then ("^application shows appropriate error message$")
	public void errorMessage()
	{
		Object[]input=new Object[1];
		input[0]="//*[@class='_2YULOR' or @class='_36KMOx']";
		Hashtable<String, Object>output= SeleniumOperation.errorMessage(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^application shows appropriate error message$", output.get("MESSAGE").toString());
	}
	
	
	@When ("^user clicks on logout button$")
	public void logOut()
	{
		Object[]input=new Object[1];
		input[0]="//*[text()='Logout']";
		Hashtable<String, Object>output= SeleniumOperation.clickOn(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user clicks on logout button$", output.get("MESSAGE").toString());
	}
	
	@Then ("^browser closes$")
	public void browserClose() throws InterruptedException
	{
		Hashtable<String, Object>output= SeleniumOperation.browserClose();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^browser closes$", output.get("MESSAGE").toString());
	}
	
	


}
