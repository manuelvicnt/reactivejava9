package helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import services.HelloService;

@Path("hello-world")
public class JerseyHelloWorld {

	@Autowired
	private HelloService helloService;
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
    	
        return helloService.hello();
    }
}
