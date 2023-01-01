package currencyConverter;

import java.util.ArrayList;

public class CurrencyConverter {

	public ArrayList<Object> promptUserForInputs() {
		ArrayList<Object> userInputs = new ArrayList<Object>();
		int origCurrency = UserPrompts.promptUserCurrencyCode("currency you want to convert");
		double origValue = UserPrompts.promptUserValue();
		int newCurrency = UserPrompts.promptUserCurrencyCode("currency to convert to");
		userInputs.add(origCurrency);
		userInputs.add(origValue);
		userInputs.add(newCurrency);
		System.out.println("Converting " + origValue + " " + Currency.convertToCode(origCurrency) + " to " + Currency.convertToCode(newCurrency) + "...");
		return userInputs;
	}
	
	//api call to get exchange rate for original and new currency code
		//create instance of original currency and new currency, set values
	//perform calculation
		//get value 1:1
		//use that to calculate amount from user input
	//display final calculation
	//ask user if they want to do another conversion

}
