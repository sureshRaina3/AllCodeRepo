package IshuSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class scroll {
	
	public WebDriver driver;
	Actions a;
		
		@BeforeClass
		public void driverSetup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
		}
		
		@Test(priority=1)
		public void Selectwithoutselectclass()  {
			TitleValidation("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
			sleep(3000);
			a= new Actions(driver);
			a.scrollToElement(driver.findElement(By.xpath("//a[@class='HlWMPX' and text()='Contact Us']"))).perform();
			sleep(3000);
		}
			
		@AfterClass
		public void driverClose() {
			driver.quit();
		}

		public void TitleValidation(String text) {
			String frompage= driver.getTitle();
			if (frompage.equals(text)) {
				System.out.println("Sucessfully naviagted to page " + frompage);
			} else {
				System.out.println("error occoured while opening the webpage " + text);
				driver.quit();
			}
		}
		public void fillData(WebElement elementName, String value) {
			elementName.sendKeys(value);	
		}
		public void Click(WebElement elementName) {
			elementName.click();	
		}
		public void sleep(int i) {
			
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
