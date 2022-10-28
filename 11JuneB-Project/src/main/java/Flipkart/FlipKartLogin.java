package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartLogin {
	
@FindBy (xpath=("(//input[@type='text'])[2]"))
private WebElement PhoneNumber;

@FindBy (xpath=("//input[@type='password']"))
private WebElement Password;

@FindBy (xpath=("(//span[text()='Login'])[2]"))
private WebElement LoginButton;


public FlipKartLogin (WebDriver driver)	{
	PageFactory.initElements(driver, this);
}

public void Phone () {
	PhoneNumber.sendKeys("7028474659");
}
public void Pass () {
	Password.sendKeys("Iwonttell67");
}

public void Login () {
	LoginButton.click();
	
}
}
