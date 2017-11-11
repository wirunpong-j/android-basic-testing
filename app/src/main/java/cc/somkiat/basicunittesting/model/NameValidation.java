package cc.somkiat.basicunittesting.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cc.somkiat.basicunittesting.custom.NameValidateException;

/**
 * Created by BellKunG on 10/11/2017 AD.
 */

public class NameValidation {

    private ExceptionModel exceptionClass;

    public NameValidation() {
    }

    public boolean validate(String name) {

        this.exceptionClass = new ExceptionModel();

        try {

            isNull(name);
            isEmpty(name);
            firstLetterIsLowercase(name);
            secondLetterOnwardsIsUpperCase(name);
            isContainSpace(name);
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

    private void isContainSpace(String name) throws NameValidateException {
        if (name.contains(" ")) {
            throw new NameValidateException("Name contain space.");
        }
    }

    private void firstLetterIsLowercase(String name) throws NameValidateException {
        if (Character.isLowerCase(name.charAt(0))) {
            throw new NameValidateException("First letter is lowercase.");
        }
    }

    private void secondLetterOnwardsIsUpperCase(String name) throws NameValidateException {
        for (int pos = 1; pos < name.length(); pos++) {
            if (Character.isUpperCase(name.charAt(pos))) {
                throw new NameValidateException("Second letter onwards is upperCase.");
            }
        }
    }

    public ExceptionModel getExceptionClass() {
        return exceptionClass;
    }
}
