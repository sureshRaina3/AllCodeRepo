package HandlingAlerts;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class simpleAlert {

	public static void main(String[] args) throws InterruptedException {
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Page p = B.newPage();
		p.onDialog(dialog -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   dialog.accept();
		 });
		p.navigate("https://letcode.in/alert");
		Locator simpleAlert = p.locator("id=accept");
		
		simpleAlert.click();
		Thread.sleep(3000);
		p.close();
		B.close();
		play.close();
		

	}

}
