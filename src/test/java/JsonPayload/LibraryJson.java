package JsonPayload;

public class LibraryJson {
	public static String postLibrary(String isbn, String aisle) {
		String PostLibararyJson= "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
				
		return PostLibararyJson;
		
	}

}
