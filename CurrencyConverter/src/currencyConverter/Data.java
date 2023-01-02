package currencyConverter;

public class Data {
	
	public static int calculateHeaderIndex(String response) {
		int headerInstance = 0;
		for (int i=0; i<response.length(); i++) {
			System.out.println("inside for loop");
			if (response.charAt(i) == '{') {
				System.out.println("char is { " + i);
				headerInstance++;
				if (headerInstance == 2) {
					return i;
				}
			}
		}
		return headerInstance;
	}
	
	public static void main(String[] args) {
		String input = "{\"data\":{\"AUD\":1.466382,\"BGN\":1.827159,\"BRL\":5.28671,\"CAD\":1.353397,\"CHF\":0.923951,\"CNY\":6.897913,\"CZK\":22.524033,\"DKK\":6.949534,\"EUR\":0.934186,\"GBP\":0.826448,\"HKD\":7.801764,\"HRK\":7.04221,\"HUF\":373.367607,\"IDR\":15538.528528,\"ILS\":3.527904,\"INR\":82.750146,\"ISK\":141.550206,\"JPY\":130.920251,\"KRW\":1261.911842,\"MXN\":19.496914,\"MYR\":4.405009,\"NOK\":9.788219,\"NZD\":1.573645,\"PHP\":55.680079,\"PLN\":4.373954,\"RON\":4.634947,\"RUB\":73.75008,\"SEK\":10.423805,\"SGD\":1.339002,\"THB\":34.600055,\"TRY\":18.691322,\"USD\":1,\"ZAR\":16.98945}}\n";
		System.out.println(calculateHeaderIndex(input));
	}
}
