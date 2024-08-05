package IshuSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Actionandwait {
	public WebDriver driver;
	Actions a;
		
		@BeforeClass
		public void driverSetup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/2021/07/perform-mouse-actions-in-selenium.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=1)
		public void Selectwithoutselectclass() {
			
		    a = new Actions(driver);
			WebElement Mouseover = driver.findElement(By.xpath("//ul[@id='nav1']/child::li[4]"));
			a.moveToElement(Mouseover).perform();
			WebElement Waitspage= driver.findElement(By.xpath("//a [text()='Waits Practice']"));
			a.click(Waitspage).perform();
			
			
			String CurrenntURL = driver.getCurrentUrl();
			String expectedCurrenntURL="https://www.hyrtutorials.com/p/waits-demo.html";
			
			if (CurrenntURL.equals(expectedCurrenntURL)) {
				System.out.println("Sucessfully clicked waits " + expectedCurrenntURL);
			} else {
				System.out.println("error occoured while clicking waits " + expectedCurrenntURL);
				driver.quit();
			}
			WebElement Btn1= driver.findElement(By.id("btn1"));
			WebElement Btn2= driver.findElement(By.id("btn2"));
			
		   
			Click(Btn1);
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
			WebElement txtbox1=driver.findElement(By.id("txt1"));
			
			w.until(ExpectedConditions.visibilityOf(txtbox1));
			fillData(txtbox1,"Suresh");
			Click(Btn2);
			WebElement txtbox2=driver.findElement(By.id("txt2"));
			w.until(ExpectedConditions.visibilityOf(txtbox2));
			fillData(txtbox2,"Kumar");
			
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
