package com.zipcodewilmington.froilansfarm.WeekdayTests;

import com.zipcodewilmington.froilansfarm.MainApplication;
import org.junit.Assert;
import org.junit.Test;

public class MondayTest {

    @Test
    public void mondayTest() {
        MainApplication mainApplication = new MainApplication();
        mainApplication.beginDay();
        mainApplication.morningRoutine();
        mainApplication.mondayRoutine();
        Assert.assertTrue(mainApplication.getFroilansFarm().getField().getCropRows()[0].getCropArrayList().get(0).isFertilized());
    }

}
