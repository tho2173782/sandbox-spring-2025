package org.example.sandbox.inheritance;

public class Crow extends Bird{

    public Crow(){
        count++;
    }
    @Override
    public void fly() {
        System.out.println("I'm a crow and im flying!");
    }

    public void count() {
        System.out.println("There are " + count + " birds.");
    }
}
