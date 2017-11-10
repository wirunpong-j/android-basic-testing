package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by BellKunG on 10/11/2017 AD.
 */

public class CalculatorTest {

    @Test
    public void สองบวกสองเท่ากับสี่() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.plus(2, 2);

        // Assert
        assertEquals(4, result);

    }

    @Test
    public void สองบวกเจ็ดเท่ากับเก้า() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(2, 7);
        assertEquals(9, result);

    }
}
