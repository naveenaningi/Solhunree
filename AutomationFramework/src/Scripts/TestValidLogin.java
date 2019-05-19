package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pompages.LoginPage;

public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin() throws InterruptedException {
	LoginPage login = new LoginPage(driver);
	String username=Lib.getCellvalue("validLogin",1,0);
	login.setUserName(username);
	String password = Lib.getCellvalue("ValidLogin",1,1);
	login.setPassword(password);
	login.clickSubmit();
	Thread.sleep(6000);
}
}