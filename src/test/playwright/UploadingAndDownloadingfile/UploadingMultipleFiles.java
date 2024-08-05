package UploadingAndDownloadingfile;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class UploadingMultipleFiles {

	public static void main(String[] args) {
		Playwright play = Playwright.create();
		Browser B=play.chromium().launch( new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page p = B.newPage();
		p.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_multiple");
		FrameLocator frame = p.frameLocator("#iframeResult");
		frame.locator("#myFile").setInputFiles(new Path[]{Paths.get("./src/test/resources/Images/image.png"),Paths.get("./src/test/resources/Images/myimage.png")});
		p.close();
		B.close();
		play.close();
		
	}

}
