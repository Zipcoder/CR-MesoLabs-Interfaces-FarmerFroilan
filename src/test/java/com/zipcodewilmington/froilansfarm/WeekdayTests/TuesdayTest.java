package com.zipcodewilmington.froilansfarm.WeekdayTests;

import com.zipcodewilmington.froilansfarm.MainApplication;
import org.junit.Assert;
import org.junit.Test;

public class TuesdayTest {

    @Test
    public void tuesdayTest() {
        MainApplication mainApplication = new MainApplication();
        mainApplication.beginDay();
        mainApplication.morningRoutine();
        mainApplication.tuesdayRoutine();
        Assert.assertTrue(mainApplication.getFroilansFarm().getField().getCropRows()[0].getCropArrayList().get(0).isFertilized());
    }

}
