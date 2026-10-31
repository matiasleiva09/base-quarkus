package uy.com.base.infraestructure.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IsNumericValidation implements ConstraintValidator<IsNumeric, String> {

    @Override
    public void initialize(IsNumeric constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String stringData, ConstraintValidatorContext constraintValidatorContext) {
        return isNumeric(stringData);
    }

    private boolean isNumeric(String value){
        try {
            long  d = Long.parseLong(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
     return true;
    }
}
