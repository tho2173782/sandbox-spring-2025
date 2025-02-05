package org.example.sandbox.inheritance;

public class Arachnid implements Animal {
    @Override
    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }
}
