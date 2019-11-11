package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class phoneDetail {
	
	WebDriver driver;
	public phoneDetail(WebDriver driver){

        this.driver = driver;

    }
	By addToCartButton = By.xpath("//button[text()='ADD TO CART']");
	By plusButton = By.xpath("//button[text()='+']");
	By price = By.xpath("//span[@class='pMSy0p XU9vZa']");
	
	
	
    //Add to cart 

    public void addToCart() throws InterruptedException{

    	driver.findElement(addToCartButton).click();
    	Thread.sleep(1000);
    	//click on + to increase the amount
    	driver.findElement(plusButton).click();
    	Thread.sleep(3000);
    }
	
  //return the price

    public void printItemPrice(){
    	 String phoneValue = driver.findElement(price).getText();
    	 System.out.println(phoneValue); 

    }
    
}
