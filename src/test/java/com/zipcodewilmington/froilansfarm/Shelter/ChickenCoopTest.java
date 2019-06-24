package com.zipcodewilmington.froilansfarm.Shelter;

import com.sun.xml.internal.ws.policy.AssertionSet;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChickenCoopTest {

    @Test
    public void isEmpty() {
    List<Chicken> chickenCoop1 = new ArrayList<>();
        Chicken chicken1 = new Chicken();

        chickenCoop1.add(chicken1);

        Assert.assertFalse(chickenCoop1.isEmpty());
    }

    @Test
    public void atCapacity() {
    }

    @Test
    public void add() {
        List<Chicken> chickenCoop1 = new ArrayList<>();
        Chicken chicken1 = new Chicken();

        chickenCoop1.add(chicken1);

        Assert.assertTrue(chickenCoop1.contains(chicken1));
    }

    @Test
    public void remove() {
        List<Chicken> chickenCoop1 = new ArrayList<>();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();

        chickenCoop1.add(chicken1);
        chickenCoop1.add(chicken2);
        chickenCoop1.remove(chicken1);

        Assert.assertFalse(chickenCoop1.contains(chicken1));

    }

    @Test
    public void itemCount() {
    }
}