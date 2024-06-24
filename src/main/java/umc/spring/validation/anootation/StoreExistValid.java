package umc.spring.validation.anootation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import umc.spring.validation.validator.StoreExistValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = StoreExistValidator.class)
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface StoreExistValid {
    String message() default "The store does not exist";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}