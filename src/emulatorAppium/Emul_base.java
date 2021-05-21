package emulatorAppium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Emul_base {
	
	public static AndroidDriver<AndroidElement> capabilities () throws MalformedURLException {
				
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		
		System.setProperty("webdriver.http.factory", "apache");

		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-001");
		ds.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		ds.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), ds);
		
		return driver;
	}
}
