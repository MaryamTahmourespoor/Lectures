package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MrayamPractic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.get("url");
		driver.getTitle();
		driver.navigate().to("url");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.close();
		driver.quit();
		driver.findElement(By.className("className"));
		
		WebElement element = driver.findElement(By.id("id"));
		element.click();
		element.clear();
		element.getText();
		element.sendKeys("value");
		element.isDisplayed();
		element.isEnabled(); 
		element.isSelected();
		
		
		
		
		
		
		
		
	}

}
