package com.zipcodewilmington.froilansfarm.Animal;

    import com.zipcodewilmington.froilansfarm.Crops.CropRow;
    import com.zipcodewilmington.froilansfarm.Crops.Crops;
    import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;

    import com.zipcodewilmington.froilansfarm.FoodStorage;
    import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;

    import com.zipcodewilmington.froilansfarm.Produce.*;
    import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;

    import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

    import com.zipcodewilmington.froilansfarm.Farm;
    import com.zipcodewilmington.froilansfarm.Vehicles.Driveable;


    import java.util.ArrayList;
    import java.util.List;


    public class Farmer implements Person, Botanist, Rider, NoiseMaker {


        //com.zipcodewilmington.froilansfarm.Animal.Farmer farmer;

        Farmer farmer;
        Farm farm;

        List<Edible> foodEaten = new ArrayList<Edible>();
        List<Farmer> froilanFarmers = new ArrayList<Farmer>();

        public Farmer(Person person, Farm farm) {
            super();
            this.farm = farm;
        }

        public Farmer() {
            super();
        }

//        public Farm fetchFarm() {
//            return new Farm();
//        }

        public String makeNoise() {
            return "Hey there y'all Sassafrases! Welcome to mah farm!";
        }

        FoodStorage foodStorage = new FoodStorage();

        public Tomatoes farmerHarvest(CropRow<TomatoPlant> tomatorow) {
            Tractor tractor = new Tractor();
            Tomatoes tomatoes = new Tomatoes();
            List<TomatoPlant> tomatoPlants = tomatorow.getTplant();
            tomatoes = (Tomatoes) tractor.harvest((TomatoPlant) tomatoPlants);
            return tomatoes;
        }

        public void foodStore(Tomatoes tomatoes) {
            foodStorage.add(tomatoes);
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
                froilanFarmers.add(farmer);
            }
            return froilanFarmers;
        }

        public boolean isHungry() {

            if (!hasEaten() && foodEaten.isEmpty()) {
                return true;
            }
            return false;
        }

        public boolean hasEaten() {
            if (foodEaten.isEmpty()) {
                return false;
            }
            return true;
        }

        public void eatEdible(Edible food) {
            if (isHungry() && !hasEaten()) {
                foodEaten.add(food);
            }
        }

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }

        public void operateVehicle(Driveable vehicle) {
            vehicle.setOperateVehicle(true);
        }


        public void operateVehicle() {

//
//            public void feedFarmAnimals (Eater animal, Edible food){
//                farmer.feedFarmAnimals(animal, food);
//
//            }
//
//            public void stopOperatingVehicle (Driveable vehicle){
//                vehicle.setOperateVehicle(false);
//            }
//
//            public void mount (Rideable rideable){
//                rideable.setMounted(true);
//            }
//
//            public void dismount (Rideable rideable){
//                rideable.setMounted(false);
//            }
//
//            public void plant (Crops crops, CropRow cropRow){
//                CropRow.addCrops(crops);
//            }

//            public boolean makesNoise () {
//                return true;
//            }

        }


        public void plant(Crops crops, CropRow cropRow) {

        }

        public void feedFarmAnimals(Eater animal, Edible food) {

        }

        public void mount(Rideable rideable) {

        }

        public void dismount(Rideable rideable) {

        }
    }



