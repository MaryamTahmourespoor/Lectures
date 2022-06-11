 package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 public class NavigationCommandPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
//		 driver.get("https://www.amazon.com/");
//		 driver.manage().window().maximize();
//		 Thread.sleep(10000);
//		 driver.navigate().refresh();
//		System.out.println(driver.getTitle());
//		Thread.sleep(10000);
//		driver.navigate().to("https://www.amazon.com/");
//		Thread.sleep(10000);
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(10000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(10000);
//		driver.navigate().back();
//		Thread.sleep(10000);
//		driver.navigate().forward();
//		Thread.sleep(10000);		
//		driver.close();		
		//Practice :
		//1- Create a new class and name it NavigationCommandPractice
		//2- Open your browser choice either chrome or firefox
		//3- Make sure browser is opened in maximize size
		//4- lunch Amazon website
		//5- Print Amazon website title
		//6- refresh Amazon page
		//7- now navigate to from Amazon to Facebook website
		//8- Print Facebook website title
		//9- lets go to Amazon back
		//10- i am got bored on amazon, so lets go to Facebook and then close browser

		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		Thread.sleep(5000);
		driver1.get("https://www.amazon.com/");
		System.out.println("Website Title"+ driver1.getTitle());
		Thread.sleep(5000);
		driver1.navigate().refresh();
		Thread.sleep(5000);
		driver1.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println("Website Title"+ driver1.getTitle());
		driver1.navigate().back();
		Thread.sleep(5000);
		driver1.navigate().forward();
		Thread.sleep(5000);
		driver1.close(); 
		}
}
	//Practice :
	//1- Create a new class and name it NavigationCommandPractice
	//2- Open your browser choice either chrome or firefox
	//3- Make sure browser is opened in maximize size
	//4- lunch Amazon website
	//5- Print Amazon website title
	//6- refresh Amazon page
	//7- now navigate to from Amazon to Facebook website
	//8- Print Facebook website title
	//9- lets go to Amazon back
	//10- i am got bored on amazon, so lets go to Facebook and then close browser

	//*//*Practice 2 for students who done with practice one:
	//Create a new Java project and Name it MySeleniumPracticeProject
	//Import all jar files needed and drivers for chrome and firefox.
	//Create few package  such as basics, intermediate, advance
	//in basics package create a class that lunch tekschool website then print
	//website title, and once it prints title, then it should go to google and print
	//google title then come back to tek school website and then close the page.
	//*//*