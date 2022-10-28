package Fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainLogin {
	
	@FindBy(xpath=("//a[text()='Login']"))
	private WebElement LoginButtonMain;


public MainLogin(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void loginmain() {
	LoginButtonMain.click();
	}



}