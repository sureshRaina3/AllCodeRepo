package CapturingScreenshotAndVideos;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class traceViewver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright play = Playwright.create();
		Browser  B= play.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext c= B.newContext();
		Page p = c.newPage();
		c.tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true)
				  .setSources(false));
		p.navigate("http://gmail.com");
		Locator email =p.locator("id=identifierId");
		Thread.sleep(2000);
		email.type("trainer@way2automation.com");
		Locator button = p.locator("button:has-text('Next')");
		button.click();
		Locator password =p.locator("//input[@type='password']");
		password.fill("tyqwrety");
		button.click();
		Thread.sleep(2000);
		Locator errormsg = p.locator("//div[@jsname='B34EJ']/child::span");
		String errmsg = errormsg.innerText();
		System.out.println(errmsg);
		Thread.sleep(2000);
		c.tracing().stop(new Tracing.StopOptions()
				  .setPath(Paths.get("trace.zip")));
		p.close();
		c.close();
		B.close();
		play.close();
		
		
		
		
		
		
			

	}

}
