package emulatorAppium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop extends Emul_base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities("realdevice");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();

		TouchAction act = new TouchAction(driver);

		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement dest = driver.findElementsByClassName("android.view.View").get(2);
		
		act.longPress(element(source)).moveTo(element(dest)).release().perform();
	}

}
