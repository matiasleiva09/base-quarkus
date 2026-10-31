package uy.com.base.infraestructure.handler.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ExceptionDetails {
    private String cause;
    private Integer statusCode;
}

