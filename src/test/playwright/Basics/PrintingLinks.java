package Basics;

import java.nio.file.Paths;



import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PrintingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Page p = B.newPage();
		p.navigate("https://www.wikipedia.org/");
		Locator Alllinks = p.locator("a");
		int countofAlllinks=Alllinks.count();
		System.out.println(countofAlllinks);
		for (int i =0; i<countofAlllinks;i++) {
			String eachlink=Alllinks.nth(i).getAttribute("href");
			System.out.println(eachlink);
			
		}
		Locator particularbox = p.locator("//nav[@aria-label='Other projects']");
		Locator particularboxLinks = particularbox.locator("a");
		int countofparticularboxLinks=particularboxLinks.count();
		for (int i=0;i<countofparticularboxLinks;i++) {
			String links=particularboxLinks.nth(i).getAttribute("href");
			System.out.println(links);
			
		}
		B.close();
		

	}

}
