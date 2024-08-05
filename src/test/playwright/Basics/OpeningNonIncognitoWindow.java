package Basics;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OpeningNonIncognitoWindow {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""),new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Page p = B.newPage();
		p.navigate("https://letcode.in/");
		System.out.println(p.title());
		Thread.sleep(2000);
		B.close();
	}

}
