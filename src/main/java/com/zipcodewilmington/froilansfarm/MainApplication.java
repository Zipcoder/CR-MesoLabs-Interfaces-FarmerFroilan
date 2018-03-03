package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Buildings.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

/**
 * Created by leon on 2/26/18.
 * Improved by a dingus on 3/1/18.
 */
public class MainApplication {

    // ESTABLISHING THE PLOT

    private Farm froilansFarm = new Farm(4,3,5);
    private Farmer froilan = new Farmer("Froilan");
    private Pilot froilanda = new Pilot("Froilanda");
    private Tractor froilansTractor = new Tractor();
    private CropDuster froilandasCropDuster = new CropDuster();

    public Farm getFroilansFarm() {
        return froilansFarm;
    }

    public Farmer getFroilan() {
        return froilan;
    }

    public Pilot getFroilanda() {
        return froilanda;
    }

    public Tractor getFroilansTractor() {
        return froilansTractor;
    }

}
