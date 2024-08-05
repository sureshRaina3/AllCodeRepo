package Basics;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserMaximise {

	public static void main(String[] args) throws InterruptedException {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		System.out.println(width+","+height);
	
		Playwright play=Playwright.create();
		Browser b=play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext bro = b.newContext(new Browser.NewContextOptions().setViewportSize((int)width, (int)height));
		Page p=bro.newPage();
		p.navigate("https://letcode.in/");
		System.out.println(p.title());
		Thread.sleep(2000);
		b.close();
		

	}

}
