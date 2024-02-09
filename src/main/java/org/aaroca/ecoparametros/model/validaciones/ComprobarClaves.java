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
@Constraint(validatedBy = ValidadorClaves.class)
@Documented
public @interface ComprobarClaves {
    String message() default "Las contraseñas no son iguales";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
