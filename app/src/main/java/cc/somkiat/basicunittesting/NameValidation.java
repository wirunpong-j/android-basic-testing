package cc.somkiat.basicunittesting;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            isLessThanFive(name);
            isMoreThanFifteen(name);
            isContainNumber(name);
            isContainSpecialCharacter(name);

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

    private void isLessThanFive(String name) throws NameValidateException {
        if(name.length() < 5) {
            throw new NameValidateException("Name is less than 5.");
        }
    }

    private void isMoreThanFifteen(String name) throws NameValidateException {
        if(name.length() > 15) {
            throw new NameValidateException("Name is more than 15.");
        }
    }

    private void isContainNumber(String name) throws NameValidateException {
        if (name.matches(".*\\d+.*")) {
            throw new NameValidateException("Name contain number.");
        }
    }

    private void isContainSpecialCharacter(String name) throws NameValidateException {
        Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);

        if (matcher.find()) {
            throw new NameValidateException("Name contain special character.");
        }
    }

    public ExceptionModel getExceptionClass() {
        return exceptionClass;
    }
}
