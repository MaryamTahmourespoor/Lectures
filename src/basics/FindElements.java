package basics;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	
	driver.get("http://tek-school.com/retail/");
	
		List<WebElement> webLinks=driver.findElements(By.tagName("a"));
		System.out.println(webLinks.size());
	
	for (WebElement links : webLinks) {
		System.out.println(links.getAttribute("herf"));
		if (links.getText().equals("MP3 Players")) {
			links.click();
			break;
		}
	}
	
//		List<WebElement> webLinks=driver.findElements(By.tagName("a"));
//		System.out.println(webLinks.size());
//		
//		for (WebElement links : webLinks) {
//			System.out.println(links.getAttribute("href"));
//			if (links.getText().equals("Components")) {
//				links.click();
//				break;
				
				
//		List<WebElement> webLink =driver.findElements(By.tagName("a"));
//		System.out.println(webLink.size());
//				for (WebElement link1: webLink) {
//					System.out.println(link1.getAttribute("herf"));
//				if (link1.getText().equals("Cameras")) {
//					link1.click();
//					break;
					
				
				
			
		
		
		 
		
	}
}