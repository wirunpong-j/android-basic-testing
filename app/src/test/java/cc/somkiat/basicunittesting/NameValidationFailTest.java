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
    
}
