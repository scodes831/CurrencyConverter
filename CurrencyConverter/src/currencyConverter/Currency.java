package currencyConverter;

import java.math.BigDecimal;

public class Currency {
	private String code;
	private BigDecimal value;
	private BigDecimal exchangeRateUSD;
	
	Currency(String code, BigDecimal value) {
		this.code = code;
		this.value = value;
	}
	
	Currency() {}

	public static String convertToCode(int num) {
		switch (num) {
		case 1:
			return "EUR";
		case 2:
			return "USD";
		case 3:
			return "GBP";
		case 4:
			return "AUD";
		case 5:
			return "CAD";
		case 6: 
			return "BRL";
		case 7: 
			return "CNY";
		case 8: 
			return "HKD";
		case 9: 
			return "MXN";
		case 10:
			return "INR";
		case 11: 
			return "KRW";
		case 12:
			return "JPY";
		default:
			return "Please enter a valid selection.";
		}
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getExchangeRateUSD() {
		return exchangeRateUSD;
	}

	public void setExchangeRateUSD(BigDecimal bigDecimal) {
		this.exchangeRateUSD = bigDecimal;
	}

}
