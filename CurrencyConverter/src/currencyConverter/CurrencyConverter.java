package currencyConverter;

public class CurrencyConverter {

	public static void main(String[] args) {
		int origCurrency = UserPrompts.promptUserCurrencyCode("currency you want to convert");
		double origValue = UserPrompts.promptUserValue();
		int newCurrency = UserPrompts.promptUserCurrencyCode("currency to convert to");
		System.out.println("Converting " + origValue + " " + Currency.convertToCode(origCurrency) + " to " + Currency.convertToCode(newCurrency) + "...");

	}
	//ask user for original currency code, amount
	//ask user to select currency to convert to
	//api call to get exchange rate for original and new currency code
		//create instance of original currency and new currency, set values
	//perform calculation
		//get value 1:1
		//use that to calculate amount from user input
	//display final calculation
	//ask user if they want to do another conversion

}
