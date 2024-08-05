package HandlingWebtables;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Webtables2 {
	public static void main(String[] args) {
		
		Playwright play = Playwright.create();
		Browser b= play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page p = b.newPage();
		p.navigate("https://letcode.in/table");
		Locator table = p.locator("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']");
	    Locator Headers = table.locator("//thead/th");
	    Locator Body =table.locator("//tr");
	    int HeaderColoumNo =0;
	    int Headerscount = Headers.count();
	    for (int i=0;i<Headerscount; i++) {
	    	String HeadersText =Headers.nth(i).innerText();
	    	System.out.println(HeadersText);
	    	if (HeadersText=="Protein (g)") {
	    		HeaderColoumNo=i;
	    	}
	    	
	    }
	    int bodydatacount =table.locator("//tr/td").count();
	    for (int i =1;i<=Body.count();i++) {
	    	for (int j =1;j<=bodydatacount;j++) {
	    		String tabledata = table.locator("//tr["+Integer.toString(i)+"]//td["+Integer.toString(j)+"]").innerText();
	    		System.out.println(tabledata);
	    	}
	    	
	    }
	    
	    p.close();
	    b.close();
	    play.close();
	    
	
	}

}
