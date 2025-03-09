package org.example.sandbox.stack;

import java.sql.Array;
import java.util.ArrayList;

public class StackDriver {

    public static void main(String[] args) {

        Stack<String> stack = new ArrayListStack<>();

        stack.push("World!");
        stack.push("Hello");

        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.empty());

        stack.pop();
        stack.push("Howdy");

        System.out.println(stack);
        System.out.println(stack.search("Hello"));
        System.out.println(stack.search("World!"));
    }
}
