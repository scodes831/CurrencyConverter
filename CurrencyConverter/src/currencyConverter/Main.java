package currencyConverter;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		CurrencyConverter currencyConverter = new CurrencyConverter();
		ArrayList<Currency> currencyInputs = currencyConverter.promptUserForInputs(); 
	}
}