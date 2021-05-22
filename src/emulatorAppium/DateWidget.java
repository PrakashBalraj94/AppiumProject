package emulatorAppium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DateWidget extends Emul_base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities("emulator");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		TouchAction act = new TouchAction(driver);
		
		WebElement minutes15 = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement minutes45 = driver.findElementByXPath("//*[@content-desc='45']");
		
		act.longPress(longPressOptions().withElement(element(minutes15)).withDuration(ofSeconds(2))).moveTo(element(minutes45)).release().perform();

	}

}
