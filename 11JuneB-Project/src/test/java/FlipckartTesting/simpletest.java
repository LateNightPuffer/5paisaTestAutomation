package FlipckartTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Flipkart.AddToCart;
import Flipkart.FlipKartLogin;

public class simpletest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajinkya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");	
		//driver.manage().window().maximize();	
		
		FlipKartLogin log= new FlipKartLogin(driver);
		AddToCart add = new AddToCart(driver);
		log.Phone();
		log.Pass();
		
		log.Login();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		add.Search();
		add.Sbutton();
		add.Gender();
		add.Menclick();
		add.MinimumValue();
		
	}

}
