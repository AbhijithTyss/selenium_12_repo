package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(15000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();	
		switchToWindow(driver, "flipkart");
		Point flipkartPosition = driver.manage().window().getPosition();
		switchToWindow(driver, "ebay");
		Point ebayPosition = driver.manage().window().getPosition();
		driver.manage().window().setPosition(flipkartPosition);
		
		switchToWindow(driver, "flipkart");
		driver.manage().window().setPosition(ebayPosition);		
	}
	public static void switchToWindow(WebDriver driver,String url) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(url)) {
				break;
			}
		}
	}
}
