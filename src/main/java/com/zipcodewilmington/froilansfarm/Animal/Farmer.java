package com.zipcodewilmington.froilansfarm.Animal;

    import com.zipcodewilmington.froilansfarm.Crops.CropRow;
    import com.zipcodewilmington.froilansfarm.Crops.Crops;

    import com.zipcodewilmington.froilansfarm.Farm;

    import com.zipcodewilmington.froilansfarm.Produce.*;
    import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;

    import java.util.ArrayList;
    import java.util.List;

    public abstract class Farmer implements Person, Botanist, Rider, Driver {


            List<Edible> foodEaten = new ArrayList<Edible>();

            public Farmer(String name){
            }

            public String makeNoise() {
                return "Hey there y'all Sassafrases!";
            }


            public List<Bounty> harvest() {
                //insert condition to check if plants are ready for harvest.
                List<Bounty> harvestCrops = new ArrayList<>();
                Tomatoes tomatoes = new Tomatoes();
                StringBeans stringbeans = new StringBeans();
                Cucumbers cucumbers = new Cucumbers();
                EarsOfCorn corn = new EarsOfCorn();
                harvestCrops.add(tomatoes);
                harvestCrops.add(stringbeans);
                harvestCrops.add(cucumbers);
                harvestCrops.add(corn);
                return harvestCrops;
            }

//            public List<Edible> getFoodFromStorage() {
//
//                return (List<Edible>) FoodStorage.getT();
//            }



            public boolean isHungry() {
                if (foodEaten.isEmpty()) {
                    return true;
                } return false;

            }

            public void eatEdible(Edible food) {
                foodEaten.add(food);
            }

            public List<Edible> getFoodEaten() {
                return foodEaten;
            }

            public void feedFarmAnimals(Eater animal, Edible food) {
                Froilan froilan = new Froilan();
                Froilanda froilanda = new Froilanda();
                froilan.feedFarmAnimals(animal, food);
                froilanda.feedFarmAnimals(animal, food);
            }

            public void mount(Rideable rideable) {
                rideable.setMounted(true);
            }

            public void dismount(Rideable rideable) {
                rideable.setMounted(false);
            }

            public void plant(Crops crops, CropRow cropRow) {
                CropRow.addCrops(crops);
            }

    }





