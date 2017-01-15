package exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class CurrencyNotFoundMapper implements ExceptionMapper<CurrencyNotFoundException>{

	public Response toResponse(CurrencyNotFoundException exception) {
		
	    return Response.status(404).entity(exception.getMessage()).type("text/plain").build();
	}

}
