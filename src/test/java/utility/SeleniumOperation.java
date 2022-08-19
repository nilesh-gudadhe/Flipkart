package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.configReader;

public class SeleniumOperation {
	public static WebDriver driver=null;
	public static Hashtable<String, Object> outputParameters= new Hashtable<String, Object>();
	public static configReader config=new configReader();
	public static Hashtable<String, Object> browerLaunch(Object[]inputParameters)
	{	try
	{
		String bname=(String) inputParameters[0];
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome() );
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(bname.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "Method used: browserLaunch(), Input given: "+inputParameters[0]);
	}
	catch(Exception e){
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Method used: browserLaunch(),Input given: "+inputParameters[0]);
	}
	return outputParameters;
	}
	
	public static Hashtable<String, Object> openApp()
	{	try
	{
		driver.navigate().to(config.getApplicationUrl());
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: openApp(), Input given: "+config.getApplicationUrl());
	}
	catch(Exception e){
	
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Method used: openApp(), Input given: "+config.getApplicationUrl());
	}
	return outputParameters;
	}
	
	public static Hashtable<String, Object> clickOn(Object[]inputParameters)
	{try
	{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String xpath= (String)inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: clickOn(), Input given: "+inputParameters[0]);
	}
	catch(Exception e){
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Method used: clickOn(), Input given: "+inputParameters[0]);
	}
	return outputParameters;
	}
	
	public static Hashtable<String, Object> mouseOver(Object[]inputParameters)
	{try{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String xpath= (String)inputParameters[0];
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: mouseOver(), Input given: "+inputParameters[0]);
	}
	catch(Exception e){
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Method used: mouseOver(), Input given: "+inputParameters[0]);
	}
	return outputParameters;
	}
	public static Hashtable<String, Object> sendKeys(Object[]inputParameters)
	{ try {
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String xpath=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: sendKeys(), Input given: "+inputParameters[1]);
	}
	catch(Exception e){
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Method used: sendKeys(), Input given: "+inputParameters[1]);
	}
	return outputParameters;
    }
	public static Hashtable<String, Object> validation(Object[] inputParameters) throws InterruptedException
	{	try{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		Thread.sleep(3000);
	    String xpath=(String)inputParameters[0];
		String givenText=(String)inputParameters[1];
		
		String webText=driver.findElement(By.xpath(xpath)).getText();
		if(webText.equalsIgnoreCase(givenText)){
			System.out.println("Congo!!! Test case is passed");
		}
		else{
			System.out.println("Oops! Test case is failled");
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: validation(), Input Text given: "+inputParameters[1]);
	}
	catch(Exception e){
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Method used: validation(), Input Text given: "+inputParameters[1]);
	}
	return outputParameters;
	}
	public static Hashtable<String, Object> errorMessage(Object[]inputPara)
	{try{driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String xpath=(String) inputPara[0];
		String errText=driver.findElement(By.xpath(xpath)).getText();
		System.out.println("Error message as on website: "+errText);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: errorMessage(), Input given: "+inputPara[0]);
	}
	catch(Exception e){
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Method used: errorMessage(), Input given: "+inputPara[0]);
	}
	return outputParameters;
	}
	
	
	public static Hashtable<String, Object> browserClose() throws InterruptedException{
		try{
			Thread.sleep(5000);
			driver.quit();
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Method used: browserClose(), Input given: sleep 5sec ");
		}
		catch(Exception e){
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method used: browserClose(), Input given: sleep 5sec ");
		}
		return outputParameters;
	}
	
	
	
	
	
	
	
	
	
}
