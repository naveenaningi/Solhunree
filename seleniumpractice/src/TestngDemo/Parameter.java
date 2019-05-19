package TestngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters({"city","area"})
	@Test
	public void databank(String city,String area) {
		System.out.println(city+":"+area);
	}

}
