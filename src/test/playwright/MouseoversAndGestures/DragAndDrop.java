package MouseoversAndGestures;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DragAndDrop {

	public static void main(String[] args) {
		
		Playwright play = Playwright.create();
		BrowserContext B= play.chromium().launchPersistentContext(Paths.get(""), new BrowserType.LaunchPersistentContextOptions().setChannel("chrome").setHeadless(false));
		Page p= B.newPage();
		p.navigate("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Locator drag = p.locator("id=draggable");
		Locator drop = p.locator("id=droppable");
		p.dragAndDrop("id=draggable", "id=droppable");
		p.close();
		B.close();
		play.close();
	}

}
