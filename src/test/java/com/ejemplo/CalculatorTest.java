package com.ejemplo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testFactorial() {
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
        assertEquals(2, Calculator.factorial(2));
        assertEquals(6, Calculator.factorial(3));
        assertEquals(24, Calculator.factorial(4));
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    public void testFactorialNegative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Número debe ser no negativo");
        Calculator.factorial(-1);
    }
}
