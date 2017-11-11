package cc.somkiat.basicunittesting;

import org.junit.Assert;
import org.junit.Test;

import cc.somkiat.basicunittesting.controller.EmailValidation;

/**
 * Created by BellKunG on 12/11/2017 AD.
 */

public class EmailValidationSuccessTest {

    @Test
    public void normalEmailForm() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.validate("bell-kung@hotmail.com");
        Assert.assertTrue(result);
    }
}
