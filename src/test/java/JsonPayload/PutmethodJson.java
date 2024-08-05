package JsonPayload;

import RestAssured.EndtoEndAPIAutomation;

public class PutmethodJson {
	
	public static String put() {
		String putmethod ="{\r\n"
				+ "    \"place_id\": \""+EndtoEndAPIAutomation.plsid+"\",\r\n"
				+ "    \"address\": \"70 Summer walk, USA\",\r\n"
				+ "    \"key\": \"qaclick123\"\r\n"
				+ "}";
		
		return putmethod;
		
	}

}
