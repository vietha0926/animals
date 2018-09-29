package com.singtel.fish;

public class Fish implements Swimmable{
    static enum FishSize {
        LARGE, MEDIUM, SMALL, TINY;
    }

    private String colour;
    private FishSize size;

    public void swim() {
        System.out.println("I am swimming");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public FishSize getSize() {
        return size;
    }

    public void setSize(FishSize size) {
        this.size = size;
    }
}

