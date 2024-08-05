package IshuSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;
	
	@BeforeClass
	public void driverSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	}
	
	//@Parameters(value = "suresh")
	@Test(priority=1)
	public void FrmaesHandling() {
		//TitleValidation("Dropdown | Semantic UI");
		WebElement frame1= driver.findElement(By.id("frm1"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMinutes(5));
		w.until(ExpectedConditions.visibilityOf(frame1));
		
		driver.switchTo().frame(frame1);
		WebElement  Selectinsideframe= driver.findElement(By.id("selectnav1"));
		Select s = new Select(Selectinsideframe);
		s.selectByVisibleText("Tech News");
		driver.switchTo().parentFrame();
		WebElement nameinprwindow = driver.findElement(By.id("name"));
		sleep(2000);
		nameinprwindow.sendKeys("suresh");
		sleep(2000);
		
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
