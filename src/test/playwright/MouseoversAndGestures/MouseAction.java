package MouseoversAndGestures;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setChannel("chrome").setHeadless(false));
		Page p= B.newPage();
		p.navigate("https://www.amazon.in/");
		Locator movetoElement=p.locator("id=nav-link-accountList");
		movetoElement.hover();
		Thread.sleep(3000);
		Locator Wishlist=p.locator("//*[text()='Your Wish List']");
		Wishlist.click();
		Thread.sleep(3000);
		String currenturl=p.url();
		if (currenturl.equals("https://www.amazon.in/hz/wishlist/intro")) {
			System.out.println(" I am navigated to your wishlist");
		}else {
			System.out.println(" I not am navigated to your wishlist");
		}
	
		p.close();
		B.close();
		play.close();
		
		
		
		

	}

}
