package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//declaration
public class LoginPage {
	@FindBy(id="username")
	WebElement untb;

	@FindBy(name="pwd")
	WebElement pwtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	WebElement loginbtn;
	
	//intilization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utiliazation
	public void setUserName(String un) {
		untb.sendKeys(un);
	}
	public void setPassword(String pwd) {
		pwtb.sendKeys(pwd);
	}
	public void clickSubmit() {
		loginbtn.click();
	}
	}

