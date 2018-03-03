package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.ChickenFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.Produce;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Egg;

public class Chicken extends Animal implements Produce {

    private boolean fertilized;
    private boolean harvested;

    public Chicken(String name){
        super(name);
    }

    public Chicken(){
        super();
    }


    public void eat(Edible food) {
        if(food instanceof ChickenFeed){
            this.hasEaten = true;
            this.energyReserves += food.getEnergyValue();
        }

    }

    public String makeNoise() {
        return "bucKAW!!!";
    }

    public Egg yield() {
        if(!this.isFertilized() && this.isHarvested()) {
            return new Egg();
        }
        else{
            return null;
        }
    }

    public void fertilize(){
        this.fertilized=true;
    }

    public Boolean isFertilized(){
        return this.fertilized;
    }

    public void harvest(){
        this.harvested=true;
    }

    public Boolean isHarvested(){
        return this.harvested;
    }

}
