package currencyConverter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.apache.commons.io;
import org.apache.commons.io.IOUtils;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
//		CurrencyConverter currencyConverter = new CurrencyConverter();
//		ArrayList<Currency> currencyInputs = currencyConverter.promptUserForInputs();
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(URI.create("https://api.freecurrencyapi.com/v1/latest"))
				.header("apikey", "nGsxt3T0lFZPs5hEhaDkg8eSDO66UsWa8PKQp1jR")
				.GET()
				.build();
		HttpResponse<String> getResponse = client.send(getRequest, BodyHandlers.ofString());
		System.out.println(getResponse.body());
		//make method to generate map of currency:exchange rate
	}
}
