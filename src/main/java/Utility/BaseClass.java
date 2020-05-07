package Utility;

/**
 * 
 * @author Vishal Lad
 * @Description This is main class defined with methods
 * Launching the app
 * Device Capabilities
 * Reading locators
 * 
 */

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseClass {

	public static AndroidDriver<MobileElement> driver;
	DesiredCapabilities capabilities;
	public static Properties pro;


	public void launchApp() throws InterruptedException, IOException

	{
		pro = ConfigurationReader.loadProperty("./config.properties");

		//Capabilities of Device
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion",pro.getProperty("Version"));
		capabilities.setCapability("deviceName", pro.getProperty("Name"));
		capabilities.setCapability("platformName",pro.getProperty("Platform"));
		capabilities.setCapability("udid",pro.getProperty("UDID") );
		capabilities.setCapability("appPackage",pro.getProperty("Package"));
		capabilities.setCapability("appActivity",pro.getProperty( "Activity"));

		//Change network speed
		capabilities.setCapability("networkSpeed", "evdo");


		driver = new AndroidDriver<MobileElement> (new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//Reading types of locators from properties file
	public MobileElement getElement(String locatorKey){

		MobileElement e = null;
		try {
			if(locatorKey.endsWith("_id"))				
				e = driver.findElement(By.id(pro.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_xpath"))
				e = driver.findElement(By.xpath(pro.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_name"))
				e = driver.findElement(By.name(pro.getProperty(locatorKey)));
		} catch (Exception ex) {

			ex.printStackTrace();

		}

		return e;

	}

	public boolean isElementPresent(String locatorKey){


		MobileElement e = null;
		try {
			if(locatorKey.endsWith("_id"))
				e = driver.findElement(By.id(pro.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_xpath"))
				e = driver.findElement(By.xpath(pro.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_name"))
				e = driver.findElement(By.name(pro.getProperty(locatorKey)));

		} catch (Exception ex) {

			System.out.println("Element is not present");
			return false;
		}
		return true;
	}

	//Click method
	public void click(String locatorKey){	
		System.out.println("Clicking on - "+locatorKey);
		getElement(locatorKey).click();

	}

	//Type method
	public void enter(String locatorKey,String inputText){	
		System.out.println("Entering text in the field "+locatorKey);
		getElement(locatorKey).sendKeys(inputText+"\n");	
	}


	//Close method
	public void close() throws InterruptedException
	{
		driver.closeApp();
	}


}
