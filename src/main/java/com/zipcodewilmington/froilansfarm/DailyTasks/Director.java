package com.zipcodewilmington.froilansfarm.DailyTasks;


import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Froilan;
import com.zipcodewilmington.froilansfarm.Farm;




public class Director {

    private DaysOfWeek day;
    private Farm farm;

    public Director(Farm farm) {
        day = DaysOfWeek.SUNDAY;
        this.farm = farm;
    }

    protected void doDailyActivites() {
        //TODO
        //Froilan and Foilanda:
        //Ride each Horse in the Stable
        //Feed each Horse 3 ear of Corn

        //Froilan eats 1 EarOfCorn 2 Tomato and 5 Egg
        //Froilanda eats 2 EarOfCorn 1 Tomato and 2 Egg

        //Collect Eggs
    }

    protected void doSundayActivites() {
        //TODO
        //Froilan plants 4 different type of Crops in the first, second, third, and fourth row
    }

    protected void doMondayActivites() {
        //TODO
        //Froilanda fertilizes the fields with the CropDuster
    }

    protected void doTuesdayActivites() {
        //TODO
        //Froilan uses the tractor to harvest each Crop in each CropRow
    }

    protected void doWednesdayActivites() {
        //TODO
        //Froilan plants 4 different type of Crops in the first, second, third, and fourth row
    }

    protected void doThursdayActivites() {
        //TODO
        //Froilanda fertilizes the fields with the CropDuster
    }

    protected void doFridayActivites() {
        //TODO
        //Froilan uses the tractor to harvest each Crop in each CropRow
    }

    protected void doSaturdayActivites() {
        //TODO
        //Take excess to market
    }

    protected void nextDay() {

    }


}
