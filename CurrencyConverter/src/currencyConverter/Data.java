package currencyConverter;

import java.math.BigDecimal;
import java.net.http.HttpResponse;
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
	
	public static String formatStringResponse(String string) {
		int headerIndex = calculateHeaderIndex(string);
		String formattedResponse = removeHeaderEnding(string, headerIndex, string.length()-3);
		return formattedResponse;
	}
	
	private static int calculateHeaderIndex(String string) {
		int headerInstance = 0;
		for (int i=0; i<((CharSequence) string).length(); i++) {
			if (((CharSequence) string).charAt(i) == '{') {
				headerInstance++;
				if (headerInstance == 2) {
					return i+1;
				}
			}
		}
		return headerInstance;
	}
	
	private static String removeHeaderEnding(String string, int headerIndex, int endIndex) {
		String formattedResponse = new String(string).substring(headerIndex, endIndex);
		return formattedResponse;
	}
	
	
	
}
