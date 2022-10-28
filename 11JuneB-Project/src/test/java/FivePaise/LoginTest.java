package FivePaise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Fivepaisa.FiveLogin;

public class LoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajinkya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.5paisa.com/");
		
		FiveLogin Log = new FiveLogin(driver);
		
		Log.UN();
		Log.PWD();
		Log.DOB();
		Log.Button();
		
	}
		

}
