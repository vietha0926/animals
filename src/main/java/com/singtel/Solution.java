package com.singtel;

import com.singtel.animal.Bird;
import com.singtel.animal.Chicken;
import com.singtel.animal.Parrot;
import com.singtel.fish.Fish;
import com.singtel.fish.Shark;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        Parrot parrot = new Parrot();
        parrot.setLiveNear(new Chicken("Rooster"));
        parrot.sing();
        Fish fish = new Shark();
        System.out.println("Shark colour: " + fish.getColour());
    }
}
