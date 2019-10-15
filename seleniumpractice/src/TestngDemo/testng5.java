package TestngDemo;

import org.testng.annotations.Test;

public class testng5 extends testNg4{
	@Test(groups={"regression"})
	public void tc_4() {
		System.out.println("regression first case ");
		
	}
	@Test(groups={"regression"})
	public void tc_5() {
		System.out.println("regression second case ");

}
	@Test(groups={"smoke"},dependsOnMethods="tc_1")
	public void tc_6() {
		System.out.println("smoke fourth  case ");
		
}
}