package pages;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class samsungPhoneList {
	
	WebDriver driver;
	public samsungPhoneList(WebDriver driver){

        this.driver = driver;

    }

	By selectFirstPhone = By.xpath("//a[text()='Samsung Galaxy A50s (Prism Crush Violet, 128 GB)']");
	
    //Select first phone

    public void selectFirstPhone() throws InterruptedException{

    	driver.findElement(selectFirstPhone).click();
    	//Switch focus to new tab
    	 ArrayList tabs = new ArrayList (driver.getWindowHandles());
    	 driver.switchTo().window((String) tabs.get(0));

    }
	
}
