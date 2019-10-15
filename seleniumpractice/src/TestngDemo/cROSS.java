package TestngDemo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.rmi.server.RemoteServer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cROSS {
	
	@Parameters({"node","browser"})
	@Test
	public void runMethod(String node,String browser) throws MalformedURLException
	{
		URL ur = new URL(node);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		RemoteWebDriver driver = new RemoteWebDriver(ur,dc);
		driver.get("http://www.google.com");
		
		
	}
}

