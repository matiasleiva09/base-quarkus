/*package uy.com.base.infraestructure.security;

//DESCOMENTAR TODO PARA APLICAR SEGURIDAD BASICA
import io.quarkus.security.identity.SecurityIdentity;
import io.quarkus.vertx.http.runtime.security.HttpSecurityPolicy;
import io.smallrye.mutiny.Uni;
import io.vertx.ext.web.RoutingContext;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("custom-policy")
public class BaseAPISecurityPolicy implements HttpSecurityPolicy {
    @Override
    public Uni<CheckResult> checkPermission(RoutingContext routingContext,
                                            Uni<SecurityIdentity> identity,
                                            AuthorizationRequestContext requestContext) {

        String uri = routingContext.request().uri();
        String method = routingContext.request().method().name();

        if (isPublic(uri, method)) {
            return Uni.createFrom().item(CheckResult.PERMIT);
        }

        return identity.map(id -> id.isAnonymous()
                ? CheckResult.DENY
                : CheckResult.PERMIT);
    }

    private boolean isPublic(String uri, String method) {
        boolean userAllowed = uri.contains("user-allowed");

        return uri.contains("callback")
                || (uri.contains("/") && "GET".equals(method) && !userAllowed)
                || (uri.contains("/health") && "GET".equals(method) && !userAllowed)
                || (uri.contains("/q/health/**") && "GET".equals(method) && !userAllowed)
                || uri.contains("response");
    }
}*/