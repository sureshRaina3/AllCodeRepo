package Basics;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class Handlingdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub]
		
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Page p = B.newPage();
		p.navigate("https://www.wikipedia.org/");
		Thread.sleep(2000);
		Locator dropdown = p.locator("id =searchLanguage");
		dropdown.selectOption("bg");
		Thread.sleep(2000);
		
		dropdown.selectOption(new SelectOption().setLabel("Deutsch"));
		Thread.sleep(2000);
		dropdown.selectOption(new SelectOption().setIndex(3));
		Thread.sleep(2000);

	}

}
