package uy.com.base.infraestructure.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Objects;

public class IsEqualsStringValidation  implements ConstraintValidator<IsEqualsString, String> {
    private String textoPermitido;
    @Override
    public void initialize(IsEqualsString constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        textoPermitido = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !Objects.isNull(value) && textoPermitido.equalsIgnoreCase(value);
    }
}
