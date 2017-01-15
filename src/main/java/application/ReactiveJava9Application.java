package application;

import helloworld.JerseyHelloWorld;

import org.glassfish.jersey.server.ResourceConfig;

public class ReactiveJava9Application extends ResourceConfig {

    /**
     * Register JAX-RS application component
     */
    public ReactiveJava9Application() {

    	register(JerseyHelloWorld.class);
    }
}
