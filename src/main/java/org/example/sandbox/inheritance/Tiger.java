package org.example.sandbox.inheritance;

public class Tiger extends Mammal {
    @Override
    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }
}
