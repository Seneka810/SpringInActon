package com.spinginaction.springidol.instruments;

import com.spinginaction.springidol.Instrument;

public class Piano implements Instrument {
    public Piano() {
    }

    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
