package amazonPrimeAppPack;

import java.net.MalformedURLException;
public class AmazonPrimeApp{
  public static void main(String[] args) throws MalformedURLException{
@Before
public void SetAppium(){
DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A12");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.amazon.avod.thirdpartyclient");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.avod.client.activity.HomeScreenActivity");
		//caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.avod.client.activity.PrimeSignUpActivity");
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
@Given("I launch the Amazon prime mobile app in mobile")
public void i_launch_the Amazon prime mobile app in mobile() throws throwable{
AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
}
@And("I enter credentials to login to the amazon prime app")
public void i_enter_credentials to login to the amazon prime app() throws throwable{
driver.findElement(By.xpath("//android.widget.EditView[@text='Email or phone number']")).sendKeys("8709001243");
		driver.findElement(By.xpath("//android.widget.EditView[@text='Amazon password']")).sendKeys("Kishor@12345");
}
@When("I click on login button able to navigate to home page")
public void i_click_on login button able to navigate to home page() throws throwable{
driver.findElement(By.xpath("//android.widget.TextView[@text='Sign in']")).click();
}
@Then("I should able to search the movie")
public void i_should able to search the movie() throws throwable{
driver.findElement(By.id("com.amazon.avod.thirdpartyclient:id/find_search_box_input")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='movie']")).sendKeys("movie");
}
@And("I should be able to go to result details page")
public void i_should be able to go to result details page() throws throwable{
driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.amazon.avod.thirdpartyclient:id/card_cover_art']")).click();
}
@And("I should be able to play the video")
public void i_should be able to play the video() throws throwable{
driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.amazon.avod.thirdpartyclient:id/action_button_icon_one']")).click();
}
@after
public void closeSession(){
driver.quit();
}

}
}
}
	