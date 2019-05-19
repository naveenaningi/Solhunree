package seleniumpractice;

import java.util.Set;

public class Window extends BaseClass{
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles.size());
	for (String eh : windowHandles) {
		driver.switchTo().window(eh);
		String title = driver.getTitle();
		System.out.println(eh+"::::"+title);
		
//for (String eh : windowHandles) {
//	driver.switchTo().window(eh);
//	if(!driver.getWindowHandle().equals(windowHandle)) {
	
//		driver.close();
	
//for(String gs:windowHandles)
//{
//	driver.switchTo().window(gs);
//	if(driver.getTitle().equals("Amazon"))
//	{
//		driver.close();
	}
}

}

		
	


