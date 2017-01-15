package model;

import java.math.BigDecimal;
import java.util.Map;

public class ExchangeRatesResponse {

	private String base;
	private String date;
	private Map<String, BigDecimal> rates;
	
	public ExchangeRatesResponse() {
		
	}
	
	public ExchangeRatesResponse(String base, String date, Map<String, BigDecimal> rates) {
		
		this.base = base;
		this.date = date;
		this.rates = rates;
	}

	public String getBase() {
		return base;
	}
	
	public void setBase(String base) {
		this.base = base;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public Map<String, BigDecimal> getRates() {
		return rates;
	}
	
	public void setRates(Map<String, BigDecimal> rates) {
		this.rates = rates;
	}
}
