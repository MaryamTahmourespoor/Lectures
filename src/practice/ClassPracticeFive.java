package practice;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClassPracticeFive {

	public static void main(String[] args) {
	
//		- create a class in practice package and name it ClassPracticeFive
//		- Open Test Environment and move mouse over Laptops & NoteBooks
//		- double click on Show All Laptops & Notebooks element
//		- Sort by price (low> high) on short by dropdown
//		- navigate to https://ksrtc.in/oprs-web/ and click on app Store element
//		- then switch driver to child window and print title and close this window
//		- switch back to parent and click on Serch for Bus option. then accept the alert
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		
		Actions action = new Actions(driver);
		WebElement labtopsNotebooks = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		action.moveToElement(labtopsNotebooks).build().perform();		
		
		WebElement showAlllabtopsNotebooks = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		action.doubleClick(showAlllabtopsNotebooks).build().perform();
		
		WebElement sortBy = driver.findElement(By.xpath("//select[@id='input-sort']"));
		Select select = new Select(sortBy);
		select.selectByIndex(3);
		
		driver.navigate().to("https://ksrtc.in/oprs-web/");
		
		WebElement appStore = driver.findElement(By.xpath("//img[@src='//static.abhibus.com/ks/ksrtc/web/_assets/images/web/app-store-2.png']"));
		action.doubleClick(appStore).build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
