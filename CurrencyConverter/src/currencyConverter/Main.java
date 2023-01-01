package currencyConverter;

public class Main {
	public static void main(String[] args) {
		int origCurrency = UserPrompts.promptUserCurrencyCode("currency you want to convert");
		double origValue = UserPrompts.promptUserValue();
		int newCurrency = UserPrompts.promptUserCurrencyCode("currency to convert to");
		System.out.println("Converting " + origValue + " " + Currency.convertToCode(origCurrency) + " to " + Currency.convertToCode(newCurrency) + "...");

	}
}
