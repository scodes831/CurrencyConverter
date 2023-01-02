package currencyConverter;

public class Data {
	
	public static String formatStringResponse(String response) {
		int headerIndex = calculateHeaderIndex(response);
		String formattedResponse = removeHeaderEnding(response, headerIndex, response.length()-3);
		return formattedResponse;
	}
	
	private static int calculateHeaderIndex(String response) {
		int headerInstance = 0;
		for (int i=0; i<response.length(); i++) {
			System.out.println(response.charAt(i));
			if (response.charAt(i) == '{') {
				headerInstance++;
				if (headerInstance == 2) {
					return i+1;
				}
			}
		}
		return headerInstance;
	}
	
	private static String removeHeaderEnding(String response, int headerIndex, int endIndex) {
		String formattedResponse = response.substring(headerIndex, endIndex);
		return formattedResponse;
	}
	
	
	
}
