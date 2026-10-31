package uy.com.base.infraestructure.handler.mappers;

import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uy.com.base.infraestructure.handler.dto.GenericErrorDTO;

@Provider
public class ProcessingExceptionMapper implements ExceptionMapper<ProcessingException> {
    private static final Logger log = LoggerFactory.getLogger(ProcessingExceptionMapper.class);
    @Override
    public Response toResponse(ProcessingException exception) {
        log.error("Posible error de comunicación o timeout: {}", exception.getMessage());
        return Response.status(400).entity(GenericErrorDTO.builder().code(1).message("No se ha podido procesar la solicitud, intentelo más tarde.").build()).build();
    }
}
