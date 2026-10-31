package uy.com.base.infraestructure.handler.mappers;

import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import uy.com.base.infraestructure.handler.response.ExceptionDetails;

@Provider
public class NotFoundExceptionMapper  implements ExceptionMapper<NotFoundException> {
    @Override
    public Response toResponse(NotFoundException e) {
        return Response.status(404).entity(ExceptionDetails.builder().statusCode(404).cause(e.getMessage()).build()).build();
    }
}
