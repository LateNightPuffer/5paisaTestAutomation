package FivePaise;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Fivepaisa.FiveLogin;
import Fivepaisa.MainLogin;
import Fivepaisa.MutualFundsPage;
import Utils.Utility;

public class Test5paisa1 extends Utility  {
	
WebDriver driver;
MainLogin mainlog;
FiveLogin log;
MutualFundsPage MFP;
ChromeOptions c;
@Parameters ("Browser")

@BeforeTest	
public void openbrowser(String BrowserName) {
	c = new ChromeOptions();
	System.out.println(BrowserName);
	if(BrowserName.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajinkya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    driver = new ChromeDriver();
}  

	if(BrowserName.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ajinkya\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();
	}  
	driver.get("https://www.5paisa.com/");	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
	
}
@BeforeClass
public void AllObjects() {
	
mainlog = new MainLogin(driver);
log = new FiveLogin(driver);
MFP = new MutualFundsPage(driver);

}



@BeforeMethod
public void LoginIntoApp () throws InterruptedException, EncryptedDocumentException, IOException	{
System.out.println("Before Method");
	
mainlog.loginmain();
Set<String> ids = driver.getWindowHandles();
ArrayList<String> a = new ArrayList<String> (ids);
driver.switchTo().window(a.get(1));
Thread.sleep(3000);
log.OldLogin();

log.UN();
log.PWD();
Thread.sleep(2000);

log.DOB();
log.Button();

}

@Test
public void Test1() throws InterruptedException, IOException  {

System.out.println("Test1");
MFP.Db();
Thread.sleep(3000);
String URL = driver.getCurrentUrl();
Utility.CaptureSS(driver, "001");
Assert.assertEquals(URL, "https://tradestation.5paisa.com/dashboard");

}
	
@AfterMethod	


public void logout() throws InterruptedException {
	System.out.println("After Method");
	Thread.sleep(5000);
	MFP.UN();
	MFP.LG();
}

@AfterClass

public void ClearObjects() {
	mainlog = null;
	log = null;
	MFP = null;
	
}

@AfterTest

public void CloseBowser() {
	System.out.println("After Class");
	driver.quit();
	System.gc();
	c.addArguments("--disable-notifications");
}
}
