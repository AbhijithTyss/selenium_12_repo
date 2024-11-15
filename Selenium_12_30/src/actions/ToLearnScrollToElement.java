package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait( driver, Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement facebook = driver.findElement(By.linkText("Facebook"));
		
		Actions act=new Actions(driver);
//		act.scrollToElement(facebook).perform();
		act.scrollByAmount(0, 500).perform();
		act.scrollByAmount(0, -300).perform();
	}

}
