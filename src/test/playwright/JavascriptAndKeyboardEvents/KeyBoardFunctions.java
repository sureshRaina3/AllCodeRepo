package JavascriptAndKeyboardEvents;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.TypeOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class KeyBoardFunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright play= Playwright.create();
		Browser B= play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page p= B.newPage();
		p.navigate("https://letcode.in/edit");
		Locator input = p.locator("id=fullName");
		Thread.sleep(1000);
		input.type("sureshkumar", new TypeOptions().setDelay(100));
		p.keyboard().press("Control+A");
		Thread.sleep(1000);
		p.keyboard().press("Control+X");
		Thread.sleep(1000);
		p.keyboard().press("Control+V");
		Thread.sleep(1000);
		p.keyboard().down("Shift");
		for (int i =0;i<=3;i++) {
			p.keyboard().press("ArrowLeft");
		}
		p.keyboard().up("Shift");
		Thread.sleep(1000);
		p.keyboard().press("Backspace");
		

	}

}
