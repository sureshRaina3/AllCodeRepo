package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BasicAuthentication {

	public static void main(String[] args) {
		
		Playwright play = Playwright.create();
		Browser B= play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		BrowserContext BC = B.newContext( new NewContextOptions().setHttpCredentials("admin","admin"));
		Page p= BC.newPage();
		p.navigate("http://the-internet.herokuapp.com/basic_auth");
		p.close();
		BC.close();
		B.close();
		play.close();

	}

}
