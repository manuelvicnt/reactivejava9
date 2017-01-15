package rates.services;

import model.ExchangeRatesResponse;
import io.reactivex.Single;

public interface ExchangeRatesService {

	Single<ExchangeRatesResponse> getExchangeRates(String base);
}
