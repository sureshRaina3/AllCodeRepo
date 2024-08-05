package HandlingFrames;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SingleFrame {

	public static void main(String[] args) throws InterruptedException {
		
			Playwright play = Playwright.create();
			BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
			Page p = B.newPage();
			p.navigate("https://letcode.in/frame");
			Thread.sleep(3000);
			FrameLocator frame = p.frameLocator("id=firstFr");
			Locator name=frame.locator("[name='fname']");
			name.fill("suresh");
			Locator gmail=frame.locator("[placeholder='Enter email']");
			gmail.fill("suresh@gmail.com");
			Thread.sleep(3000);
			Locator outsideframe = p.locator("//h1[text()=' Frame']");
			String textoutside =outsideframe.innerText();
			System.out.println(textoutside);
			
			p.close();
			B.close();
			play.close();
			
	}

}
