package IshuSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectDropDown {
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
		TitleValidation("LetCode with Koushik");
		//TitleValidation(pageTitleone, "LetCode with Koushik");

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

		//String PageTitletwo = driver.getTitle();
		TitleValidation("LetCode - Testing Hub");
		
		WebElement slelectButton = driver
				.findElement(By.xpath("//a[@href='/dropdowns']"));
		Click(slelectButton);
		
		WebElement DropdowmFruits = driver.findElement(By.id("fruits"));
		Select s = new Select(DropdowmFruits);
		
	
		s.selectByVisibleText("Apple");
		
		WebElement Dropdowmsuperheros = driver.findElement(By.id("superheros"));
		Select s2 = new Select(Dropdowmsuperheros);
		if (s2.isMultiple()==true) {
			
			s2.selectByValue("am");
			s2.selectByValue("ca");
			s2.selectByIndex(8);
			System.out.println("dropdown is multiple option");
			
		}else {
			System.out.println(" dropdown is not multiple option");
		}
		WebElement Dropdowmlang = driver.findElement(By.id("lang"));
		Select s3 = new Select(Dropdowmlang);
		List <WebElement> alloptions= s3.getOptions();
		for (WebElement options :alloptions ) {
			String optioname = options.getText();
			System.out.println(optioname);
		}
		s3.selectByIndex(alloptions.size()-1);
		
		WebElement Dropdowmcountry = driver.findElement(By.id("country"));
		Select s4 = new Select(Dropdowmcountry);
		s4.selectByVisibleText("India");
		List <WebElement> allCountryoptions= s4.getAllSelectedOptions();
		for (WebElement eachcountry :allCountryoptions ) {
			String Countryname = eachcountry.getText();
			System.out.println(Countryname);
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
	
	public String value(WebElement elementName) {
		String frompage =elementName.getText();
		return frompage;	
	}
	

}



