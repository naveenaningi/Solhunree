package seleniumpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SelWinHandle extends BaseClass{
	public static void main(String[] args) {
		driver.get("http://www.naukri.com");
		Set<String> set = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(set);
		
		for (int i = 0; i < al.size(); i++) {
			String s = al.get(i);
			if (i==1) {		
				driver.switchTo().window(s);
				driver.close();
			}
		}
		
		}
	}

