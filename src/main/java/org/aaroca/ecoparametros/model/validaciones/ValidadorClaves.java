package org.aaroca.ecoparametros.model.validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.aaroca.ecoparametros.model.Formulario;

public class ValidadorClaves implements ConstraintValidator<ComprobarClaves, Formulario> {


    @Override
    public boolean isValid(Formulario formulario, ConstraintValidatorContext context) {
        String clave = formulario.getClave();
        String confirmarClave= formulario.getConfirmarClave();
    /*    if(clave==null||confirmarClave==null){
            return true;
        }*/
        return clave.equals(confirmarClave);
    }
}
