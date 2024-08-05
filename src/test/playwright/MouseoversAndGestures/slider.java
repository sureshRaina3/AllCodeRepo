package MouseoversAndGestures;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class slider {
	
	public static void main(String[] args) throws InterruptedException {
		
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setChannel("chrome").setHeadless(false));
		Page p= B.newPage();
		p.navigate("https://jqueryui.com/resources/demos/slider/default.html");
		Locator slider = p.locator("//*[@id='slider']/child::span");
		Thread.sleep(3000)	;
		p.mouse().move(slider.boundingBox().x+ slider.boundingBox().width/2, slider.boundingBox().y+ slider.boundingBox().height/2);
		p.mouse().down();
		p.mouse().move(slider.boundingBox().x+600, slider.boundingBox().y);
		p.mouse().up();
		p.close();
		B.close();
		play.close();
		
		
	}

}
