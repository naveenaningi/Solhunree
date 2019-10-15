package TestngDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossPlatform {
	@Test
	@Parameters({"node","browser"})
	public void runMultipleOs(String node,String broswer) throws MalformedURLException, InterruptedException {
		URL wc = new URL(node);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(broswer);
		WebDriver driver = new RemoteWebDriver(wc,dc);
		driver.get("https://demo.actitime.com/login.do");
		WebElement usntf= driver.findElement(By.id("username"));
	    for(int i =1;i<=1;i++) {
		usntf.sendKeys("admin");
		Thread.sleep(3000);
		usntf.clear();
	}
	driver.close();
	
}
}
