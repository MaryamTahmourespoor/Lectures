package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/");
		WebElement from =driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		Thread.sleep(5000);
		from.clear();
		Thread.sleep(5000);
		from.sendKeys("wash");
		Thread.sleep(5000);
		 List<WebElement>depart= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
			Thread.sleep(5000);
		
			for(WebElement departure : depart) {
			 if (departure.getText().contains("BLI")) {
				departure.click();
				break;
			}
		 }
		WebElement to =driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
			to.clear();
			Thread.sleep(5000);
			to.sendKeys("vir");
			List<WebElement> depart1=driver.findElements(By.xpath("//ul[@id='ui-id-2']/li/a"));
			Thread.sleep(5000);
			for (WebElement cityOfAirport : depart1) {
			
				if(	cityOfAirport.getText().contains("EIS")){
				cityOfAirport.click();
				break;
			}
			
		}			
			
	}
}