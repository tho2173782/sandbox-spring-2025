package org.example.sandbox.inheritance;

public abstract class Aves implements Animal {

    protected static int count = 0;

    public Aves() {
        count++;
    }


    public void layEggs(){
    }

    @Override
    public void eat(String food) {

}
