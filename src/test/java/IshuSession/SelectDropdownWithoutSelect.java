package IshuSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectDropdownWithoutSelect {
	
WebDriver driver;
	
	@BeforeClass
	public void driverSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
	}
	
	@Test(priority=1)
	public void Selectwithoutselectclass() {
		TitleValidation("Dropdown | Semantic UI");
		sleep(5000);
		WebElement DropdownClick =driver.findElement(By.xpath("//div[@tabindex='0' and @class='ui selection dropdown'][1]"));
		Click(DropdownClick);
		sleep(2000);
		WebElement Gender = driver.findElement(By.xpath("//div[@class='menu transition visible']/child::div[text()='Male']"));
		Click(Gender);
		sleep(2000);
		WebElement DropdownClick2 =driver.findElement(By.xpath("//div[ @class='ui dropdown selection'][1]"));
		Click(DropdownClick2);
		sleep(2000);
		WebElement Gender2 = driver.findElement(By.xpath("//div[@class='menu transition visible']/child::div[text()='Female']"));
		Click(Gender2);
		
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
