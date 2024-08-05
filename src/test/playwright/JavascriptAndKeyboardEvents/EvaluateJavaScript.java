package JavascriptAndKeyboardEvents;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class EvaluateJavaScript {

	public static void main(String[] args) throws InterruptedException {
		Playwright play=Playwright.create();
		Browser B= play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page p = B.newPage();
		p.navigate("http://google.com");
		Thread.sleep(2000);
		//p.evaluate("document.getElementByClassName(\"RNmpXc\").click()");
		Thread.sleep(2000);
		p.evaluate("location.reload()");//to refreshPage
		 
		Thread.sleep(2000);
		p.close();
		B.close();
		play.close();
		
		

	}

}
