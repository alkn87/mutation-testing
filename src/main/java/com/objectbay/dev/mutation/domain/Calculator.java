package com.objectbay.dev.mutation.domain;

public class Calculator {

    public int sum(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public int factorial(int operand) throws IllegalArgumentException {
        if (operand < 0) {
            throw new IllegalArgumentException("Negatives not allowed!");
        } else if (operand == 0) {
            return 1;
        } else if (operand == 1) {
            return 1;
        }
        else {
            return operand * factorial(operand - 1);
        }
    }

}
