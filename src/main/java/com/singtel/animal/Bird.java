package com.singtel.animal;

import com.singtel.ability.Flyable;

public class Bird extends Animal implements Flyable {
    public void fly(){
        System.out.println("I am flying");
    }

    public void sing(){
        System.out.println("I am singing");
    }
}
