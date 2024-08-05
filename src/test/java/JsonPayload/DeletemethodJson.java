package JsonPayload;

import RestAssured.EndtoEndAPIAutomation;

public class DeletemethodJson {
	
	public static String deletemethod() {
		String deleteJson ="{\r\n"
				+ "    \"place_id\":\""+EndtoEndAPIAutomation.plsid+"\"\r\n"
				+ "}";
		
		return deleteJson;
		
	}

}
