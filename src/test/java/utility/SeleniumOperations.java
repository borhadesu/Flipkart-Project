	package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;
public class SeleniumOperations 
{
	public static ConfigReader config;
	public static WebDriver driver=null;
	public static Hashtable <String, Object> outputParameters= new Hashtable <String, Object>();
	public static Hashtable <String, Object> browserlaunch(Object[]InputParameters)
	{
		try
		{
		String bname=(String) InputParameters[0];
		
		if(bname.equalsIgnoreCase("chrome"))
		{
		config=new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
		
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if (bname.equalsIgnoreCase("FF"))
		{
			//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
			System.setProperty("webdriver.geckodriver.driver",config.getDriverPathFF());
			
		    driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE","methodused:browserlaunch, Input Given: "  + InputParameters[0].toString());
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE","methodused:browserlaunch, Input Given: "  + InputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable <String, Object> openApplication()
	{
		try
		{
		//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		driver.get(config.getApplicationUrl());		
	
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE","methodused:openApplication, Input Given: "  + config.getApplicationUrl().toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE","methodused:openApplication, Input Given: "  + config.getApplicationUrl().toString());
		}
		return outputParameters;
	}
	
	public static Hashtable <String, Object> clickOnElement(Object[]InputParameters)
	{
		try{
		//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		String XPATH=(String) InputParameters[0];
		driver.findElement(By.xpath(XPATH)).click();
	
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE","methodused:clickOnElement, Input Given: "  + InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE","methodused:clickOnElement, Input Given: "  + InputParameters[0].toString());
		}
		return outputParameters;
	   
	}
	public static Hashtable <String, Object> moveToElement(Object[]InputParameters)
	{
		try{
		String XPATH= (String) InputParameters[0];
		Actions act=new Actions(driver);
		WebElement a= driver.findElement(By.xpath(XPATH));
		act.moveToElement(a).build().perform();
		//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE","methodused:moveToElement, Input Given: "  + InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE","methodused:moveToElement, Input Given: "  + InputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable <String, Object> sendKeys(Object[]InputParameters) throws Throwable
	{
		try{
		String XPATH= (String) InputParameters[0];
		String USERNAME=(String) InputParameters[1];
		//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.findElement(By.xpath(XPATH)).sendKeys(USERNAME);
		 
		 outputParameters.put("STATUS", "PASS");
		 outputParameters.put("MESSAGE","methodused:sendKeys, Input Given: "  + InputParameters[1].toString());
		}
		catch(Exception e)
		{
			 outputParameters.put("STATUS", "FAIL");
			 outputParameters.put("MESSAGE","methodused:sendKeys, Input Given: "  + InputParameters[1].toString());
		}
		return outputParameters;
			
	}
	public static Hashtable <String, Object> validation(Object[]InputParameters) throws Throwable
	{
		try{
		String XPATH= (String) InputParameters[0];
		String text=(String) InputParameters[1];
		String actualText= driver.findElement(By.xpath(XPATH)).getText();
		 
		 if(actualText.equalsIgnoreCase(text))
		 {
			 System.out.println("Test case pass");
		 }
		 else
		 {
			 System.out.println("Test case fail");
		 }
			//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			
			 outputParameters.put("STATUS", "PASS");
			 outputParameters.put("MESSAGE","methodused:validation, Input Given: "  + InputParameters[1].toString()  );
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			 outputParameters.put("MESSAGE","methodused:validation, Input Given: "  + InputParameters[1].toString()  );
		}
		return outputParameters;
	}
    
	public static Hashtable <String, Object> validationForInvalid(Object[]InputParameters) throws Throwable
	{
		try{
		String XPATH= (String) InputParameters[0];
		String text=(String) InputParameters[1];
		String actualText= driver.findElement(By.xpath(XPATH)).getText();
		 
		 if(actualText.equalsIgnoreCase(text))
		 {
			 System.out.println("Test case pass");
		 }
		 else
		 {
			 System.out.println("Test case fail");
		 }
			//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			 outputParameters.put("MESSAGE","methodused:validationForInvalid, Input Given: "  + InputParameters[1].toString()  );
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			 outputParameters.put("MESSAGE","methodused:validationForInvalid, Input Given: "  + InputParameters[1].toString()  );
		}
		return outputParameters;
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
