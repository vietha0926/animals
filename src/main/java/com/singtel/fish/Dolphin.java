package com.singtel.fish;

import com.singtel.ability.Swimmable;

public class Dolphin implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Dolphin is swimming");
    }
}
