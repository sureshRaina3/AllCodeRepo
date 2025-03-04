package SeleniumTrainingReloaded;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practicing {
	
	public WebDriver driver;
	Reusablemethods re;
   
	@BeforeClass
	public void  invokebrowser() {
		
		re = new Reusablemethods();
		driver = new ChromeDriver();
		
		 	
	}
	@Test
	public void launchURL () {
		
		driver.get(re.ValueFromPropFile("Link"));
		driver.quit();
	}
}
