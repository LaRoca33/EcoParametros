package org.aaroca.ecoparametros.model.validaciones;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidadorEmail implements ConstraintValidator<ComprobarEmail,String>{
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null) {
            return true;
        }
        return value.matches("^\\w+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
}

