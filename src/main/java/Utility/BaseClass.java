package Utility;

import java.io.File;

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
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		capabilities.setCapability("networkSpeed", "gsm");

		try {

			driver = new AndroidDriver<MobileElement> (new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

		} catch (Exception e) {
			e.printStackTrace();
		}	



		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	//Reading  locators from properties file
	public MobileElement getElement(String locatorKey){

		MobileElement m = null;
		try {

			m = driver.findElement(By.xpath(pro.getProperty(locatorKey)));
		} catch (Exception ex) {

			ex.printStackTrace();

		}

		return m;

	}

	//Take a screenshots
	public String captureScreenShot() {

		Date d = new Date();
		String screenshot = d.toString().replace(" ", "_").replace(":", "_");
		File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String userDirectory = System.getProperty("user.dir");
		String destination = userDirectory + "/screenshots/" + screenshot + ".png";
		try {
			FileUtils.copyFile(scrFile, new File(destination));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return destination;
	}

	//Click method
	public void click(String locatorKey){
		try {
			System.out.println("Clicking on - "+locatorKey);
			Assert.assertTrue((getElement(locatorKey)).isDisplayed());
			getElement(locatorKey).click();
			captureScreenShot();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	//Type method
	public void enter(String locatorKey,String inputText){	
		try {
			System.out.println("Entering text in the field "+locatorKey);
			Assert.assertTrue((getElement(locatorKey)).isDisplayed());
			getElement(locatorKey).sendKeys(inputText+"\n");
			captureScreenShot();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	//Close method
	public void close() throws InterruptedException
	{
		try {
			driver.closeApp();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
