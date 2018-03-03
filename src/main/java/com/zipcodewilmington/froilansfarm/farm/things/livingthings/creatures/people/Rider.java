package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.things.Rideable;

public interface Rider {
    void mount (Rideable ride);
    void dismount (Rideable ride);
    void exerciseHorses(Stable stableToExercise);
}
