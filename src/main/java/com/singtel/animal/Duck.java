package com.singtel.animal;

import com.singtel.ability.Swimmable;

public class Duck extends Bird implements Swimmable {
    @Override
    public void sing(){
        System.out.println("Quack, quack");
    }

    public void swim(){
        System.out.println("I am swimming!");
    }
}
