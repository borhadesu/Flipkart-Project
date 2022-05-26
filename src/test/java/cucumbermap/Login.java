 package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	@When ("^user open \"(.*)\" browser with exe$")
		public void bLaunch (String bname)
	{
		Object[] input=new Object[1];
		input[0]=bname;
	    SeleniumOperations.browserlaunch(input);	
	}
	 
	@When ("^user navigate to url$") 
	    public void navigateURL()
	{
		SeleniumOperations.openApplication();	
	}
	@When ("^user cancel initial login window$")
	    public void cancelLogin()
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
	}
	@When ("^user navigate to login button$")
		public void navigateLogin() throws Exception
	{
		Thread.sleep(5000);
		Object[] input3=new Object[1];
		input3[0]="//*[text()='Login']";
		Hashtable<String, Object> output3=SeleniumOperations.moveToElement(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate to login button$", output3.get("MESSAGE").toString());
	}
	@When ("^user click on MyProfile$")
		public void clickMyprofile() throws Throwable
	{    
		Thread.sleep(5000);
		 Object[] input4=new Object[1];
		 input4[0]="//*[text()='My Profile']";
			Hashtable<String, Object> output4=SeleniumOperations.clickOnElement(input4);
			HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on MyProfile$", output4.get("MESSAGE").toString());
	}
	@When ("^user enters \"(.*)\" as username$")
		public void userName(String username) throws Throwable
	{ 
		Thread.sleep(5000);
		Object[] input5=new Object[2];
		 input5[0]="(//*[@type='text'])[2]";
		 input5[1]=username;
		 Hashtable<String, Object> output5=SeleniumOperations.sendKeys(input5);
		 HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"(.*)\" as username$", output5.get("MESSAGE").toString());
	}
	@When ("^user enters \"(.*)\" as password$")
	    public void passWord(String password) throws Throwable
	{
		 Object[] input6=new Object[2];
		 input6[0]="//*[@type='password']";
		 input6[1]=password;
		 Hashtable<String, Object> output6=SeleniumOperations.sendKeys(input6);
		 HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"(.*)\" as password$", output6.get("MESSAGE").toString());
		
	}
	@When ("^user click on login button$")
		 public void login() throws Throwable
	{
		Thread.sleep(5000);
		 Object[] input7=new Object[1];
		 input7[0]="(//*[@type='submit'])[2]";
		 Hashtable<String, Object> output7=SeleniumOperations.clickOnElement(input7);
		 HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on login button$", output7.get("MESSAGE").toString());
		
	}
	@Then ("^application shows user profile to user$")
		  public void validation() throws Throwable
	{
		  Thread.sleep(5000);
		  Object[] input8=new Object[2];
		  input8[0]="//*[text()='Sujata Borhade']";
		  input8[1]="Sujata Borhade";
		  Hashtable<String, Object> output8=SeleniumOperations.validation(input8);
		  HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows user profile to user$", output8.get("MESSAGE").toString());
	}
	
	@Then ("^application shows error message to user$")
	 public void inValid() throws Throwable
	{
	 Thread.sleep(5000);
	 Object[] input9=new Object[2];
	  input9[0]="(//*[text()='Login'])[2]";
	  input9[1]="Login";
	  Hashtable<String, Object> output9=SeleniumOperations.validationForInvalid(input9);
	  HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^application shows error message to user$", output9.get("MESSAGE").toString());
	}
	
	@When ("^user enter (.+) as username$")
	public void uname (String given) throws Throwable
	{
		Object[] input10=new Object[2];
		 input10[0]="(//*[@type='text'])[2]";
		 input10[1]=given;
		 Hashtable<String, Object> output10=SeleniumOperations.sendKeys(input10);
		 HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^user enter (.+) as username$", output10.get("MESSAGE").toString());
		
	}
	
	@When ("^user enter (.+) as password$")
	public void pass(String given) throws Throwable
	{
		 Object[] input11=new Object[2];
		 input11[0]="//*[@type='password']";
		 input11[1]=given;
		 Hashtable<String, Object> output11=SeleniumOperations.sendKeys(input11);
		 HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^user enter (.+) as password$", output11.get("MESSAGE").toString());
	}
	
}
