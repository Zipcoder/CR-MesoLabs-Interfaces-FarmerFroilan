package com.zipcodewilmington.froilansfarm.peopletest;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest
{
    CropDuster testDuster = new CropDuster();

    @Test
    public void TestMount()
    {
        Farm test = new Farm();
        testDuster.operate(test);
        Pilot riding = new Pilot();
        Assert.assertTrue(riding.mount(testDuster));

    }

    @Test
    public void TestDismount()
    {
        Pilot riding = new Pilot();
        riding.mount(testDuster);
        Assert.assertTrue(riding.dismount(testDuster));

    }
}
