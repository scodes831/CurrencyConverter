package currencyConverter;

public class Currency {
	private String code;
	private double value;
	
	Currency(String code, double value) {
		this.code = code;
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}

}
