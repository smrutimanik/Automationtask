package webelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();  //launching an empty  browser
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");  //navigating to amazon web
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist watches");  //To search Wrist watches ion search bar
	Thread.sleep(5000);
	driver.findElement(By.id("nav-search-submit-button")).click();  //To search the product
	Thread.sleep(5000);
	driver.findElement(By.linkText("Fastrack")).click();   //To select fastrack as brand 
	Thread.sleep(5000);
	driver.findElement(By.linkText("Leather")).click();  //To select Leather as Watch Material
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Guys-3278SL03")).click();  // to Click the desired Product
	Set<String> allwinid = driver.getWindowHandles();   //to get the windowid so that we can switch the controller to next window
	for(String id:allwinid) {
		driver.switchTo().window(id);
	}
	driver.findElement(By.id("add-to-cart-button")).click();  //Adding the product inside the cart
}
}
