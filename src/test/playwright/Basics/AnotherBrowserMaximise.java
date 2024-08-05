package Basics;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AnotherBrowserMaximise {

	public static void main(String[] args) {
		 
		Playwright play = Playwright.create();
		ArrayList<String>arguments = new ArrayList<String>();
		arguments.add("--start-maximised");
		Browser b=play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setArgs(arguments).setHeadless(false));
		BrowserContext bc =b.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page p= bc.newPage();
		p.navigate("https://letcode.in/");
		System.out.println(p.title());
		
		
		

	}

}
