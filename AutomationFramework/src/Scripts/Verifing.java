package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pompages.HomePage;
import Pompages.LoginPage;
@Test
public class Verifing  extends BaseTest{
	public void testHomePage() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		String username=Lib.getCellvalue("ValidLogin",1,0);
		login.setUserName(username);
	    String password = Lib.getCellvalue("ValidLogin",1,1);
	    login.setPassword(password);
		login.clickSubmit();
		Thread.sleep(6000);
  
      hp.button();
      Thread.sleep(6000);
      hp.acti();
     Thread.sleep(6000);
     hp.ver();
     Thread.sleep(6000);
   String cellvalue = Lib.getCellvalue("ExceptedResult", 1,0);
    System.out.println(cellvalue);
//  if(.equals(cellvalue)){
//   	System.out.println("yes");
//    }else
//   	System.out.println("no");

	}
}
