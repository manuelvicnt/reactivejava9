package stronger.services;

import io.reactivex.Single;

public interface StrongerService {

	Single<Boolean> isStronger(String baseCurrency, String counterCurrency);
}
