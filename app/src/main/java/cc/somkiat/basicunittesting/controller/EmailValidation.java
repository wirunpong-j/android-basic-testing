package cc.somkiat.basicunittesting.controller;

import cc.somkiat.basicunittesting.custom.EmailValidationException;
import cc.somkiat.basicunittesting.model.ExceptionModel;

/**
 * Created by BellKunG on 11/11/2017 AD.
 */

public class EmailValidation {

    private ExceptionModel exceptionClass;

    public boolean validate(String email) {
        this.exceptionClass = new ExceptionModel();

        try {

            emailNotContainAtSign(email);

        } catch (EmailValidationException exception) {
            this.exceptionClass.setMessage(exception.getMessage());
            return false;
        }
        return true;
    }

    private void emailNotContainAtSign(String email) throws EmailValidationException {
        if (!email.contains("@")) {
            throw new EmailValidationException("Email not contain @.");
        }
    }

    public ExceptionModel getExceptionClass() {
        return exceptionClass;
    }
}
