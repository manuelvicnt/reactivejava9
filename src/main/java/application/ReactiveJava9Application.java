package application;

import org.glassfish.jersey.server.ResourceConfig;

import rates.RatesEndPoint;

public class ReactiveJava9Application extends ResourceConfig {

    /**
     * Register JAX-RS application component
     */
    public ReactiveJava9Application() {

    	register(RatesEndPoint.class);
    }
}
