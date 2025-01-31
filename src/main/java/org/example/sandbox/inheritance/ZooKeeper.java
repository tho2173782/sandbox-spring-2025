package org.example.sandbox.inheritance;

public class ZooKeeper {

    public static void main(String[] args) {
        Aves bird = new Crow();
        bird.fly();
        bird.layEggs();
        ((Crow)bird).count(); //narrowing / down-casting.

    }
}
