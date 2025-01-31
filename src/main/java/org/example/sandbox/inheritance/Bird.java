package org.example.sandbox.inheritance;

public class Bird extends Aves {

    public Bird(){
        count++;
    }
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
