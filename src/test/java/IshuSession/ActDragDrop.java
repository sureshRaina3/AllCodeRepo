package IshuSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActDragDrop {

public WebDriver driver;
Actions a;
	
	@BeforeClass
	public void driverSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	}
	
	@Test(priority=1)
	public void Selectwithoutselectclass() {
		TitleValidation("Droppable | jQuery UI");
		WebElement DragDropframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(DragDropframe);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement dropable = driver.findElement(By.id("droppable"));
		a = new Actions(driver);
		sleep(2000);
		a.dragAndDrop(draggable, dropable).perform();
		sleep(2000);
		String Droppedtext = driver.findElement(By.xpath("//div[@id='droppable']/child::p")).getText();
		String expectedText="Dropped!";
		if (Droppedtext.equals(expectedText)) {
			System.out.println("Sucessfully dragged and deropped " + Droppedtext);
		} else {
			System.out.println("error occoured while dropping the draggble " + expectedText);
			driver.quit();
		}
		
		driver.switchTo().defaultContent();
		a.scrollToElement(driver.findElement(By.className("icon-pencil"))).perform();
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
