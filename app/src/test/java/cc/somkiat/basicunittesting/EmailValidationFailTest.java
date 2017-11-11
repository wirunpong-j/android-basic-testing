package cc.somkiat.basicunittesting;

import org.junit.Assert;
import org.junit.Test;

import cc.somkiat.basicunittesting.controller.EmailValidation;

/**
 * Created by BellKunG on 11/11/2017 AD.
 */

public class EmailValidationFailTest {

    @Test
    public void emailNotContainAtSign() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.validate("bell-kunghotmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void emailContainMoreAtSign() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.validate("bell-kung@@@hotmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void beforeAtSignContainSpecialCharacter() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.validate("bell-kung.@hotmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void afterAtSignContainSpecialCharacter() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.validate("bell-kung@=hotmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void afterDomainNameContainSpecialCharacterWithoutDot() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.validate("bell-kung@hotmail&.com");
        Assert.assertFalse(result);
    }

    @Test
    public void afterDotContainSpecialCharacter() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.validate("bell-kung@hotmail.^com");
        Assert.assertFalse(result);
    }

    @Test
    public void usernameContainMoreThanOneDot() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.validate("be..ll-kung@hotmail.com");
        Assert.assertFalse(result);
    }

    

}
