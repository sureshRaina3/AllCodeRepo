
package IshuSession;

import java.time.Duration;
import java.util.Iterator;
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

public class Webtables {
 
	public WebDriver driver;
	Actions a;
		
		@BeforeClass
		public void driverSetup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://letcode.in/table");
			
		}
		
		@Test(priority=1)
		public void Selectwithoutselectclass()  {
			WebElement tblName = driver.findElement(By.xpath("//label[@for= 'sort']/following-sibling::table"));	
			List <WebElement>Headers = tblName.findElements(By.tagName("th"));
			for(WebElement Header: Headers ) {
				String row = Header.getText();
				//System.out.println(row);
			}
			List <WebElement> rows =  tblName.findElements(By.xpath("thead/following-sibling::tr"));
			int rowsno = rows.size();
			/*for(WebElement row : rows) {
				 
				List<WebElement> column = row.findElements(By.tagName("td"));
				WebElement table = column.get(0);
				System.out.println(tbl.getText());
				
			}*/
			for(int i =0; i<rowsno; i++) {
				List<WebElement> coloumn = rows.get(i).findElements(By.tagName("td")); 
				WebElement xpath = coloumn.get(0);
				String text = xpath.getText();
				
				System.out.println(text);
				if (text.equals("Frozen yogurt")) {
					
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

	
	

