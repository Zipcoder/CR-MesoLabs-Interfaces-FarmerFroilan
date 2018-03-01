package com.zipcodewilmington.froilansfarm.crop;

public class CornStalk extends Crop{

    public EarCorn yield() {
        if (this.hasBeenFertilized && !this.hasBeenHarvested) {
            this.hasBeenHarvested = true;
            return new EarCorn();
        } else {
            return null;
        }
    }

    public boolean getHasBeenHarvested(){
        return this.hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean harvested){
        this.hasBeenHarvested = harvested;
    }

    public boolean getHasBeenFertilized(){
        return this.hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean fertilized){
        this.hasBeenFertilized = fertilized;
    }

    public void endOfDayReset(){
        this.hasBeenHarvested = false;
        this.hasBeenFertilized= false;
    }


}
