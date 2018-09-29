package com.singtel.test;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        Parrot parrot = new Parrot();
        parrot.setLiveNear(new Chicken("Rooster"));
        parrot.sing();
    }
}
