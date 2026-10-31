package uy.com.base.infraestructure.log;


import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;
import org.jboss.logging.MDC;

import java.io.IOException;

/*
En la respuesta de un frontend devuelve el header del traceId para que despues se pueda
detectar la traza por algun error. El trace id debe ser limpiado
 */
@Provider
public class TraceIdCleanupFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        String traceId = (String) MDC.get("traceId");
        if (traceId != null) {
            responseContext.getHeaders().add("X-Trace-Id", traceId);
        }
        MDC.clear();
    }
}