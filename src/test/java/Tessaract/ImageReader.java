package Tessaract;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageReader {
	
	public static void main(String[] args) {
		String text = null;
		Tesseract t = new Tesseract();
		try {
			t.setDatapath("C:\\Users\\2252549\\Tess4J\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
			text = t.doOCR(new File("C:\\Users\\2252549\\eclipse-workspace\\AutomationRevision\\src\\test\\resources\\Rotated images\\rotatedimage.png"));
			System.out.println(text);
		}catch (TesseractException e) {
			e.printStackTrace();
		}
		if(text.contains("UPS")) {
			System.out.println("UPS is present");
		}else {
			System.out.println("UPS is not present");
		}
	}

	
}
