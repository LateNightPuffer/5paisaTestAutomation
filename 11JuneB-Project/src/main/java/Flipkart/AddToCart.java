package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	
@FindBy (xpath=("//input[@type='text']"))
private WebElement Searchbox;

@FindBy (xpath=("//button[@type='submit']"))
private WebElement SearchButton;

@FindBy (xpath=("//div[text()='Gender']"))
private WebElement GenderClick;

@FindBy (xpath=("(//div[@class='_24_Dny'])[1]"))
private WebElement Men;

@FindBy (xpath=("(//select[@class='_2YxCDZ'])[1]"))
private WebElement SelectMin;

@FindBy (xpath=("//div[text()='₹544']"))
private WebElement Phoenix;

@FindBy (xpath=("//button[@class='_2KpZ6l _1t_O3S _2ti6Tf _3f2XG4 _3AWRsL']"))
private WebElement AddItem;

@FindBy (xpath=("(//div[text()='8'])[1]"))
private WebElement Shoesize;

@FindBy (xpath=("(//img[@class='_2wvtbs'])[2]"))
private WebElement DeselectExtraItem;

@FindBy (xpath="(//img[@class='_2wvtbs'])[3]")
private WebElement DeselectExtraItem1;

@FindBy (xpath=("//button[text()='Select these sizes']"))
private WebElement SelectSizeButton;

@FindBy (xpath=("//span[text()='Place Order']"))
private WebElement PlaceOrderButton;


public AddToCart (WebDriver driver){
	PageFactory.initElements(driver, this);
	}

public void Search () {
	Searchbox.sendKeys("shoes");
}

public void Sbutton () {
	SearchButton.click();	
}

public void Gender () {
	GenderClick.click();
}
public void Menclick() {
	Men.click();
	//Men.isSelected();
	
}

public void Addproduct() {
	AddItem.click();
}

public void MinimumValue() {
	SelectMin.click();
	Select s = new Select(SelectMin);
	s.selectByVisibleText("₹500");
}
public void shoes() {
	Phoenix.click();
}

public void shoesize8() {
	Shoesize.click();
}

public void Delect() {
	DeselectExtraItem.click();;
}

public void Delect2() {
	DeselectExtraItem1.click();;
}

public void SelectButton() {
	SelectSizeButton.click();
}

public void PlaceOrder() {
	PlaceOrderButton.click();
}
}