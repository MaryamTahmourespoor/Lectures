package basics;

import java.awt.Desktop;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/index.php?route=common/home");
		
		WebElement desktops =driver.findElement(By.xpath("//a[text()= 'Desktops']"));
		desktops.click();
		
		WebElement showAllDesktop = driver.findElement(By.xpath("//a[text()= 'Show All Desktops']"));
		showAllDesktop.click();
		
	WebElement sortBy = driver.findElement(By.id("input-sort"));
	Select select = new Select(sortBy);
	select.selectByIndex(4);
	Thread.sleep(3000);
	
	WebElement show =driver.findElement(By.id("input-limit"));
	Select selectShow = new Select(show);
	selectShow.selectByVisibleText("100");
	
		
		
		
		
		
		
		
	}

}
