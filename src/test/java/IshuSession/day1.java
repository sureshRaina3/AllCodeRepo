package IshuSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day1 {
	WebDriver driver;

	@BeforeClass
	public void driverSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
	}
	
	@Test(priority=1)
	public void test1( ) {

		String pagetitle = driver.getTitle();
		if (pagetitle.equals("Interact with Input fields")) {
			System.out.println("Sucessfully naviagted to page");
		}else {
			System.out.println("error occoured");
		}
		
		
	}
	@AfterClass
	public void driverClose() {
		driver.quit();
	}


}
