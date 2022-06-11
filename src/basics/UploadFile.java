package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://xndev.com/display-image/");
		
		WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		fileUpload.sendKeys("C:\\Users\\mantr\\Desktop\\JAVA WS\\Selenium Lectures\\Outcome\\firstNameSS.png"); 
		
		
		
	}

}
