package WindowHandling;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WindowHandling {
	
	static int i;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
		Page p = B.newPage();
		p.navigate("https://www.flipkart.com/");
		Thread.sleep(3000);
		Locator searchplaceHolder  = p.locator("[name='q']");
		searchplaceHolder.fill("I phone 14");
		Locator ClicksearchIcon  = p.locator("[type='submit']");
		
		ClicksearchIcon.click();
		Thread.sleep(2000);
		//Locator iphoneScreen = p.locator("//div[@class='DOjaWF YJG4Cf']/child::div[@class='DOjaWF gdgoEp']");
		Locator iphone = p.locator("//div[@class='tUxRFH']/child::a");
		int mobilecount =iphone.count();
		System.out.println(mobilecount);
		for ( i=0; i<mobilecount;i++) {
            Page popup = p.waitForPopup(() -> {
            	iphone.nth(i).click();
			});
            Locator text=popup.locator("//h1[@class='_6EBuvT']/child::span");
			String mobiletext = text.innerText() ;
			System.out.println(i+1+"."+mobiletext);
			popup.close();
			

		}
		
		
			
			
			
			
	

	}

}
