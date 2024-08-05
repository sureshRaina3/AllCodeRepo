package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class bowseropen{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright play=Playwright.create();
		Browser b=play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page p=b.newPage();
		p.navigate("https://letcode.in/");
		System.out.println(p.title());
		b.close();

	}

}
