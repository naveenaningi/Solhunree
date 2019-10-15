package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframes  extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
    driver.get("file:///C:/Users/pavan/Documents/naveen%20aningi/page2.html");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t1")).sendKeys("naveen");
	driver.switchTo().defaultContent();              ///[ frame using index]
	driver.findElement(By.id("t2")).sendKeys("aningi");
	
	driver.switchTo().frame("f1");
	driver.findElement(By.id("t1")).sendKeys("naveen");
    driver.switchTo().defaultContent();      ////[frame using id and name attribute values]
    driver.findElement(By.id("t2")).sendKeys("aningi");
	//driver.close();
		
	WebElement ef = driver.findElement(By.className("c1"));
	driver.switchTo().frame(ef);
	driver.findElement(By.id("t1")).sendKeys("naveen");
	driver.switchTo().defaultContent();          ////[frame using webElement]
	driver.findElement(By.id("t2")).sendKeys("aningi");
	Thread.sleep(3000);
	//driver.close();
	}
}
