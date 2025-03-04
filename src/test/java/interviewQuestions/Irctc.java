package interviewQuestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Irctc {

	@Test
	public void irctcapp() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Page not yet opened");
		driver.get("https://letcode.in/");
		System.out.println("Page opened");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		ArrayList <String> textfromdropdown = new ArrayList<String>(5);
		List <WebElement> ALLclasses = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/descendant::li"));
		for (int i=0;i<ALLclasses.size();i++) {
			String text = ALLclasses.get(i).getDomAttribute("aria-label");
			System.out.println(text);
			textfromdropdown.add(text);
		}
		for (int j=0;j<textfromdropdown.size()-1;j++) {
			if (textfromdropdown.get(j).compareTo(textfromdropdown.get(j)+1)>0) {
				System.out.println("the given list is not in acending order");
			}else {
				System.out.println("the given list is in acending order");
			}
				
		}
		driver.quit();

	}
	

}
