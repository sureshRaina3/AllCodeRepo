package CapturingScreenshotAndVideos;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

public class ScreenShotEntirePage {

	public static void main(String[] args) {
		 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
	
		Playwright play=Playwright.create();
		Browser b=play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext bc = b.newContext(new Browser.NewContextOptions().setViewportSize((int)width, (int)height));
		Page p=bc.newPage();
		p.navigate("https://www.flipkart.com/");
		if(p.title().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("i am navigated to the page sucessfully");
		}else {
			System.out.println("i am not navigated to the page sucessfully");
		}
		p.screenshot(new ScreenshotOptions().setPath(Paths.get("./screenshots/ScreenShoHomePage.png")));
		p.close();
		bc.close();
		play.close();
		

	}

}
