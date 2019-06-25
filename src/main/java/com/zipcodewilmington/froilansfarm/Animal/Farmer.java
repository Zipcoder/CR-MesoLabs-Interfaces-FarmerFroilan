package com.zipcodewilmington.froilansfarm.Animal;

    import com.zipcodewilmington.froilansfarm.Crops.CropRow;
    import com.zipcodewilmington.froilansfarm.Crops.Crops;

    import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;

    import com.zipcodewilmington.froilansfarm.FoodStorage;
    import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
    import com.zipcodewilmington.froilansfarm.Farm;

    import com.zipcodewilmington.froilansfarm.Produce.*;
    import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;

    import com.zipcodewilmington.froilansfarm.Vehicles.Driveable;


    import java.util.ArrayList;
    import java.util.List;






    public class Farmer implements Person, Botanist, Rider, Driver {


            List<Edible> foodEaten = new ArrayList<Edible>();

            public Farmer(String name){
            }



        FoodStorage foodStorage = new FoodStorage();

        public Farmer() {

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

        public void feedFarmAnimals(Eater animal, Edible food) {

        }

        public List reproduce(Integer increaseBy) {
            return null;
        }

        public void eatEdible(Edible food) {

        }

        public boolean isHungry() {
            return false;
        }

        public List<Edible> getFoodEaten() {
            return null;
        }

        @Override
        public String makeNoise() {
            return null;
        }
    }



