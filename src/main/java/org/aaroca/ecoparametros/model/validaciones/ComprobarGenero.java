package org.aaroca.ecoparametros.model.validaciones;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
@Target(ElementType.FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = ValidadorGenero.class)
@Documented
public @interface ComprobarGenero {
    String message() default "Valor de género no aceptado";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
