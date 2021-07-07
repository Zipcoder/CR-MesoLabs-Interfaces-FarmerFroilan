package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmTest {
    Farm test = new Farm();

    @Test
    public void creationDay() {
        test.creationDay();


    }

    @Test
    public void everyday() {
    }

    @Test
    public void filCropRows() {
    }

    @Test
    public void getFroilan() {



        String actual = test.getFroilan().getClass().getSimpleName();
        String expected = "Farmer";
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void getField() {

    }

    @Test
    public void getCornBasket() {
    }

    @Test
    public void getTomatoBasket() {
    }

    @Test
    public void getPotatoBasket() {
    }

    @Test
    public void getEggBasket() {
    }

    @Test
    public void creationDay1() {
    }

    @Test
    public void everyday1() {
    }

    @Test
    public void filCropRows1() {
    }

    @Test
    public void getFroilan1() {
        String actual = test.getFroilan().getClass().getSimpleName();
        String expected = "Farmer";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getField1() {
        String actual = test.getField().getClass().getSimpleName();
        String expected = "Field";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCornBasket1() {
        String actual = test.getCornBasket().getClass().getSimpleName();
        String expected = "Basket";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTomatoBasket1() {
        String actual = test.getTomatoBasket().getClass().getSimpleName();
        String expected = "Basket";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPotatoBasket1() {
        String actual = test.getPotatoBasket().getClass().getSimpleName();
        String expected = "Basket";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEggBasket1() {
        String actual = test.getEggBasket().getClass().getSimpleName();
        String expected = "Basket";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTractor() {
        String actual = test.getTractor().getClass().getSimpleName();
        String expected = "Tractor";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCropRows() {
        String actual = test.getCropRows().getClass().getSimpleName();
        String expected = "ArrayList";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFroilanda() {
        String actual = test.getFroilanda().getClass().getSimpleName();
        String expected = "Pilot";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCropDuster() {
        String actual = test.getCropDuster().getClass().getSimpleName();
        String expected = "CropDuster";
        Assert.assertEquals(expected, actual);
    }
}