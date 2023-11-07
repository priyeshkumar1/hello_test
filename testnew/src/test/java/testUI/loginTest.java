package testUI;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest {
	
	@BeforeTest
	public void logintoapplication() {
		System.out.println("login to application");
	}
	
	@AfterTest
	public void logoutfromapplication() {	
		System.out.println("logout from application");
}
	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB connected");
	}
	
	@AfterMethod
	public void DisconnectDB() {
		System.out.println("Db Disconnected");
	}
	
	
	@Test(priority=1,description="This is a login test")
	 public void aTest1()

	 {
		System.out.println("test1");

	}

	@Test(priority=2,description="This is a logout test")
	public void aTest2()
	
	{
		System.out.println("test2");
	}
		
		
	
}
