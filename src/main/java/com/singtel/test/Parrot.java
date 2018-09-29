package com.singtel.test;

public class Parrot extends Bird {
    private SoundMaker liveNear;

    public Parrot(SoundMaker liveNear) {
        this.liveNear = liveNear;
    }

    public Parrot() {
    }

    public SoundMaker getLiveNear() {
        return liveNear;
    }

    public void setLiveNear(SoundMaker liveNear) {
        this.liveNear = liveNear;
    }

    @Override
    public void sing() {
        if (liveNear == null) {
            super.sing();
        } else {
            liveNear.sing();
        }
    }
}
