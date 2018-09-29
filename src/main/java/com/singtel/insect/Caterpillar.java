package com.singtel.insect;

import com.singtel.ability.Walkable;

public class Caterpillar extends Insect implements Walkable {
    public Caterpillar() {
        super(InsectLifecycle.CATERPILLAR);
    }

    @Override
    public void walk() {
        System.out.println("Caterpillar is walking");
    }
}
