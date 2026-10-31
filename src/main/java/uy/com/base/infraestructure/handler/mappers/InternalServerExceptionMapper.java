package uy.com.base.infraestructure.handler.mappers;


import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import uy.com.base.infraestructure.handler.excepcion.InternalErrorException;
import uy.com.base.infraestructure.handler.response.ExceptionDetails;

@Provider
public class InternalServerExceptionMapper implements ExceptionMapper<InternalErrorException> {
    @Override
    public Response toResponse(InternalErrorException e) {
        return Response.status(500).entity(ExceptionDetails.builder().statusCode(500).cause(e.getMessage()).build()).build();
    }
}

