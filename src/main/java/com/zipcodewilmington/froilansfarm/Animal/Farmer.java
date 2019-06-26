package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crops;
import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;
import com.zipcodewilmington.froilansfarm.Vehicles.Driveable;

import java.util.ArrayList;
import java.util.List;
public abstract class Farmer implements Person, Botanist, Rider, Driver {

        List<Edible> foodEaten = new ArrayList<Edible>();

        public Farmer(String name){
        }

        public List<Edible> harvest() { return null;
                //Determine harvest behavior later
//                List<Edible> harvestCrops = new ArrayList<Edible>();
//                Tomatoes tomatoes = new Tomatoes();
//                StringBeans stringbeans = new StringBeans();
//                Cucumbers cucumbers = new Cucumbers();
//                EarOfCorn corn = new EarOfCorn();
//                harvestCrops.add(tomatoes);
//                harvestCrops.add(stringbeans);
//                harvestCrops.add(cucumbers);
//                harvestCrops.add(corn);
//                return harvestCrops;
        }

        public List<Edible> getFoodEaten() {
                return foodEaten;
            }


        public void plant(Crops crops, CropRow cropRow) {

        }

        public void drive(Driveable vehicle) {

        }

        public void ceaseDrive(Driveable vehicle) {

        }

        public void mount(Rideable rideable) {

        }

        public void dismount(Rideable rideable) {

        }

        public void eatEdible(Edible food) {

        }

        @Override
        public String makeNoise() {
            return null;
        }
    }



