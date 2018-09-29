package com.singtel.fish;

public class Clownfish extends Fish {
    public Clownfish() {
        super();
        this.setColour("Colourful");
        this.setSize(FishSize.SMALL);
    }

    public void makeJoke(){
        System.out.println("I am making jokes");
    }
}
