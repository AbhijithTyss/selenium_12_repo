package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetDisease {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement mapFrame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		
		driver.switchTo().frame(mapFrame);
		driver.findElement(By.name("Montana")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("SIGN UP")).click();
	}

}
