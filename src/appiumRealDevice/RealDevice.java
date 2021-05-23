package appiumRealDevice;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.org.apache.xml.internal.utils.URI;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDevice extends Real_base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		TouchAction mAct = new TouchAction(driver);
		
		Actions act = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@text='Search']").sendKeys("oneplus 9 pro");
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<AndroidElement> productName = driver.findElements(By.xpath("//*[@class='android.view.View' and @content-desc]"));
		
		System.out.println(productName.size());
		
		for(AndroidElement prdName : productName) {
			System.out.println(prdName.getTagName());
		}
		
		for(AndroidElement prdName : productName) {
			
			if(prdName.getTagName().contains("OnePlus 9 Pro")) {
				
				prdName.click();
				break;
			}
			
		}

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceIdMatches(\".*style_name-button.*\"))");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@resource-id='style_name-button']").click();
		
		Thread.sleep(1000);
		List<AndroidElement> styleLists = driver.findElementsByXPath("//*[@class='android.widget.Button']");
		System.out.println(styleLists.size());
		for(AndroidElement styleList : styleLists) {
			System.out.println(styleList.getText());
		}
		
		for(AndroidElement styleList : styleLists) {
			if(styleList.getText().contains("8GB RAM")) {
				styleList.click();
				break;
			}
		}
		
		for(AndroidElement styleList : styleLists) {
			if(styleList.getText().contains("Stellar Black")) {
				styleList.click();
				break;
			}
		}
		
		driver.findElementByAndroidUIAutomator("text(\"DONE\")").click();
		
		Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"See All Buying Options\"))");
		
		Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("text(\"See All Buying Options\")").click();
		
		Thread.sleep(1000);
		driver.findElementByClassName("android.widget.Button").click();
		
		driver.findElementById("in.amazon.mShop.android.shopping:id/chrome_action_bar_cart_image").click();
		
	}

}
