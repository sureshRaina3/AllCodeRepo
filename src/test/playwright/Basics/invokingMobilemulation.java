package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class invokingMobilemulation {

	
	    public static void main(String[] args) {
	        // Create a Playwright instance
	        Playwright playwright = Playwright.create();
	        
	        // Launch the browser
	        Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
	        
	        // Set up the browser context with mobile emulation settings
	        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions()
	            .setViewportSize(412, 915) // Set the viewport size to match a mobile device
	            .setDeviceScaleFactor(2)   // Set the device scale factor
	            .setIsMobile(true)         // Enable mobile emulation
	            .setUserAgent("Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.79 Mobile Safari/537.36")); // Set a mobile user agent
	        
	        // Create a new page in the browser context
	        Page page = browserContext.newPage();
	        
	        // Navigate to the desired URL
	        page.navigate("https://www.example.com");
	        
	        // Perform your testing actions here
	        
	        // Close the browser
	        browser.close();
	        
	        // Close Playwright
	        playwright.close();
	    
	}


}
