package UploadingAndDownloadingfile;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DownloadingFile {

	public static void main(String[] args) {
		Playwright play = Playwright.create();
		Browser B=play.chromium().launch( new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page p = B.newPage();
		p.navigate("https://www.selenium.dev/downloads/");
		
		Download file=p.waitForDownload(()->{
			Locator download=p.locator("/html/body/div/main/div[4]/div[2]/div/div/p[1]/a");
			download.click();
		});
		file.saveAs(Paths.get("./src/test/resourses/downloads/selenium.jar"));
		p.close();
		B.close();
		play.close();
		
		
		
	}

}
