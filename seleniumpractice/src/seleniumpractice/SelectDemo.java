		package seleniumpractice;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.ui.Select;
		
		public class SelectDemo extends BaseClass {
			public static void main(String[] args) {
				driver.get("https://en-gb.facebook.com/");
			WebElement usn	= driver.findElement(By.name("firstname"));	
			usn.sendKeys("naveen");
			WebElement lst = driver.findElement(By.name("lastname"));
			lst.sendKeys("aningi");
			 WebElement phn = driver.findElement(By.name("reg_email__"));
			 phn.sendKeys("7032826961");
			WebElement pass =	driver.findElement(By.name("reg_passwd__"));
			pass.sendKeys("naveen61");
			
			WebElement day =	driver.findElement(By.name("birthday_day"));
			Select s = new Select(day);
			s.selectByVisibleText("12");
			
		 WebElement month = 	driver.findElement(By.xpath("//select[@id='month']"));
		 Select s1 = new Select(month);
		 s1.selectByVisibleText("Aug");
		 
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1997");
		WebElement radio = driver.findElement(By.xpath("//input[@value='2']"));
		radio.click();
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
		
				
			}
			}
		
		
