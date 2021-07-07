package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crops;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;
public abstract class Farmer implements Person, Botanist, Rider, Driver {

        List<Edible> foodEaten = new ArrayList<Edible>();

        public Farmer(String name){
        }

        public List<Edible> getFoodEaten() {
                return foodEaten;
            }


        public void plant(Field field, CropRow cropRow) {
                field.add(cropRow);
        }

        public void eatEdible(Edible food) {
                foodEaten.add(food);
        }

        @Override
        public String makeNoise() {
                return "Howdy y'all!";
        }

        public Edible harvest(Tractor tractor, Crops crops) {
                return tractor.harvest(crops);
        }
    }



