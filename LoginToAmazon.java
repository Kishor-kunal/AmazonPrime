package amazonPrimeAppPack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LoginToAmazon {
	public static void main(String[] args) throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A12");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.amazon.avod.thirdpartyclient");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.avod.client.activity.HomeScreenActivity");
		//caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.avod.client.activity.PrimeSignUpActivity");
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//android.widget.EditView[@text='Email or phone number']")).sendKeys("8709001243");
		driver.findElement(By.xpath("//android.widget.EditView[@text='Amazon password']")).sendKeys("Kishor@12345");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sign in']")).click();
		driver.findElement(By.id("com.amazon.avod.thirdpartyclient:id/find_search_box_input")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='movie']")).sendKeys("movie");
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.amazon.avod.thirdpartyclient:id/card_cover_art']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.amazon.avod.thirdpartyclient:id/action_button_icon_one']")).click();
		driver.quit();
		
		
		
		
}
}
