package com.zipcodewilmington.froilansfarm;

public interface Botanist {

    public void plant(Crop cropToPlant, CropRow rowToPlantIn);

    public String fertilizeOnVehicle(Crop crop);

}
