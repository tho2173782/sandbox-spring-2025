package org.example.sandbox.exceptions;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.divide(3, 0));
    }

    public int divide(int a, int b) {
        int returnValue = 0;

        returnValue = a / b;

        return returnValue;
    }
}
