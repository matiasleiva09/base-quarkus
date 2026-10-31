package uy.com.base.infraestructure.service.health;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
@ApplicationScoped
public class ReadinessCheckImpl implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("base-component readiness");
    }
}
