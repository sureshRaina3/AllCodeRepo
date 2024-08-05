package MouseoversAndGestures;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingShadowRootElement {

	public static void main(String[] args) {
		
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setChannel("chrome").setHeadless(false));
		Page p= B.newPage();
		p.navigate("chrome://downloads/");
		Locator inputdownloads = p.locator("id=searchInput");
		inputdownloads.fill("suresh");
		p.close();
		B.close();
		play.close();

	}

}
