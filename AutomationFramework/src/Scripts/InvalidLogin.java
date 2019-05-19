package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pompages.LoginPage;

public class InvalidLogin extends BaseTest {
	@Test
	public void testValidLogin() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		for (int i = 0; i <Lib.getTotalRowCount("InavlidLogin"); i++) {
	String username=Lib.getCellvalue("InvalidLogin",i,0);
	login.setUserName(username);
	Thread.sleep(3000);
	String password = Lib.getCellvalue("InValidLogin",i,1);
	login.setPassword(password);
	Thread.sleep(1000);
	login.clickSubmit();
	Thread.sleep(3000);

}
}
}