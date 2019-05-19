package TestngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNg4 {
	@Test(groups={"smoke"})
	public void tc_1() {
		System.out.println("smoke first case ");
		Assert.fail();
	}
	@Test(groups={"smoke"},dependsOnMethods="tc_1")
	public void tc_2() {
		System.out.println("smoke second case ");

}
	@Test(groups={"smoke"},dependsOnMethods="tc_1")
	public void tc_3() {
		System.out.println("smoke third case ");
		
	
}
}