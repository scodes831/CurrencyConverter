package currencyConverter;

import java.util.ArrayList;

public class CurrencyConverter {

	public ArrayList<Currency> promptUserForInputs() {
		ArrayList<Currency> currencyInputs = new ArrayList<Currency>();
		int origCurrencyInput = UserPrompts.promptUserCurrencyCode("currency you want to convert");
		double origValueInput = UserPrompts.promptUserValue();
		int newCurrencyInput = UserPrompts.promptUserCurrencyCode("currency to convert to");
		Currency origCurrency = new Currency((Currency.convertToCode(origCurrencyInput)), origValueInput);
		Currency newCurrency = new Currency();
		currencyInputs.add(origCurrency);
		currencyInputs.add(newCurrency);
		newCurrency.setCode(Currency.convertToCode(newCurrencyInput));
		System.out.println("Converting " + origValueInput + " " + Currency.convertToCode(origCurrencyInput) + " to "
				+ Currency.convertToCode(newCurrencyInput) + "...");
		return currencyInputs;
	}

	public void getExchangeRate(Currency origCurrency, Currency newCurrency) {

	}

	// api call to get exchange rate for original and new currency code
	// create instance of original currency and new currency, set values
	// perform calculation
	// get value 1:1
	// use that to calculate amount from user input
	// display final calculation
	// ask user if they want to do another conversion

}
