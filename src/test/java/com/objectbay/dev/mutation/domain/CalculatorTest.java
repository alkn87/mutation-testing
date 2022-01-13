package com.objectbay.dev.mutation.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void shouldPerformAddition() {
        assertEquals(8,  calculator.sum(5, 3));
    }

    @Test
    void shouldCalculateFactorialWithResult6() {
        assertEquals(6, calculator.factorial(3));
    }

    @Test
    void shouldCalculateFactorialWithResult24() {
        assertEquals(24, calculator.factorial(4));
    }

    @Test
    void shouldThrowExceptionWithFactorialNegatives() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
    }

    @Test
    void shouldCalculateOneForZeroFactorial() {
        assertEquals(1, calculator.factorial(0));
    }

}
