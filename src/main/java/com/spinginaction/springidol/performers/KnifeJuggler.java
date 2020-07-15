package com.spinginaction.springidol.performers;

import com.spinginaction.springidol.Knife;
import com.spinginaction.springidol.Performer;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.HashSet;
import java.util.Set;

@Component
public class KnifeJuggler implements Performer {

    public void perform() {
        for (Knife knife : knives) {
            System.out.println(knife);
        }
    }

    private final Set<Knife> knives = new HashSet<Knife>();

    @Inject
    public KnifeJuggler(Provider<Knife> knifeProvider) {
        for (int i = 0; i < 5; i++) {
            knives.add(knifeProvider.get());
        }
    }
}
