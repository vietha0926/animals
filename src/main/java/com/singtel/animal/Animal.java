package com.singtel.animal;

import com.singtel.ability.SoundMakable;
import com.singtel.ability.Walkable;

public abstract class Animal implements SoundMakable, Walkable {
    public void walk(){
        System.out.println("I am walking");
    }
}
