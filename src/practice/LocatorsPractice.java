package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException  {
		
//	/	Create a new class in LocatorPractice
//	/	1. Set system property for Chrome browser
//	/	2. Create Reference variable for chromeDriver
//	/	3. Set pageload timeout to 30 seconds
//	/	4. Set Implicit wait for 20 seconds
//	/	5. Maximize browser
//	/	6. open facebook
//		7. Find Email locator and store it in WebElement
//		8. enter email
//		9. find password locator and store it in webelement
//		10. enter password
//		11. find login locator and store it in webelement
//		12. click on login

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
	
//		create a class in practice package and name it ClassPracticeFive
//		- Open Test Environment and move mouse over Laptops & NoteBooks
//		- double click on Show All Laptops & Notebooks element
//		- Sort by price (low> high) on short by dropdown
//		- navigate to https://ksrtc.in/oprs-web/ and click on app Store element
//		- then switch driver to child window and print title and close this window
//		- switch back to parent and click on Serch for Bus option. then accept the alert
	//KSRTC Official Website for Online Bus Ticket Booking - KSRTC.in	
	WebElement desktops=driver.findElement(By.xpath("//a[text()='Desktops']"));
		desktops.click();
		Thread.sleep(3000);
		WebElement showAllDesktops=driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		showAllDesktops.click();
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		WebElement Laptops=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		Actions actions =new Actions(driver);
		actions.moveToElement(Laptops).build().perform();
		
		
		
		
		
		
		
		
	}
}