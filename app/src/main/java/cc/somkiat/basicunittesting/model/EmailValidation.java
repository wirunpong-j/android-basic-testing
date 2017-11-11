package cc.somkiat.basicunittesting.model;

import org.apache.commons.validator.routines.EmailValidator;

/**
 * Created by BellKunG on 11/11/2017 AD.
 */

public class EmailValidation {

    public EmailValidation() {
    }

    public boolean validate(String email) {

        if (!EmailValidator.getInstance().isValid(email)) {
            return false;
        }
        return true;
    }

}
