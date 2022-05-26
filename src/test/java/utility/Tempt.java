package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt 
{
    public static void main(String [] args) throws Throwable
    {
    	//browserLaunch
    	System.setProperty("webdriver.chrome.driver", "E:\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open application
		driver.get("https://www.flipkart.com/");
		
		//Cancel login
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		//move to element
		Actions act=new Actions(driver);
		driver.findElementByXPath("//*[text()='Login']");
		WebElement a=driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(a).build().perform();
		
		//click on my profile
		driver.findElementByXPath("//*[text()='My Profile']").click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//enter username
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("8788753323");
		
		//enter password
		driver.findElementByXPath("//*[@type='password']").sendKeys("********");
		
		//click on login button
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		
		Thread.sleep(5000);
		driver.findElementByXPath("//*[text()='Manage Addresses']").click();
		driver.findElementByClassName("_1QhEVk").click();
		driver.findElementByXPath("//*[@name='name']").sendKeys("Sujata");
		driver.findElementByXPath("//*[@name='phone']").sendKeys("8788753323");
		driver.findElementByXPath("//*[@name='pincode']").sendKeys("412207");
		driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("Wagholi");
		driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Raisoni collage road");
		driver.findElementByXPath("(//*[@type='button'])[2]").click();
	
		
		
		
    }
	
}
