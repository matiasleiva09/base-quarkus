package uy.com.base.infraestructure.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class SqlUriIjectPreventValidation implements ConstraintValidator<SqlUrlInjection,String> {
    private static final String EVITAR_INJECCION= "^[A-Za-z0-9\\-=&?.:/\\\\]+$";

    @Override
    public void initialize(SqlUrlInjection constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null) return false;
        return  Pattern.compile(EVITAR_INJECCION).matcher(value).find();
    }
}
