package currencyConverter;

import java.util.ArrayList;

public class CurrencyConverter {
	
	private final Currency BASE_CURRENCY = new Currency("USD", 1.0);
	private Currency origCurrency;
	private Currency newCurrency;

	public void promptUserForInputs() {
		int origCurrencyInput = UserPrompts.promptUserCurrencyCode("currency you want to convert");
		double origValueInput = UserPrompts.promptUserValue();
		int newCurrencyInput = UserPrompts.promptUserCurrencyCode("currency to convert to");
		setOrigCurrency(new Currency((Currency.convertToCode(origCurrencyInput)), origValueInput));
		setNewCurrency(new Currency());
		newCurrency.setCode(Currency.convertToCode(newCurrencyInput));
		System.out.println("Converting " + origCurrency.getValue() + " " + origCurrency.getCode() + " to "
				+ newCurrency.getCode());
	}

	public void getExchangeRate(Currency origCurrency, Currency newCurrency) {

	}

	public Currency getOrigCurrency() {
		return origCurrency;
	}

	public void setOrigCurrency(Currency origCurrency) {
		this.origCurrency = origCurrency;
	}

	public Currency getNewCurrency() {
		return newCurrency;
	}

	public void setNewCurrency(Currency newCurrency) {
		this.newCurrency = newCurrency;
	}

	public Currency getBASE_CURRENCY() {
		return BASE_CURRENCY;
	}
}
