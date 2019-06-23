package com.zipcodewilmington.froilansfarm.Animal;

    import com.zipcodewilmington.froilansfarm.Crops.CropRow;
    import com.zipcodewilmington.froilansfarm.Crops.Crops;
    import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
    import com.zipcodewilmington.froilansfarm.Farm;
    import com.zipcodewilmington.froilansfarm.Produce.*;
    import com.zipcodewilmington.froilansfarm.Tomato;
    import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;
    import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

    import java.util.ArrayList;
    import java.util.List;

    public class Farmer implements Person, Botanist, Rider, NoiseMaker {

            Farmer farmer;
            Farm farm;
            List<Edible> foodEaten = new ArrayList<Edible>();

            public Farmer(Person person, Farm farm){
                super();
                this.farm = farm;
            }

            public Farmer() {
                super();
            }

            public boolean isHungry() {

                if (!hasEaten() && foodEaten.isEmpty()) {
                    return true;
                } return false;
            }

            public List reproduce(Integer increaseBy) {
                List<Farmer> farmers = new ArrayList();
                for (int i = 0; i < increaseBy; i++) {
                    farmers.add(farmer);
                } return farmers;
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

            public List<Edible> getFoodFromStorage() {
                return null;
            }


            public void eatEdible(Edible e) {
                if (isHungry() && !hasEaten()) {
                    foodEaten.add(e);
                }
            }

            public boolean hasEaten() {
                if (foodEaten.isEmpty()) {
                    return false;
                } return true;
            }

            public List<Edible> getFoodEaten() {
                return foodEaten;
            }

            public String makeNoise() {
                return "Hey there y'all Sassafrases! Welcome to Froilan's farm!";
            }


            public void operateVehicle(Rideable vehicle) {
                vehicle.setOperateVehicle(true);
            }

            public void stopOperatingVehicle(Rideable vehicle) {
                vehicle.setOperateVehicle(false);
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


//        Tomato tomato=new Tomato();
//        public Tomatoes harvest(CropRow<TomatoPlant> tomatorow){
//            Tractor tractor = new Tractor();
//            Tomatoes tomatoes = new Tomatoes();
//            List<TomatoPlant> tomatoPlantsInTheRow = tomatorow.getTplant();
//            for (TomatoPlant tomatoPlantInTheRow:tomatoPlantsInTheRow)
//            {
//               // tomatoes.addTomatoes(tractor.harvest(tomatoPlantInTheRow));
//            }return tomatoes;
//        }
        // public Tomatoes tomatoesStorage(){
        // FoodStorage<tomato> tomnotostorage;
//tomnotostorage.add(tomato)



