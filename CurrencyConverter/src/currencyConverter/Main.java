package currencyConverter;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		CurrencyConverter currencyConverter = new CurrencyConverter();
		ArrayList<Currency> currencyInputs = currencyConverter.promptUserForInputs();
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(URI.create("https://api.freecurrencyapi.com/v1/latest"))
				.header("apikey", "apikey")
				.GET()
				.build();
		HttpResponse<String> getResponse = client.send(getRequest, BodyHandlers.ofString());
		System.out.println(getResponse.body());
	}
}


