package InterviewCodes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Readingtextfile {

	public static void main(String[] args) {
		 String  Filename = "./src/main/resources/textfiles/filereading.txt";
		 try {
			List <String>alllines =Files.readAllLines(Paths.get(Filename));
			for (String Eachline:alllines) {
				System.out.println(Eachline);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
