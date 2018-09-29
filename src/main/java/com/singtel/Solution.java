package com.singtel;

import com.singtel.ability.Flyable;
import com.singtel.ability.SoundMakable;
import com.singtel.ability.Swimmable;
import com.singtel.ability.Walkable;
import com.singtel.animal.*;
import com.singtel.fish.Clownfish;
import com.singtel.fish.Dolphin;
import com.singtel.fish.Fish;
import com.singtel.fish.Shark;
import com.singtel.insect.Butterfly;

import java.util.Arrays;

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
        Object[] objects = new Object[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        int[] counts = new int[4];
        Arrays.fill(counts, 0);
        Arrays.stream(objects).forEach(object -> {
            if (object instanceof Flyable){
                counts[0] ++;
            }
            if (object instanceof Walkable){
                counts[1] ++;
            }
            if (object instanceof SoundMakable){
                counts[2] ++;
            }
            if (object instanceof Swimmable){
                counts[3] ++;
            }
        });
        System.out.println("Number of animals that can fly " + counts[0]);
        System.out.println("Number of animals that can walk " + counts[1]);
        System.out.println("Number of animals that can sing " + counts[2]);
        System.out.println("Number of animals that can swim " + counts[3]);
    }
}
