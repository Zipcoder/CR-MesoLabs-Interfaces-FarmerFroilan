package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist{

    private String name;

    public Farmer(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void plant(Crop cropToPlant, CropRow rowToPlantIn) {
        rowToPlantIn.cropArrayList.add(cropToPlant);
    }

    public String fertilizeOnVehicle(Crop cropToBeFertilized) {
        return null;
        // need to figure out how to check for mount in order to tell vehicle to fertilize
    }

    public void eat(Edible food) {

    }

}
