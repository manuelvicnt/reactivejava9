package rates.services;

import rates.helper.ExchangeRateResponseHelper;
import model.ExchangeRatesResponse;

import io.reactivex.Single;

public class ExchangeRatesServiceImpl implements ExchangeRatesService {
	
	public Single<ExchangeRatesResponse> getExchangeRates(final String base) {
		
		return ExchangeRateResponseHelper.getExchangeRates(base);
	}	
}
