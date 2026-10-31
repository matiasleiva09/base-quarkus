package uy.com.base.infraestructure.handler.mappers;

import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uy.com.base.infraestructure.handler.dto.GenericErrorDTO;


@Provider
public class BadRequestExceptionMapper implements ExceptionMapper<BadRequestException> {
    private static final Logger log = LoggerFactory.getLogger(BadRequestExceptionMapper.class);
    @Override
    public Response toResponse(BadRequestException e) {
        log.error("Error: {}",e.getMessage());
        return Response.status(400).entity(GenericErrorDTO.builder().code(1).message(e.getMessage()).build()).build();
    }
}
