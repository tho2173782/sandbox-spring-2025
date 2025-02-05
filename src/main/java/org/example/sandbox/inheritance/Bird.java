package org.example.sandbox.inheritance;

public class Bird extends Aves {

    public Bird(){
        super();
        count++;
    }
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

    @Override
    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }

    @Override
    public void tweet() {
        System.out.println("Bird is tweeting!");
    }
}
