package com.zipcodewilmington.froilansfarm.WeekdayTests;

import com.zipcodewilmington.froilansfarm.MainApplication;
import org.junit.Assert;
import org.junit.Test;

public class SundayTest {

    @Test
    public void sundayTest() {
        MainApplication mainApplication = new MainApplication();
        mainApplication.beginDay();
        mainApplication.morningRoutine();
        mainApplication.sundayRoutine();
        int expected = 3;
        int actual = mainApplication.getFroilansFarm().getField().getCropRows()[0].getCropArrayList().size();
        Assert.assertEquals(expected, actual);
    }

}
