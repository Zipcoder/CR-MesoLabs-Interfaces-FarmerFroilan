package com.zipcodewilmington.froilansfarm.Animal;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EdibleEggTest {

    @Test
    public void EdibleEggTest(){
        EdibleEgg edibleEggTest = new EdibleEgg();

        boolean expected = true;
        boolean actual = edibleEggTest.IsEdible();

        Assert.assertEquals(expected, actual);
    }

}