package Fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MutualFundsPage {
	
	@FindBy (xpath="//a[text()='Dashboard']")
	private WebElement Dashboard;
	
	@FindBy (xpath="(//span[text()='AJINKYA'])[2]")
	private WebElement Usernamebox;
	
	@FindBy (xpath="//a[text()='Logout']")
	private WebElement LogoutBox;

	
	public MutualFundsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Db() {
		Dashboard.click();
	}
	public void UN() {
		Usernamebox.click();
	}
	public void LG() {
		LogoutBox.click();
	}
}
