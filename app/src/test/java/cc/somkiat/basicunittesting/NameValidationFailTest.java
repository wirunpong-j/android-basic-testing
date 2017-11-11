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
}
