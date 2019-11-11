package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.FlipkartHome;
import pages.phoneDetail;
import pages.samsungPhoneList;

public class FlipkartPriceValidation {

	WebDriver driver;
	FlipkartHome objHome;
	samsungPhoneList objPhoneList;
	phoneDetail objPhoneDetail;
	
	
    @BeforeTest

    public void setup(){

    	System.setProperty("webdriver.chrome.driver", "/Users/mbishla/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        //Escape key to ignore the pop up
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE);
        action.perform();
    }
	
    @Test(priority=0)
    
	public void phonePrice() throws InterruptedException {
    	//Click on electronics and select samsung category
    	
    	objHome = new FlipkartHome(driver);
    	objHome.selectSamsung();
    	
    	
    	//select the first samsung phone displayed
    	objPhoneList = new samsungPhoneList(driver);
    	objPhoneList.selectFirstPhone();
    	
    	//Add to cart, increase quantity and display price
    	objPhoneDetail = new phoneDetail(driver);
    	objPhoneDetail.addToCart();
    	objPhoneDetail.printItemPrice();
    	
    }
	
}
