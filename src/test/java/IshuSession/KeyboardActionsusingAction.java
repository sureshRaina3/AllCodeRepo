package IshuSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeyboardActionsusingAction {
	
	public WebDriver driver;
	Actions a;
		
		@BeforeClass
		public void driverSetup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/text-box");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=1)
		public void Selectwithoutselectclass() {
			TitleValidation("DEMOQA");
			WebElement username = driver.findElement(By.id("userName"));
			WebElement Email = driver.findElement(By.id("userEmail"));
			WebElement CurrentAddress = driver.findElement(By.id("currentAddress"));
			//WebElement PermanentAddress = driver.findElement(By.id("permanentAddress"));
			fillData(username, "Sureshkumar");
			fillData(Email, "Sureshkumar@hotmail.com");
			fillData(CurrentAddress, "No,8/163, AmbedkarNagar,7th cross street, Thiruvottiyur , Chennai-19");
			a = new Actions(driver);
			a.keyDown(Keys.CONTROL);
			a.sendKeys("A");
			a.keyUp(Keys.CONTROL).perform();
			a.keyDown(Keys.CONTROL);
			a.sendKeys("C");
			a.keyUp(Keys.CONTROL).perform();
			a.keyDown(Keys.TAB);
			a.keyUp(Keys.TAB).perform();
			a.keyDown(Keys.CONTROL);
			a.sendKeys("V");
			a.keyUp(Keys.CONTROL).perform();
			sleep(5000);
			
		  
		   
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
