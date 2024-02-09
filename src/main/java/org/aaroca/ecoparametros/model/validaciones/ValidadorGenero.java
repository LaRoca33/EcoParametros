package org.aaroca.ecoparametros.model.validaciones;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.aaroca.ecoparametros.model.Colecciones;

import java.util.Map;
public class ValidadorGenero  implements ConstraintValidator<ComprobarGenero,String>{
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Map<String,String> listaGeneros = Colecciones.getListaGeneros();
        return listaGeneros.containsKey(value);
    }
}
