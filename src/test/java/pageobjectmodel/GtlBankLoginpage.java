package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GtlBankLoginpage {
@FindBy(xpath="//input[@name='uid']")WebElement userId;
@FindBy(xpath="//input[@name='password']")WebElement password;
@FindBy(xpath="//input[@name='btnLogin']")WebElement Login;
@FindBy(xpath="//a[contains(text(),'Manager')]")WebElement actual;

public GtlBankLoginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void login() {
	userId.sendKeys("mngr257442");
	password.sendKeys("uvYgyra");
	
	Login.click();
	
}
public String checking() {
	return actual.getText();
}

}
