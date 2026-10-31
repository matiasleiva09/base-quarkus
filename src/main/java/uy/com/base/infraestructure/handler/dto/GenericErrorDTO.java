package uy.com.base.infraestructure.handler.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GenericErrorDTO {
    private int code;
    private String message;
}
