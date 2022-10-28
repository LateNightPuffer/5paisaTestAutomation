package FlipckartTesting;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Flipkart.AddToCart;
import Flipkart.FlipKartLogin;

public class FlipKartTest1 {
WebDriver driver;	
FlipKartLogin log;
AddToCart add;
@BeforeClass
public void BrowserLaunch() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajinkya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.flipkart.com/");	
	
log= new FlipKartLogin(driver);

log.Phone();
log.Pass();
log.Login();
Thread.sleep(2000);
driver.manage().window().maximize();

}
@BeforeMethod
public void SearchProduct() {
AddToCart add = new AddToCart(driver);
add.Search();
add.Sbutton();
add.Gender();
add.Menclick();
add.MinimumValue();
add.shoes();
Set<String> ids = driver.getWindowHandles();
ArrayList<String> a = new ArrayList<String> (ids);
driver.switchTo().window(a.get(1));

}

@Test
public void FlipTest() throws InterruptedException {
System.out.println("FlipTest");
String title = driver.getTitle();
System.out.println(title);

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0, 2500)");
AddToCart add = new AddToCart(driver);
add.Addproduct();
add.shoesize8();
add.Delect();
add.Delect2();
Thread.sleep(2000);
add.SelectButton();
Thread.sleep(3000);
String URL = driver.getCurrentUrl();
System.out.println(URL);
Assert.assertEquals(URL, "https://www.flipkart.com/viewcart");
add.PlaceOrder();

}
@AfterMethod
public void After() {
System.out.println("AfterMethod");	
}
@AfterClass
public void Afterclass() {
	System.out.println("Afterclass");
}

}
