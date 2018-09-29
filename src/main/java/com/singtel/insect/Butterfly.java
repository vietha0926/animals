package com.singtel.insect;

import com.singtel.ability.Flyable;

public class Butterfly extends Insect implements Flyable {
    public Butterfly() {
        super(InsectLifecycle.BUTTERFLY);
    }

    @Override
    public void fly() {
        System.out.println("Butterfly is flying");
    }
}
