package uy.com.base.infraestructure.handler.mappers;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uy.com.base.infraestructure.handler.dto.GenericErrorDTO;

import java.net.UnknownHostException;
@Provider
public class UnknownHostExceptionMapper implements ExceptionMapper<UnknownHostException> {
    private static final Logger log = LoggerFactory.getLogger(UnknownHostExceptionMapper.class);
    @Override
    public Response toResponse(UnknownHostException exception) {
        log.error("Error, no se reconoce el host de la petición realizada: {}", exception.getMessage());
        return Response.status(502).entity(GenericErrorDTO.builder().code(1).message("No se puede procesar la solicitud en estos momentos.").build()).build();
    }
}
