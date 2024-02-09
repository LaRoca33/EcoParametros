package org.aaroca.ecoparametros.model.validaciones;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidadorLicencia implements ConstraintValidator<ComprobarLicencia,Boolean>{

    @Override
    public boolean isValid(Boolean value, ConstraintValidatorContext context) {
        if(value == null) {
            return false;
        }
        return value;
    }
}
