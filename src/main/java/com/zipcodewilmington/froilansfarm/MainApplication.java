package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Buildings.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Plants.CornStalk;
import com.zipcodewilmington.froilansfarm.Plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

/**
 * Created by leon on 2/26/18.
 * Improved by a dingus on 3/1/18.
 */
public class MainApplication {

    // ESTABLISHING THE PLOT!!

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

    public CropDuster getFroilandasCropDuster() {
        return froilandasCropDuster;
    }

    // THE PLOT THICKENS!!!!

    public void beginDay() {
        getFroilansFarm().getHorseStables().get(0).addHorse(new Horse());
        getFroilansFarm().getHorseStables().get(0).addHorse(new Horse());
        getFroilansFarm().getHorseStables().get(0).addHorse(new Horse());
        getFroilansFarm().getHorseStables().get(0).addHorse(new Horse());
        getFroilansFarm().getHorseStables().get(1).addHorse(new Horse());
        getFroilansFarm().getHorseStables().get(1).addHorse(new Horse());
        getFroilansFarm().getHorseStables().get(1).addHorse(new Horse());
        getFroilansFarm().getHorseStables().get(1).addHorse(new Horse());
        getFroilansFarm().getHorseStables().get(2).addHorse(new Horse());
        getFroilansFarm().getHorseStables().get(2).addHorse(new Horse());
        getFroilansFarm().getChickenCoops().get(0).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(0).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(0).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(0).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(0).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(0).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(0).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(0).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(0).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(1).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(1).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(2).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(2).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(3).addChicken(new Chicken());
        getFroilansFarm().getChickenCoops().get(3).addChicken(new Chicken());
        TomatoPlant tomatoPlant1 = new TomatoPlant();
        getFroilansFarm().getField().getCropRows()[0].getCropArrayList().add(tomatoPlant1);
        TomatoPlant tomatoPlant2 = new TomatoPlant();
        getFroilansFarm().getField().getCropRows()[0].getCropArrayList().add(tomatoPlant2);
        CornStalk cornStalk1 = new CornStalk();
        getFroilansFarm().getField().getCropRows()[1].getCropArrayList().add(cornStalk1);
        CornStalk cornStalk2 = new CornStalk();
        getFroilansFarm().getField().getCropRows()[1].getCropArrayList().add(cornStalk2);
    }

}
