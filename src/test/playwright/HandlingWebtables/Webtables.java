package HandlingWebtables;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Webtables {

	public static void main(String[] args) {
		
		Playwright play =Playwright.create();
		Browser b= play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page p =b.newPage();
		p.navigate("https://letcode.in/table");
		Locator table = p.locator("//table[@id='shopping']");
		Locator Heading =  table.locator("//thead/tr/th");
		int headingsize=Heading.count();
		System.out.println(headingsize);
		for (int i=0; i<headingsize;i++) {
			String headings =Heading.nth(i).innerText();
			System.out.println(headings);
		}
		int sumofeachitems = 0;
		Locator items = table.locator("//tbody/tr");
		for(int j=0;j<items.count();j++) {
			String eachitems= items.nth(j).locator("//td[1]").innerText();
			int eachitemscost= Integer.parseInt(items.nth(j).locator("//td[2]").innerText());
			sumofeachitems+=eachitemscost;
			System.out.println(eachitems +" "+ eachitemscost);
		}
		int Totalitemscost = 0;
		String Tablefottertext = null;
		
		for(int j=1;j<=items.count();j++) {
			if (j==1) {
				Locator tablefotter =table.locator("//tfoot/td["+Integer.toString(j)+"]/i");
				Tablefottertext =tablefotter.innerText();
			}else if (j==2) {
				Totalitemscost= Integer.parseInt(table.locator("//tfoot/td["+Integer.toString(j)+"]/b").innerText());
			}	
		}
		System.out.println(Tablefottertext +" "+ Totalitemscost);
		if (sumofeachitems==Totalitemscost) {
			System.out.println("Values matched");
		}else {
			System.out.println("Values not matched");
		}
		p.close();
		b.close();
		play.close();
	
		
		

	}

}
