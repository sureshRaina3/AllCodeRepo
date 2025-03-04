package Basics;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Irctc {

	@Test
	public void irctcapp() throws InterruptedException {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		System.out.println(width+","+height);
	
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Page p = B.newPage();
		
		p.navigate("https://www.irctc.co.in/");
		System.out.println(p.title());
		Thread.sleep(10000);
		//b.close();
		ArrayList <String> textfromdropdown = new ArrayList<String>(5);
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		Locator ALLclasses = p.locator("//ul[@role='listbox']/descendant::li");
		for (int i=0;i<ALLclasses.count(); i++) {
			String text = ALLclasses.nth(i).getAttribute("aria-label");
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
		p.close();
		B.close();
		play.close();

	}
	

}
