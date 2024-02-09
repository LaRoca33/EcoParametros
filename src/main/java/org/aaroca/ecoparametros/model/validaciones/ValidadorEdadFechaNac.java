package org.aaroca.ecoparametros.model.validaciones;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.aaroca.ecoparametros.model.Formulario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class ValidadorEdadFechaNac implements ConstraintValidator<ComprobarEdadFechaNac,Formulario>{
    @Override
    public boolean isValid(Formulario value, ConstraintValidatorContext context) {
        Integer edad= value.getEdad();
        LocalDate fechaNac= value.getFechaNacimiento();
        Integer periodo;
        if (edad == null){
            return true;
        }
        if (fechaNac == null){
            return true;
        }
        periodo = Math.toIntExact(ChronoUnit.YEARS.between(fechaNac, LocalDate.now()));
        return Objects.equals(edad, periodo);
    }
}
