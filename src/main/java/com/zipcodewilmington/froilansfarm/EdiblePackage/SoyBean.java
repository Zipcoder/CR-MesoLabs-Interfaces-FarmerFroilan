package com.zipcodewilmington.froilansfarm.EdiblePackage;

public class SoyBean implements ChickenFood{
    public int numOfSoyBeans;

    public boolean hasBeenFertilized() {
        return false;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public void setNumOfSoyBeans(int num) {
        numOfSoyBeans = num;
    }
}
