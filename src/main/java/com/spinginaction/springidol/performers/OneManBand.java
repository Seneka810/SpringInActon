package com.spinginaction.springidol.performers;

import com.spinginaction.springidol.Instrument;
import com.spinginaction.springidol.Performer;

import java.util.Map;

public class OneManBand implements Performer {
    public OneManBand() {
    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public void perform() {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
