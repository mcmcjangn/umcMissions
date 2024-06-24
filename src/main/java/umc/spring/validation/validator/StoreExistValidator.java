// validation/validator/StoreExistValidator.java
package umc.spring.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import umc.spring.repository.StoreRepository;
import umc.spring.validation.anootation.StoreExistValid;

public class StoreExistValidator implements ConstraintValidator<StoreExistValid, Long> {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public boolean isValid(Long storeId, ConstraintValidatorContext context) {
        return storeRepository.existsById(storeId);
    }
}