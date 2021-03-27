package com.zipcodewilmington.froilansfarm;



import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Baskets.CornBasket;
import com.zipcodewilmington.froilansfarm.FieldRelated.CornStalk;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import com.zipcodewilmington.froilansfarm.PersonRelated.Farmer;
import com.zipcodewilmington.froilansfarm.VehicleRelated.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropRowTest {
    CropRow cropRow1 = new CropRow();
    CropRow cropRow2 = new CropRow();
    CropRow cropRow3 = new CropRow();
    Farmer test = new Farmer();
    Basket basket = new Basket<CornBasket>();

    @Before

    public void setUp() throws Exception {
        cropRow1.add(new CornStalk());
        cropRow3.add(new CornStalk());
        cropRow3.add(new CornStalk());
        cropRow3.add(new CornStalk());
        cropRow3.add(new CornStalk());
        cropRow1.add(new CornStalk());


    }

    @Test
    public void add() {
        cropRow1.add(new CornStalk());
        cropRow1.add(new CornStalk());
        cropRow1.add(new CornStalk());
        cropRow1.add(new CornStalk());
        Integer actual = cropRow1.count();
        Integer expected = 6;
        Assert.assertEquals(expected, actual);



    }

    @Test
    public void getCropRow() {


       Integer actual = cropRow1.getCropRow().size();;
        Integer expected = 2;
       Assert.assertEquals(expected, actual);
    }

    @Test
    public void count() {
        Integer actual = cropRow1.count();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilize() {
        cropRow1.fertilize();

        Boolean actual = cropRow1.getHasBeenFertilized();
        Boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        cropRow1.remove();
        cropRow1.remove();
        Integer actual = cropRow1.count();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void plant() {
        test.plants(new CornStalk(),cropRow2,5);
        Integer actual = cropRow2.count();
        Integer expected = 5;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void harvest() {
        Tractor test = new Tractor();

        test.harvest(cropRow3,  basket);
        Integer actual = basket.size();
        Integer expected = 4;
        Assert.assertEquals(expected, actual);

    }
}