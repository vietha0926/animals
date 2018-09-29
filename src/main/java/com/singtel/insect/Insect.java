package com.singtel.insect;

public class Insect {
    private InsectLifecycle stage;

    public Insect(InsectLifecycle stage) {
        this.stage = stage;
    }

    public void transform(){
        stage.transform();
    }
}
