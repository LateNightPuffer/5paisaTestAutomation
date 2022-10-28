package Fivepaisa;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class FiveLogin {
	//Step 1: Declare the global variable
	
	
	@FindBy(xpath=("//a[text()='Click here']"))
	private WebElement Clickhere;
	
	@FindBy(xpath=("//input[@id='loginUser']"))
	private WebElement username;

	@FindBy(xpath=("//input[@id='loginPwd']"))
	private WebElement password;

	@FindBy(xpath=("//input[@id='loginDob']"))
	private WebElement dob;
	
	@FindBy(xpath=("//input[@id='LoginSubmit']"))
	private WebElement loginbutton;

//Step 2: Initialize the variables
	
	public FiveLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

//Step 3: Create Method
	
public void OldLogin ()	{
	Clickhere.click();
}

public void UN() throws EncryptedDocumentException, IOException {
	String UN = Utility.FetchDataFromExcel("Sheet1", 1, 0);
	username.sendKeys(UN);
}

public void PWD() throws EncryptedDocumentException, IOException {
	String PWD = Utility.FetchDataFromExcel("Sheet1", 1, 1);
	password.sendKeys(PWD);
}

public void DOB() throws EncryptedDocumentException, IOException {
	String DOB = Utility.FetchDataFromExcel("Sheet1", 1, 2);
	dob.sendKeys(DOB);
}

public void Button() {
	loginbutton.click();
}


}
 