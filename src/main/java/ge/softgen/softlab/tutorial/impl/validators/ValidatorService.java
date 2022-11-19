package ge.softgen.softlab.tutorial.impl.validators;

import ge.softgen.softlab.tutorial.abstraction.Validator;
import ge.softgen.softlab.tutorial.exceptions.ValidatorException;

import java.util.List;

public class ValidatorService extends Throwable {
    public static void validate(List<Validator> validators) throws ValidatorException {
        for(Validator validator : validators) {
            if(!validator.isValid()) {
                        throw new ValidatorException(validator.getErrorMessage());
            }
        }

    }
}
