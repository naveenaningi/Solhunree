package TestngDemo;

import org.testng.annotations.Test;
@org.testng.annotations.Listeners
public class testng2 {
	@Test(priority=1 ,groups="smoke")
	public void  createuser() {
		System.out.println("created");
		
		}
	@Test(priority=2,invocationCount=2)
	public void edituser() {
		System.out.println("edituser");
	}
	@Test
	public void deleteuser () {
		System.out.println("deleted");
}
}