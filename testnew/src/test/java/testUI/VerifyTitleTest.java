package testUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleTest {

	
		@Test
		public void titleTest()
		{
			
			SoftAssert sofassert = new SoftAssert();
			String expectedtitle =  "Electronics, Cars, Fashion, Collectibles & More | eBay";
			String expectedtext =  "Search";
			System.setProperty("webdriver.chrome.driver", "/home/priyesh/Desktop/Eclipse/chromedriver-linux64/chromedriver");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.ebay.com/");
			String actualtitle = driver.getTitle();
			System.out.println("Verifying title");
			sofassert.assertEquals(actualtitle, expectedtext, "Title verification Failed");
			System.out.println("Verifying text");
			String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("Value");
			sofassert.assertEquals(actualtext, expectedtext, "Text verification Failed");
			System.out.println("closing browser");
//			sofassert.assertAll();			
			
			
			
			
			
		}
		
		
		
}


