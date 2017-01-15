package rates.services;

import model.ExchangeRatesResponse;

import helper.ExchangeRateResponseHelper;
import io.reactivex.Single;

public class ExchangeRatesServiceImpl implements ExchangeRatesService {
	
	public Single<ExchangeRatesResponse> getExchangeRates(final String base) {
		
		return ExchangeRateResponseHelper.getExchangeRates(base);
	}	
}
