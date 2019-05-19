package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td/div/div[3]/div/div[1]/div")
WebElement button;
	
	
@FindBy(xpath="//a[text()='About your actiTIME']")
WebElement link;


@FindBy(xpath="//span[text()='actiTIME 2019.2 Pro']")
WebElement verson;

@FindBy(xpath="//span[text()='actiTIME 2019.2 Pro']")
WebElement info;
public HomePage(WebDriver driver) {

	PageFactory.initElements(driver,this);
}
public void button() {
	button.click();
}
public void acti() {
	link.click();
}
public String ver() {
	return verson.getText();
}

}
