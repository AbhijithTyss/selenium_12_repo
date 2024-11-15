package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("(//div[@class='input-prefix col auto'])[3]")).click();
		
		int count =0;
		while(true) {
			try {
				driver.findElement(By.xpath("//span[text()='January']/../../..//span[text()='2']")).click();
				break;
			} catch (Exception e) {
				if (count==0) {
					driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
					count++;
				}else {
					driver.findElement(By.xpath("(//span[@class='calender-month-change'])[2]")).click();
				}
				
			}
		}
		
		
		
	}

}
