package com.zipcodewilmington.froilansfarm;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    private MainApplication testApp;


    @Before
    public void setup() {
        testApp = new MainApplication();
        testApp.establishThePlot();
    }

    @Test
    public void morningRoutineTest() {
        testApp.morningRoutine();
    }


    @Test
    public void sundayTest1() {


    }

    @Test
    public void sundayTest2() {


    }

    @Test
    public void mondayTest() {


    }

    @Test
    public void tuesdayTest() {


    }


    @Test
    public void wednesdayTest() {


    }


    @Test
    public void thursdayTest() {


    }

    @Test
    public void fridayTest() {



    }

    @Test
    public void saturdayTest() {


    }


}
