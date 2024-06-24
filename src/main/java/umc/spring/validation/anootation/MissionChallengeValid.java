// validation/MissionChallengeValid.java
package umc.spring.validation.anootation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import umc.spring.validation.validator.MissionChallengeValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MissionChallengeValidator.class)
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface MissionChallengeValid {
    String message() default "The mission is already being challenged";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}