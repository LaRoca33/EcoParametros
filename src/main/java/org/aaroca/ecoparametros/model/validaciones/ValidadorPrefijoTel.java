package org.aaroca.ecoparametros.model.validaciones;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.aaroca.ecoparametros.model.Colecciones;
import org.aaroca.ecoparametros.model.Pais;

import java.util.Map;
public class ValidadorPrefijoTel implements ConstraintValidator<ComprobarPrefijoTel,String>{
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Map<String, Pais> listaPaises = Colecciones.getListaPaises();
        for (Pais pais : listaPaises.values()){
            if (pais.getPrefijotelefonicoPais().equals(value)){
                return true;
            }
        }
        return false;
    }
}
