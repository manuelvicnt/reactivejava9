package rates;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.ManagedAsync;
import org.springframework.beans.factory.annotation.Autowired;

import rates.model.ExchangeRatesResponse;
import rates.responses.RateResponse;
import rates.services.ExchangeRatesService;

@Path("rates/{baseCurrency}/{counterCurrency}")
public class RatesEndPoint {
	
	@Autowired
	private ExchangeRatesService exchangeRatesService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ManagedAsync
    public void getRates(@Suspended final AsyncResponse async, 
    		@PathParam("baseCurrency") final String baseCurrency,
    		@PathParam("counterCurrency") final String counterCurrency) {
    	
    	final RateResponse response = new RateResponse();
    	final CountDownLatch outerLatch = new CountDownLatch(1);
    	
    	exchangeRatesService.getExchangeRates(baseCurrency)
    	.subscribe(new SingleObserver<ExchangeRatesResponse>() {

			public void onSubscribe(Disposable d) {}

			public void onSuccess(ExchangeRatesResponse exchangeRatesResponse) {
				response.setRate(exchangeRatesResponse.getRates().get(counterCurrency));
				outerLatch.countDown();
			}

			public void onError(Throwable e) {
				outerLatch.countDown();
			}
		});

    	try {
    		if (!outerLatch.await(10, TimeUnit.SECONDS)) {
    			throw new Exception();
    		}
    	} catch (Exception e) {
    		
    	}
    	
		async.resume(response);
    }
}
