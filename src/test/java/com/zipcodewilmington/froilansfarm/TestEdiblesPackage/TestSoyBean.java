package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.EdiblePackage.SoyBean;
import org.junit.Assert;
import org.junit.Test;

public class TestSoyBean {
    @Test
    public void testImplementsEdible(){
        //Arrange
        SoyBean bean = new SoyBean();

        //Assertion
        Assert.assertTrue(bean instanceof Edible);
    }
    @Test
    public void testImplementsEdiblePlant(){
        //Arrange
        SoyBean bean = new SoyBean();

        //Assertion
        Assert.assertTrue(bean instanceof EdiblePlant);
    }
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        SoyBean bean = new SoyBean();

        //Action
        boolean test = bean.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
    @Test
    public void testHasBeenHarvested(){
        //Arrange
        SoyBean bean = new SoyBean() ;

        //Action
        boolean test = bean.hasBeenHarvested();

        //Assertion
        Assert.assertFalse(test);
    }
}
