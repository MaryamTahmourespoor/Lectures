package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MaryamSkakura {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.get("http://tek-school.com/retail/index.php?route=common/home");
//		Actions action = new Actions(driver);
//		WebElement laptopsAndNotebooks = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
//		action.moveToElement(laptopsAndNotebooks).build().perform();
//		WebElement showAllLaptopsAndNotebooks = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
//		showAllLaptopsAndNotebooks.click();
//		WebElement bbb=driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[1]/h4/a"));
//		bbb.click();
	
	System.setProperty("webdriver.chrome.driver", ".\\drivers.chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://tek-school.com/retail");
	System.out.println(driver.getTitle());
	WebElement myAccount=driver.findElement(By.xpath("//span[text()='My Account']"));
	myAccount.click();
	WebElement register= driver.findElement(By.xpath("//a[text()='Register']"));
	register.click();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
