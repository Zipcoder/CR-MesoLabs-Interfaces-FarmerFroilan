package com.zipcodewilmington.froilansfarm.Animal;

    import com.zipcodewilmington.froilansfarm.Crops.CropRow;
    import com.zipcodewilmington.froilansfarm.Crops.Crops;
    import com.zipcodewilmington.froilansfarm.Farm;
    import com.zipcodewilmington.froilansfarm.Produce.*;
    import com.zipcodewilmington.froilansfarm.Vehicles.Driveable;
    import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;

    import java.util.ArrayList;
    import java.util.List;

    public class Farmer implements Person, Botanist, Rider, Driver {

            Farm farm;
            List<Edible> foodEaten = new ArrayList<Edible>();
            List<Farmer> froilanFarmers = new ArrayList<Farmer>();

            public Farmer(Person person, Farm farm){
                super();
                this.farm = farm;
            }

            public Farmer() {
                super();
            }

            public Farm fetchFarm() {
                return new Farm();
            }

            public String makeNoise() {
                return "Hey there y'all Sassafrases! Welcome to mah farm!";
            }

            public List<Edible> harvest() {
                //insert condition to check if plants are ready for harvest.
                List<Edible> harvestCrops = new ArrayList<Edible>();
                Tomatoes tomatoes = new Tomatoes();
                StringBeans stringbeans = new StringBeans();
                Cucumbers cucumbers = new Cucumbers();
                EarOfCorn corn = new EarOfCorn();
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

            public List reproduce(Integer increaseBy) {
                for (int i = 0; i < increaseBy; i++) {
                    froilanFarmers.add(new Farmer());
                } return froilanFarmers;
            }

            public boolean isHungry() {
                if (foodEaten.isEmpty()) {
                    return true;
                } return false;
            }

            public void eatEdible(Edible food) {
                if (isHungry()) {
                    foodEaten.add(food);
                }
            }

            public List<Edible> getFoodEaten() {
                return foodEaten;
            }

            public void feedFarmAnimals(Eater animal, Edible food) {
                Froilan froilan = new Froilan(new Farm());
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

            public void drive(Driveable vehicle) {
                vehicle.setOperateVehicle(true);
            }
            public void ceaseDrive(Driveable vehicle) {
                vehicle.setOperateVehicle(false);
            }
    }





