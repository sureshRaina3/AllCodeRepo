package UploadingAndDownloadingfile;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class UploadSinglefile {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright play = Playwright.create();
		Browser B=play.chromium().launch( new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page p = B.newPage();
		p.navigate("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		Locator file = p.locator("//label[text()='Your Profile Picture']/following-sibling::input");
		p.mouse().move(file.boundingBox().x, file.boundingBox().y);
		
		Thread.sleep(2000);
		file.setInputFiles(Paths.get("./src/test/resources/Images/image.png"));
		Thread.sleep(2000);	
		p.close();
		B.close();
		play.close();
		

	}

}
