package com.singtel.animal;

public class Duck extends Bird {
    @Override
    public void sing(){
        System.out.println("Quack, quack");
    }

    public void swim(){
        System.out.println("I am swimming!");
    }
}
