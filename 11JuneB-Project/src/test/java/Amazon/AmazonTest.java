package Amazon;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AmazonTest {
	WebDriver driver;	
	@BeforeClass
	public void BrowserLaunch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajinkya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.amazon.in/");
	driver.manage().window().maximize();

}

	@BeforeMethod
	public void homepage() {
		System.out.println("Before Method");
	}
	
	@Test
	public void Test() {
		System.out.println("Test");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Aftermethod");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("AfterClass");
	}
}
