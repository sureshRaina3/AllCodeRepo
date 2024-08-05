package Basics;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright play = Playwright.create();
		BrowserContext B= play.firefox().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Page p = B.newPage();
		p.navigate("http://gmail.com");
		Locator email =p.locator("id=identifierId");
		Thread.sleep(2000);
		email.type("trainer@way2automation.com");
		Locator button = p.locator("button:has-text('Next')");
		button.click();
		Locator password =p.locator("//input[@type='password']");
		password.fill("tyqwrety");
		button.click();
		Thread.sleep(2000);
		Locator errormsg = p.locator("//div[@jsname='B34EJ']/child::span");
		String errmsg = errormsg.innerText();
		System.out.println(errmsg);
		Thread.sleep(2000);
		B.close();
		
		
		
		
			

	}

}
