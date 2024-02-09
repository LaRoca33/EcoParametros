package org.aaroca.ecoparametros.model.validaciones;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(ElementType.TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = ValidadorEdadFechaNac.class)
@Documented
public @interface ComprobarEdadFechaNac {
    String message() default "Edad no coincide con la fecha de nacimiento";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
