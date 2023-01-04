package currencyConverter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Data {
	
	public static HashMap<String,BigDecimal> convertResponseToMap(String response) {
		HashMap<String,BigDecimal> responseMap = new HashMap<String,BigDecimal>();
		String[] currenciesArr = response.split(",");
		for (String s : currenciesArr) {
			String[] currencyInfo = s.split(":");
			String currencyCode = removePunctuation(currencyInfo[0]);
			BigDecimal exchangeRate = new BigDecimal(currencyInfo[1]);
			responseMap.put(currencyCode, exchangeRate);
		}
		return responseMap;
	}
	
	private static String removePunctuation(String input) {
		String withoutPunctuation =  input.replaceAll("\\p{P}", "");
		return withoutPunctuation;
	}
	
	public static String formatStringResponse(String response) {
		int headerIndex = calculateHeaderIndex(response);
		String formattedResponse = removeHeaderEnding(response, headerIndex, response.length()-3);
		return formattedResponse;
	}
	
	private static int calculateHeaderIndex(String response) {
		int headerInstance = 0;
		for (int i=0; i<response.length(); i++) {
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
