package cc.somkiat.basicunittesting;

import cc.somkiat.basicunittesting.custom.NameValidateException;
import cc.somkiat.basicunittesting.model.ExceptionModel;

/**
 * Created by BellKunG on 10/11/2017 AD.
 */

class NameValidation {

    private ExceptionModel exception;

    public boolean validate(String name) {

        this.exception = new ExceptionModel();

        try {

            isEmpty(name);

        } catch (Exception e) {
            exception.setMessage(e.getMessage());
            return false;
        }
        return true;
    }

    private void isEmpty(String name) throws NameValidateException {
        if(name.isEmpty()) {
            throw new NameValidateException("Name is Empty");
        }
    }

    public ExceptionModel getException() {
        return exception;
    }
}
