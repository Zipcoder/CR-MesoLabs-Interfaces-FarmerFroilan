package com.zipcodewilmington.froilansfarm.ProductionTest;

import com.zipcodewilmington.froilansfarm.Production.EarCorn;
import com.zipcodewilmington.froilansfarm.Production.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Production.EdibleStorage;
import com.zipcodewilmington.froilansfarm.Production.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EdibleStorageTest {

    private EdibleStorage testStorage;
    private Tomato edibleObject1;
    private EarCorn edibleObject2;
    private EdibleEgg edibleObject3;

    @Before
    public void setup() {
        testStorage = new EdibleStorage();
        edibleObject1 = new Tomato();
        edibleObject2 = new EarCorn();
        edibleObject3 = new EdibleEgg();
    }

    @Test
    public void addToEdibleStorageTest() {
        testStorage.getEdibleStorage().add(edibleObject2);
        int expected = 1;
        int actual = testStorage.getEdibleStorage().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeFromEdibleStorageTest() {
        testStorage.getEdibleStorage().add(edibleObject1);
        testStorage.getEdibleStorage().add(edibleObject3);
        testStorage.getEdibleStorage().remove(edibleObject1);
        Assert.assertFalse(testStorage.getEdibleStorage().contains(edibleObject1));
    }
}
