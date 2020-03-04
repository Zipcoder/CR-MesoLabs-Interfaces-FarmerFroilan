package com.zipcodewilmington.froilansfarm.peopletest;

import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest
{

    @Test
    public void TestMount()
    {
        Pilot riding = new Pilot();
        Assert.assertTrue(riding.mount());

    }

    @Test
    public void TestDismount()
    {
        Pilot riding = new Pilot();
        riding.mount();
        Assert.assertTrue(riding.dismount());

    }
}
