package CodeTrying;

import org.bytedeco.opencv.presets.opencv_core.Str;

public class RegexPattern {

	public static void main(String[] args) {
		String name ="Suresh/kumar";
		String []split = name.split("/");
		String op = split[0];
		System.out.println(op);

	}

}
