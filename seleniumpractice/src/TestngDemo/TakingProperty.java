package TestngDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TakingProperty {
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("./config.Property");
		Properties pop = new Properties();
		pop.load(fs);
		String 	ur= pop.getProperty("URL");
		String un = pop.getProperty("USERNAME");
	   String pwd = pop.getProperty("PASSWORD");
		System.out.println(ur+"///"+un+"//////"+pwd);
	}
}
