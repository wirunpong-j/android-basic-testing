package cc.somkiat.basicunittesting;

import android.util.Log;

import cc.somkiat.basicunittesting.custom.NameValidateException;
import cc.somkiat.basicunittesting.model.ExceptionModel;

/**
 * Created by BellKunG on 10/11/2017 AD.
 */

class NameValidation {

    private ExceptionModel exceptionClass;

    public boolean validate(String name) {

        this.exceptionClass = new ExceptionModel();

        try {

            isNull(name);
            isEmpty(name);

        } catch (NameValidateException exception) {
            exceptionClass.setMessage(exception.getMessage());
            return false;
        }
        return true;
    }

    private void isEmpty(String name) throws NameValidateException {
        if(name.isEmpty()) {
            throw new NameValidateException("Name is Empty");
        }
    }

    private void isNull(String name) throws NameValidateException {
        if(name == null) {
            throw new NameValidateException("Name is Null");
        }
    }

    public ExceptionModel getExceptionClass() {
        return exceptionClass;
    }
}
