package com.singtel.animal;

import com.singtel.ability.SoundMakable;

public class Parrot extends Bird {
    private SoundMakable liveNear;

    public Parrot(SoundMakable liveNear) {
        this.liveNear = liveNear;
    }

    public Parrot() {
    }

    public SoundMakable getLiveNear() {
        return liveNear;
    }

    public void setLiveNear(SoundMakable liveNear) {
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
