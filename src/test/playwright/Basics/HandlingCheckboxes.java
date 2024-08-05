package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright play= Playwright.create();
		Browser B = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page p= B.newPage();
		p.navigate("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		Locator checkbox = p.locator("//div[@class='display'][1]/child::input[@value='soccer']");
		checkbox.click();
		B.close();
		
		
		
			

	}

}
