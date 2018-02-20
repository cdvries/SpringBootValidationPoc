package nl.chrisdevries.springPoc.dto.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<ValidName, String> {
    public void initialize(ValidName constraint) {
    }

    public boolean isValid(String name, ConstraintValidatorContext context) {
        return name == null || !name.toUpperCase().equals("TRUMP");
    }
}
