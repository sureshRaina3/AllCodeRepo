package IshuSession;

import java.time.Duration;
import java.util.List;
import java.util.Set;

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

public class WindowHandles {
	
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
			WebElement searchbox = driver.findElement(By.name("q"));
			searchbox.sendKeys("I phone 14", Keys.ENTER);
			String CrntWindow = driver.getWindowHandle();
			sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			List <WebElement> iphone = driver.findElements(By.className("tUxRFH"));
			wait.until(ExpectedConditions.visibilityOfAllElements(iphone));
			for (WebElement eachIphone : iphone) {
				a= new Actions(driver);
				a.scrollToElement(eachIphone);
				sleep(1000);
				eachIphone.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Set<String> windows=driver.getWindowHandles();
				for (String newwindow: windows) {
					if (!(newwindow.equals(CrntWindow))) {
						driver.switchTo().window(newwindow);
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
						String Mobilename=driver.findElement(By.className("VU-ZEz")).getText();
						//String Mobilecost= driver.findElement(By.xpath("//div[@class='CEmiEU']/child::div[1]/child::div[1]")).getText();
						//String rupess = Mobilecost.replace("?", "u20B9");
						System.out.println(Mobilename);
						driver.close();
						driver.switchTo().window(CrntWindow);
					}
				}
			}
			
		 
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
