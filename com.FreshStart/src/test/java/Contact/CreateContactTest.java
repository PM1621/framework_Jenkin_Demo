package Contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test
	public static void createContact()
	{ 
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		
		//hello
		//hi
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		System.out.println("execute createcontactTest");
	}

	@Test
	public static void createContactWithOrgTest()
	{
		System.out.println("create contact with org");
	}

}
