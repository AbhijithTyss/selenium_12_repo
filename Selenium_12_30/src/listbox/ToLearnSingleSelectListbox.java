package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelectListbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/reg/");
		WebElement monthDopdown = driver.findElement(By.id("month"));
		Select monthSelect=new Select(monthDopdown);
//		monthSelect.selectByIndex(11);
//		monthSelect.selectByValue("8");
		monthSelect.selectByVisibleText("Aug");
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select daySelect=new Select(dayDropdown);
		daySelect.selectByIndex(0);
		
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect =new Select(yearDropDown);
		List<WebElement> allOptions = yearSelect.getOptions();
		
		for(WebElement ele:allOptions) {
			System.out.println(ele.getText());
			yearSelect.selectByVisibleText(ele.getText());
		}
		System.out.println(monthSelect.isMultiple());
	}

}
