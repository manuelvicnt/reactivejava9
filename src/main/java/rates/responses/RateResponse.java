package rates.responses;

import java.math.BigDecimal;

public class RateResponse {

	private BigDecimal rate;

	public RateResponse() {
		
	}
	
	public RateResponse(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
}
