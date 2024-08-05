package Basics;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page;

public class NavigationMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Page p = B.newPage();
		p.navigate("https://letcode.in/");
		Thread.sleep(2000);
		p.navigate("https://www.google.com/");
		Thread.sleep(2000);
		p.goBack();
		Thread.sleep(2000);
		p.goForward();
		Thread.sleep(2000);
		p.reload();
		Thread.sleep(2000);
		B.close();
	}

}
