package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class windowsDemo extends BaseClass {
	public static void main(String[] args) throws Exception{
		driver.get("https://accounts.google.com");
     driver.findElement(By.id("identifierId")).sendKeys("navi.aningi1");
       driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
       
		
		
		
//       if (driver.getWindowHandle().equals("CDwindow-A0D31B79EBFF23454DAFFAAF6BF60C8A") ){
//        WebElement  hgs = driver.findElement(By.xpath("//input[@type='password']"));
//        hgs.sendKeys("naveenjanu143");
//        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
//	}

}
}
