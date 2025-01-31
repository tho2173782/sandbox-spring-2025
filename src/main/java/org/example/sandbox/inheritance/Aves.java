package org.example.sandbox.inheritance;

public abstract class Aves implements Animal {

    protected static int count = 0;

    public Aves() {
        count++;
    }

    public abstract void fly()
            ;
    public void layEggs(){
        System.out.println("I'm layin an egg!");
    }
    protected int numberOfWings;


}

