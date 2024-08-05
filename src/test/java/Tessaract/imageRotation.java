package Tessaract;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class imageRotation {
	
	public static void main(String[] args) {
		String text = null;
		Tesseract t = new Tesseract();
		try {
			t.setDatapath("C:\\Users\\2252549\\Tess4J\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
			text = t.doOCR(new File("C:\\Users\\2252549\\eclipse-workspace\\AutomationRevision\\src\\test\\resources\\Tessractimg2.png"));
			System.out.println(text);
		}catch (TesseractException e) {
			e.printStackTrace();
		}
		if(text.contains("cucumber")) {
			System.out.println("cucumber is present");
		}else {
			System.out.println("cucumber is not present");
		}
	}

	
}
