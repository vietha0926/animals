package com.singtel.fish;

public class Shark extends Fish{
    public Shark() {
        super();
        this.setColour("Grey");
        this.setSize(FishSize.LARGE);
    }
    public void eat(Fish fish){
        System.out.println("Eating " + fish);
    }
}
