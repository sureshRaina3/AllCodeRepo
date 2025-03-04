package SeleniumTrainingReloaded;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Reusablemethods {
	
	public Properties Proper() {
		
		Properties Prop= new Properties();
		try {
			String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SeleniumReloaded\\seleniumReloaded.properties";
			Prop.load(new FileInputStream(filePath));
		} catch (FileNotFoundException e) {
			System.out.println("Issue in reading Properties file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Issue in reading Properties file");
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		
		
	}
		return Prop;
	}
	
	
	
	public String ValueFromPropFile(String Key) {
		Reusablemethods rm = new Reusablemethods();
		String Value = rm.Proper().getProperty(Key);
		return Value;
		
	}
	

}
