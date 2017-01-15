package rates.services;

import rates.model.ExchangeRatesResponse;
import io.reactivex.Single;

public interface ExchangeRatesService {

	Single<ExchangeRatesResponse> getExchangeRates(String base);
}
