package com.zipcodewilmington.froilansfarm.person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {


    @Test
    public void testNullaryConstructor(){
        Farmer froilanda = new Farmer("Froilanda");
        String expected = "Froilanda";

        String actual = froilanda.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNullaryConstructor2(){
        Farmer froilanda = new Farmer("Froilanda");
        String expected = "Froilanda";

        String actual = froilanda.getName();

        Assert.assertNotEquals("Froiland", actual);
    }



}