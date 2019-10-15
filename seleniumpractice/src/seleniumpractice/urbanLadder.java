package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class urbanLadder extends BaseClass {
	private static final WebDriver JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException {
	driver.get("https://www.urbanladder.com/");
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();

	
	//*[@id="topnav_wrapper"]/ul/li[1]/span
	//*[@id="topnav_wrapper"]/ul/li[2]/span
	//*[@id="topnav_wrapper"]/ul/li[10]/span
		String BeforeXpath ="//*[@id=\"topnav_wrapper\"]/ul/li[";
     	String AfterXpath="]/span";
	
	for(int i=1;i<=10;i++) {
		String	ActualXpath = BeforeXpath+i+AfterXpath;
		WebElement ss = driver.findElement(By.xpath(ActualXpath));
		System.out.println(ss.getText());
	}
	Thread.sleep(2000);
	System.out.println("-------------------------------------------");
    WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),'Sale')]"));
    Actions a = new Actions(driver);
    a.moveToElement(findElement).click().perform();
     Thread.sleep(3000);
     List<WebElement> list = driver.findElements(By.xpath("//li[@class='topnav_item saleunit']"));
    for (WebElement web : list) {
	System.out.println(web.getText());
	
}
    
    System.out.println("---------------------------------------------");
    WebElement findElement2 = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
    Actions b = new Actions(driver);
    b.moveToElement(findElement2).click().perform();
    Thread.sleep(3000);
    List<WebElement> list2 = driver.findElements(By.xpath("//li[@class='sublist_item']"));
    for (WebElement webEl : list2) {
    	System.out.println(webEl.getText());
		
	}
    System.out.println("------------------------------------------");
    WebElement element = driver.findElement(By.xpath("//li[@class=\"topnav_item bedroomunit\"]"));
    Actions c = new Actions(driver);
    c.moveToElement(element).click().perform();
    Thread.sleep(3000);
    List<WebElement> list3 = driver.findElements(By.xpath("//li[@class=\"sublist_item\"]"));
    for(WebElement ss:list3) {
    System.out.println(ss.getText());
    }
    
    System.out.println("------------------------------------------------");
    WebElement findElement3 = driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]"));
    Actions d = new Actions(driver);
    d.moveToElement(findElement3).click().perform();
    Thread.sleep(3000);
    List<WebElement> list4 = driver.findElements(By.xpath("//li[@class=\"sublist_item\"]"));
    for (WebElement we : list4) {
    	System.out.println(we.getText());
    }
	
        JavascriptExecutor j  = (JavascriptExecutor) driver;
        for(int i=1;i<10;i++) {
        	j.executeScript("window.scrollBy(0,300)");
        }
	}
	}

