package com.singtel.test;

public class Chicken extends Bird {
    @Override
    public void sing(){
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly(){
        System.out.println("I can't fly");
    }
}
