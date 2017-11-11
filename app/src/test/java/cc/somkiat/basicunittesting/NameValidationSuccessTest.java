package cc.somkiat.basicunittesting;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by BellKunG on 11/11/2017 AD.
 */

public class NameValidationSuccessTest {

    @Test
    public void normalName() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("Bellkung");
        Assert.assertTrue(result);
    }
}
