package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/");
		SkillRaryPage sp = new SkillRaryPage(driver);
		sp.getSearchTextField().sendKeys("Selenium", Keys.ENTER);
		Thread.sleep(3000);
		sp.getSearchTextField().sendKeys("Testng");

		// StaleElementReferenceException

		/*
		 * WebElement searchTF = driver.findElement(By.id("navbar-search-input"));
		 * searchTF.sendKeys("Selenium", Keys.ENTER); Thread.sleep(3000);
		 * searchTF.sendKeys("testng");
		 */

	}

}
