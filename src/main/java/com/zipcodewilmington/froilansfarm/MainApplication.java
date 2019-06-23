package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Froilan;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main () {
        List<TomatoPlant> tomatoplantsinarow = new ArrayList<TomatoPlant>();
        CropRow<TomatoPlant> cropRow = new CropRow<TomatoPlant>(tomatoplantsinarow);
       Farmer myfarmer = new Farmer();
       Tomatoes harvestedtomatoes = myfarmer.farmerHarvest(cropRow);
       myfarmer.foodStore(harvestedtomatoes);

    }

}
