package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Egg;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Buildings.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Plants.CornStalk;
import com.zipcodewilmington.froilansfarm.Plants.EarCorn;
import com.zipcodewilmington.froilansfarm.Plants.Tomato;
import com.zipcodewilmington.froilansfarm.Plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

/**
 * Created by leon on 2/26/18.
 * Improved by a dingus on 3/1/18.
 */
public class MainApplication {

    // ESTABLISHING THE PLOT!!

    private Farm froilansFarm = new Farm(4,3);
    private Farmer froilan = new Farmer("Froilan");
    private Pilot froilanda = new Pilot("Froilanda");
    private Tractor froilansTractor = new Tractor();
    private CropDuster froilandasCropDuster = new CropDuster();

    public Farm getFroilansFarm() {
        return this.froilansFarm;
    }

    public Farmer getFroilan() {
        return this.froilan;
    }

    public Pilot getFroilanda() {
        return this.froilanda;
    }

    public Tractor getFroilansTractor() {
        return this.froilansTractor;
    }

    public CropDuster getFroilandasCropDuster() {
        return this.froilandasCropDuster;
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
        getFroilan().plant(tomatoPlant1, getFroilansFarm().getField().getCropRows()[0]);
        TomatoPlant tomatoPlant2 = new TomatoPlant();
        getFroilansFarm().getField().getCropRows()[0].getCropArrayList().add(tomatoPlant2);
        CornStalk cornStalk1 = new CornStalk();
        getFroilansFarm().getField().getCropRows()[1].getCropArrayList().add(cornStalk1);
        CornStalk cornStalk2 = new CornStalk();
        getFroilansFarm().getField().getCropRows()[1].getCropArrayList().add(cornStalk2);
        addFoodsToInventoryUtility();
    }

    private void addFoodsToInventoryUtility() {
        EarCorn earCorn = new EarCorn();
        Tomato tomato = new Tomato();
        Egg egg = new Egg();
        for (int i = 0; i < 50; i++) {
            froilan.getFoodInventory().add(earCorn);
            froilan.getFoodInventory().add(tomato);
            froilan.getFoodInventory().add(egg);
        }
    }

    public void morningRoutine() {
        for (int i = 0; i < getFroilansFarm().getHorseStables().size(); i++) {
            getFroilan().exerciseHorses(getFroilansFarm().getHorseStables().get(i));
        }
        for (int i = 0; i < getFroilansFarm().getHorseStables().size(); i++) {
            getFroilan().feedAllHorses(getFroilansFarm().getHorseStables().get(i));
        }
        froilansBreakfast();
        froilandasBreakfast();
    }

    public void froilansBreakfast() {
        // Corn loop
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < getFroilan().getFoodInventory().size(); j++) {
                if (getFroilan().getFoodInventory().get(j) instanceof EarCorn) {
                    getFroilan().eat(getFroilan().getFoodInventory().get(j));
                }
            }
        }
        // Tomato loop
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < getFroilan().getFoodInventory().size(); j++) {
                if (getFroilan().getFoodInventory().get(j) instanceof Tomato) {
                    getFroilan().eat(getFroilan().getFoodInventory().get(j));
                }
            }
        }
        // Egg loop
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < getFroilan().getFoodInventory().size(); j++) {
                if (getFroilan().getFoodInventory().get(j) instanceof Egg) {
                    getFroilan().eat(getFroilan().getFoodInventory().get(j));
                }
            }
        }
    }

    public void froilandasBreakfast() {
        // Corn loop
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < getFroilan().getFoodInventory().size(); j++) {
                if (getFroilan().getFoodInventory().get(j) instanceof EarCorn) {
                    getFroilan().feed(getFroilanda(), getFroilan().getFoodInventory().get(j));
                }
            }
        }
        // Tomato loop
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < getFroilan().getFoodInventory().size(); j++) {
                if (getFroilan().getFoodInventory().get(j) instanceof Tomato) {
                    getFroilan().feed(getFroilanda(), getFroilan().getFoodInventory().get(j));
                }
            }
        }
        // Egg loop
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < getFroilan().getFoodInventory().size(); j++) {
                if (getFroilan().getFoodInventory().get(j) instanceof Egg) {
                    getFroilan().feed(getFroilanda(), getFroilan().getFoodInventory().get(j));
                }
            }
        }
    }

}
