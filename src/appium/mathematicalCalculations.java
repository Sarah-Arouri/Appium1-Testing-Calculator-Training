package appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class mathematicalCalculations extends Actions {
	Actions action = new Actions();

	@BeforeTest
	public void setup() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "appiumTest");

		// only for Apps
		caps.setCapability(MobileCapabilityType.APP,
				System.getProperty("user.dir") + File.separator + "app" + File.separator + "calculator.apk");

	}

	@Test
	public void myCalculatorApp() throws MalformedURLException {
		var appiumServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appiumServerUrl, caps);
		action.addTowNums("5", "2");
		action.ClearingData();
		action.subTowNums("9", "4");
		action.ClearingData();
		action.mulTowNums("2", "2");
		action.ClearingData();
		action.sqrtNumber("4");
		action.ClearingData();
		action.powTowNums("4", "2");
		action.ClearingData();
		action.factorialNumber("3");
		
		
		
		
	}

	
	
	
	
	
	
	@AfterTest
	public void myAfterTest() {

	}

}
