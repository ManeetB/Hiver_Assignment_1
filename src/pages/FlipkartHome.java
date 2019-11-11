package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FlipkartHome {
	
	WebDriver driver;
	public FlipkartHome(WebDriver driver){

        this.driver = driver;

    }
	By electronsLink = By.xpath("//div[@class='_3zdbog _3Ed3Ub']//span[text()='Electronics']");
	By samsungLink = By.xpath("//div[@class='_3zdbog _3Ed3Ub']//a[text()='Samsung']");
	
	
    //Select the electronics sections 

    public void selectSamsung() throws InterruptedException{

    	driver.findElement(electronsLink).click();
    	Thread.sleep(1000);
    	driver.findElement(samsungLink).click();

    }
	
}
