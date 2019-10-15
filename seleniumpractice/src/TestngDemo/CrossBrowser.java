package TestngDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowser {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "./drivers.IEDriverServer.exe");
	}
	@Test
	@Parameters({"browser"})
	
	public void runmultiplebrowser(String browser) throws InterruptedException {
	
		if (browser.equals("firefox")) {
		driver= new FirefoxDriver();
		}else if (browser.equals("chrome")) {
			driver= new ChromeDriver();
		}else {
				driver= new InternetExplorerDriver();
		}
	driver.get("https://demo.actitime.com/login.do");
    WebElement findElement = driver.findElement(By.name("username"));
    Thread.sleep(3000);
    for (int i = 1; i <=5 ; i++) {
   findElement.sendKeys("naveen"+i);
   findElement.clear();
}
    driver.close();

	}
}
