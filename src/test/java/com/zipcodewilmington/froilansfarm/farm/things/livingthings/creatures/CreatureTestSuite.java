package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.AnimalTest;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.ChickenTest;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.HorseTest;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.FarmerTest;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.PersonTest;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.PilotTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)


@Suite.SuiteClasses({
        CreatureTest.class,
        AnimalTest.class,
        ChickenTest.class,
        HorseTest.class,
        PersonTest.class,
        FarmerTest.class,
        PilotTest.class,


})
public class CreatureTestSuite {
}