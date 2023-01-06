package currencyConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		currencyConverter.promptUserForInputs();
		HttpURLConnection connection;
		
		try {
			
			URL url = new URL("https://api.freecurrencyapi.com/v1/latest");
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("apikey", "nGsxt3T0lFZPs5hEhaDkg8eSDO66UsWa8PKQp1jR");
			StringBuilder response;
			
			try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
				String line;
				response = new StringBuilder();
				
				while ((line = in.readLine()) != null) {
					response.append(line);
				}
			}
			String formattedInput = Data.formatStringResponse(response.toString());
			HashMap<String,BigDecimal> inputMap = Data.convertResponseToMap(formattedInput);
			currencyConverter.findExchangeRates(inputMap);
			currencyConverter.calculateExchangeValue();
			System.out.println(currencyConverter.getOrigCurrency().getValue() + " "
					+ currencyConverter.getOrigCurrency().getCode() + " = " + currencyConverter.getNewCurrency().getValue() + " " + currencyConverter.getNewCurrency().getCode());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
