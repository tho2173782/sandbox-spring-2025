package org.example.sandbox.exceptions;

import java.util.Scanner;

public class HelloException {

    public static void main(String[] args) {

        //try-catch block
        try {
            //do something
        } catch (Exception e) {
            e.printStackTrace();
        }

        //do something else

        try {
            //do something
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //do something
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //do something
        }

        try {
            //do something
        } finally {
            //do something
        }
        //java 7 multi-try-catch
        try {
            //do something
        } catch (ArithmeticException | NullPointerException | SecurityException e) {
            e.printStackTrace();
        }

        //try-with-resources
        try(Scanner scanner1 = new Scanner(System.in)) {
            //do something
        }
    }
}
