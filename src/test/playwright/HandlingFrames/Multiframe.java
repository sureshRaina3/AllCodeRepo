package HandlingFrames;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Multiframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Page p = B.newPage();
		p.navigate("https://letcode.in/frame");
		Thread.sleep(3000);
		FrameLocator frame1 = p.frameLocator("id=firstFr");
		FrameLocator frame2 = frame1.frameLocator("[src=innerFrame]");
		Locator innerframeinput = frame2.locator("[name='email']");
		innerframeinput.fill("sureshkumar@gmail.com");
		Thread.sleep(3000);
		p.close();
		B.close();
		play.close();
	}

}
