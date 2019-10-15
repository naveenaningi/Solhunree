		package seleniumpractice;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.support.ui.Select;
		
		public class SelectDemo extends BaseClass {
			public static void main(String[] args) {
			driver.get("https://en-gb.facebook.com/");
			driver.findElement(By.name("firstname")).sendKeys("naveen");
		    driver.findElement(By.name("lastname")).sendKeys("aningi");
			driver.findElement(By.name("reg_email__")).sendKeys("7032826961");
			driver.findElement(By.name("reg_passwd__")).sendKeys("naveen61");
		
			Select s = new Select(driver.findElement(By.name("birthday_day")));
			s.selectByVisibleText("12");
		
		    Select s1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		    s1.selectByVisibleText("Aug");
		 
		    Select s3 = new Select(driver.findElement(By.name("birthday_year")));
		    s3.selectByVisibleText("1997");
		
		    driver.findElement(By.xpath("//input[@value='2']")).click();
		    driver.findElement(By.name("websubmit")).click();
				
			}
			}
		
		
