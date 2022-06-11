package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://canvas.instructure.com/login/canvas");
		
		WebElement email =driver.findElement(By.id("pseudonym_session_unique_id"));
		email.sendKeys("instructor@tekschool.us");
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.name("pseudonym_session[password]"));
		password.sendKeys("123");
		Thread.sleep(5000);
	
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
		login.click();
		driver.close();
		
		

//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://canvas.instructure.com/login/canvas");
//		WebElement email =driver.findElement(By.id("pseudonym_session_unique_id"));
//		email.sendKeys("instructor@tekschool.us");// this method will send value to email field
//		Thread.sleep(5000);
//		WebElement password = driver.findElement(By.name("pseudonym_session[password]"));
//		password.sendKeys("123");
//		Thread.sleep(5000);
//		WebElement login = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
//		login.click(); // this method will click on ui element
//		
//		driver.close();


		
		
		
		
	}

}
