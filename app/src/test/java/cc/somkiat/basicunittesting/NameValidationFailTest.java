package cc.somkiat.basicunittesting;

import junit.framework.Assert;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * Created by BellKunG on 10/11/2017 AD.
 */

public class NameValidationFailTest {

    @Test
    public void nameIsEmptyString() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("");
        Assert.assertFalse(result);
    }

    @Test
    public void nameIsNull() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate(null);
        Assert.assertFalse(result);
    }

    @Test
    public void nameIsLessThanFive() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("Bell");
        Assert.assertFalse(result);
    }

    @Test
    public void nameIsMoreThanFifteen() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("TachibanaMakotoa");
        Assert.assertFalse(result);
    }

    @Test
    public void nameContainNumber() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("Bell69");
        Assert.assertFalse(result);
    }

    @Test
    public void nameContainSpecialCharacter() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("Bell!@#$%^&{}");
        Assert.assertFalse(result);
    }

    @Test
    public void nameContainSpace() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("Bell KunG Desu");
        Assert.assertFalse(result);
    }

    @Test
    public void firstLetterIsLowerCase() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("bellkung");
        Assert.assertFalse(result);
    }

    @Test
    public void secondLetterOnwardsIsUpperCase() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("BELlkunG");
        Assert.assertFalse(result);
    }
}
