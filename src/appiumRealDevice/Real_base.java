package appiumRealDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Real_base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.http.factory", "apache");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		ds.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		//ds.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		ds.setCapability("appActivity", "com.amazon.mShop.android.home.HomeActivity");
		
		ds.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), ds);
		return driver;


	}

}
