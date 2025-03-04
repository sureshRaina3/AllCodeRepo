package IshuSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alerts {
	
	  WebDriver driver;
		
		
	@BeforeClass
	public void driverSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in");
	}
	
	@Test(priority=1)
	public void script() throws InterruptedException {

		String pageTitleone = driver.getTitle();
		TitleValidation(pageTitleone, "LetCode with Koushik");

		WebElement btnLogin = driver.findElement(By.xpath("//a[text()='Log in']"));
		Click(btnLogin);

		WebElement txtEmail = driver.findElement(By.xpath("//input[@name='email' and @type='text']"));
		fillData(txtEmail,"itssuresh2001@gmail.com");

		WebElement txtPassword = driver
				.findElement(By.xpath("//input[@name='password'and @placeholder='Enter password']"));
		fillData(txtPassword,"sureshraina03");

		WebElement btnSignin = driver.findElement(RelativeLocator.with(By.tagName("button")).below(txtPassword));
		Click(btnSignin);

		Thread.sleep(3000);

		WebElement wrkspaceButton = driver
				.findElement(By.xpath("//div[@id='navbar-menu']/descendant::a[@id='testing']"));
		Click(wrkspaceButton);

		String PageTitletwo = driver.getTitle();
		TitleValidation(PageTitletwo, "LetCode - Testing Hub");
		
		WebElement AlertBtn= driver.findElement(By.xpath("//a[@href='/alert']"));
		Click(AlertBtn);
		
		String PageTitleThree = driver.getTitle();
		TitleValidation(PageTitleThree, "LetCode - Testing Hub");
		
		WebElement simpleAlertBtn = driver.findElement(By.id("accept"));
		Click(simpleAlertBtn);
		
		String alertTxt = driver.switchTo().alert().getText();
		System.out.println("Text precent is the simple alert: "+alertTxt);
		driver.switchTo().alert().accept();
		
		WebElement confirmAlertBtn = driver.findElement(By.id("confirm"));
		Click(confirmAlertBtn);
		
		String confirmalertTxt = driver.switchTo().alert().getText();
		System.out.println("Text precent is the confirm alert: "+confirmalertTxt);
		driver.switchTo().alert().dismiss();
		
		WebElement promtAlertBtn = driver.findElement(By.id("prompt"));
		Click(promtAlertBtn);
		
		String  promtalertTxt = driver.switchTo().alert().getText();
		System.out.println("Text precent is the confirm alert: "+promtalertTxt);
		String name = "suresh";
		driver.switchTo().alert().sendKeys(name);
		driver.switchTo().alert().accept();
		
		String alterTextentered= driver.findElement(By.id("myName")).getText();
		if (alterTextentered.equals("Your name is: "+name)){
			System.out.println("Successully text entered");
	
		}else {
			System.out.println("Text not entered in the alert text box");
		}
		
		WebElement modernAlert = driver.findElement(By.id("modern"));
		Click(modernAlert);
		WebElement modernAlertClose = driver.findElement(By.xpath("//button[@aria-label='close']"));
		Thread.sleep(2000);
		Click(modernAlertClose);
	}
	@AfterClass
	public void driverClose() {
		driver.quit();
	}

	public void TitleValidation(String fromPage, String text) {
		if (fromPage.equals(text)) {
			System.out.println("Sucessfully naviagted to page " + fromPage);
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
	

}
