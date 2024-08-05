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

public class day3 {
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

		Thread.sleep(5000);

		WebElement wrkspaceButton = driver
				.findElement(By.xpath("//div[@id='navbar-menu']/descendant::a[@id='testing']"));
		Click(wrkspaceButton);

		String PageTitletwo = driver.getTitle();
		TitleValidation(PageTitletwo, "LetCode - Testing Hub");

		WebElement btnEdit = driver.findElement(By.xpath("//footer[@class='card-footer']/child::a[text()='Edit']"));
		Click(btnEdit);

		String pageTitlethree = driver.getTitle();
		TitleValidation(pageTitlethree, "Interact with Input fields");

		WebElement txtName = driver.findElement(By.id("fullName"));
		fillData(txtName,"suresh");
		Thread.sleep(2000);
		
		List<WebElement> txtBoxes = driver.findElements(By.tagName("input"));
		System.out.println("No of textboxes present in the page: " + txtBoxes.size());

		List<WebElement> txtBoxes2 = driver.findElements(By.xpath("//input"));
		System.out.println("No of textboxes present in the page: " + txtBoxes2.size());
		
		
		//driver.quit();

		/*
		 * WebElement txtnewName = driver.findElement(By.
		 * xpath("//input[@id='name' or @placeholder='Enter your name']"));
		 * txtnewName.sendKeys("suresh");
		 * 
		 * 
		 * WebElement txtnewEmail =
		 * driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
		 * txtnewEmail.sendKeys("suresh@gmail.com");
		 * 
		 * WebElement txtnewPassword = driver.findElement(By.xpath(
		 * "/html/body/app-root/app-signup/div/div/div/div/form/div[3]/div/input"));
		 * txtnewPassword.sendKeys("Raina@03");
		 * 
		 * WebElement btnAgree=driver.findElement(By.id("agree")); btnAgree.click();
		 */

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
