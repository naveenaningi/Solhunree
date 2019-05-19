
package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Upload  extends BaseClass{
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		WebElement upload = driver.findElement(By.id("input_resumeParser"));
				upload.sendKeys("C:\\Users\\pavan\\Documents\\naveen aningi\\Naveen Aningi.doc");
	}

}
