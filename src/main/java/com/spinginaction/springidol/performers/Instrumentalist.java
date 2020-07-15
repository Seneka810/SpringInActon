package com.spinginaction.springidol.performers;

import com.spinginaction.springidol.Instrument;
import com.spinginaction.springidol.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong(){
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Autowired
    public Instrumentalist(@Qualifier("piano") Instrument instrument) {
        this.instrument = instrument;
    }

    public void perform() {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }
}
