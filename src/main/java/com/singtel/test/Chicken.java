package com.singtel.test;

public class Chicken extends Bird {
    private String type;

    public Chicken() {
    }

    public Chicken(String type) {
        this.type = type;
    }

    @Override
    public void sing() {
        if (type != null && type.equals("Rooster")) {
            System.out.println("Cock-a-doodle-doo");
        } else {
            System.out.println("Cluck, cluck");
        }
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
