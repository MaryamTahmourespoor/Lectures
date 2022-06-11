package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeOne {

	public static void main(String[] args) {
	//	http://tek-school.com/retail/index.php?route=product/category&path=20
//		Practice one:
//			Find all webelements on Test Environment page with tag div and print it is value
//			using .getText() method.
//			Practice two:
//			Chane value of Show dropdown from 15 to 100
//			20 Minutes for these two
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/index.php?route=product/category&path=20");
		WebElement sortBy = driver.findElement(By.id("input-sort"));
		
		WebElement show = driver.findElement(By.xpath("//select[@id='input-limit']"));
		Select select = new Select(show);
		select.selectByVisibleText("100");
		
		
	}

}
