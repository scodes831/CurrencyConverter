package currencyConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

public class CurrencyConverter {
	
	private Currency origCurrency;
	private Currency newCurrency;

	public void promptUserForInputs() {
		int origCurrencyInput = UserPrompts.promptUserCurrencyCode("currency you want to convert");
		BigDecimal origValueInput = UserPrompts.promptUserValue();
		int newCurrencyInput = UserPrompts.promptUserCurrencyCode("currency to convert to");
		setOrigCurrency(new Currency((Currency.convertToCode(origCurrencyInput)), origValueInput));
		setNewCurrency(new Currency());
		newCurrency.setCode(Currency.convertToCode(newCurrencyInput));
		System.out.println("Converting " + origCurrency.getValue() + " " + origCurrency.getCode() + " to "
				+ newCurrency.getCode());
	}

	public void findExchangeRates(HashMap<String,BigDecimal> currenciesMap) {
		origCurrency.setExchangeRateUSD(currenciesMap.get(origCurrency.getCode()));
		newCurrency.setExchangeRateUSD(currenciesMap.get(newCurrency.getCode()));
	}
	
	public void calculateExchangeValue() {
		BigDecimal newAmount = newCurrency.getExchangeRateUSD().divide(origCurrency.getExchangeRateUSD(), 2, RoundingMode.HALF_UP).multiply(origCurrency.getValue());
		newCurrency.setValue(newAmount);
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
}
