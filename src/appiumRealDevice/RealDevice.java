package appiumRealDevice;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.org.apache.xml.internal.utils.URI;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		ds.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		
		

	}

}
