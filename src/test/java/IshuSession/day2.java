package IshuSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day2 {

 
		
		WebDriver driver;

		@BeforeClass
		public void driverSetup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://letcode.in/edit");
		}
		@Test(priority=1)
		public void list() throws InterruptedException{
		 
		 
		String pagetitle = driver.getTitle();
		if (pagetitle.equals("Interact with Input fields")) {
			System.out.println("Sucessfully naviagted to page");
		}else {
			System.out.println("error occoured");
		}
		WebElement txtName = driver.findElement(By.id("fullName"));
		txtName.sendKeys("suresh");
		Thread.sleep(2000);
		List<WebElement>txtBoxes = driver.findElements(By.tagName("input"));
		System.out.println("No of textboxes present in the page: "+txtBoxes.size());
		List<WebElement>txtBoxes2 = driver.findElements(By.xpath("//input"));
		System.out.println("No of textboxes present in the page: "+txtBoxes2.size());
		 
	
	}
		@AfterClass
		public void driverClose() {
			driver.quit();
		}


}
