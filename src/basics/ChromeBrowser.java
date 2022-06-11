package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");	
		 
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://tekschool.us/");
	
	//step 1 we need chrome browser
		//step 2 we need to pass https://tekschool.us/
		// step 3 tek school website shoul be open
		//---------------------------------------------------------//
		
		//1.We need to setup System.setProperty("key","value")
		//key (" webdriver . chrome.driver")
		//value (path to chromedriver.exe)
		//for windows we will use \\ for path defining
		//for mac we will use\ for path defining
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//		
//		//we need to create reference to Webdriver Interface and then create obj of chrome
//		WebDriver driver = new ChromeDriver();
//		
		// in selenium we have a method called .get() and it accepts url as string
//		 driver.get("https://tekschool.us/");

	
		// Step 1: Create a new package and name it practice
		// step 2: Create a new class and name it MyFirstAutomation
		// step 3: Set system property for chrome browser
		// Step 4: create refernce to Webdriver and assign object of Chrome Driver
		// step 5: Open your favorite website
		// step 6: send a screenshot to slack 
		//"https://bestbuy.com/"
//	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
//	
//	WebDriver driver = new ChromeDriver();
//	 
//	driver.get(c);
	//	"https://bestbuy.com/"
//	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
//	
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://bestbuy.com/");
	//	www.englishclass101.com/"
//	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
//	
//	WebDriver driver= new ChromeDriver();
//	 driver.get("https://www.englishclass101.com/");
	}
		 }
		
	