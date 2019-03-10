package com.zipcodewilmington.froilansfarm.producers.producerFactories;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.produce.Pumpkin;

public class PumpkinPlant extends Crop {
    private Boolean isFertilized;
    private Integer numberOfPumpkins;

    public PumpkinPlant(){
        this.isFertilized = false;
        this.numberOfPumpkins = 0;
    }

    public PumpkinPlant(Boolean isFertilized, Integer numberOfPumpkins){
        this.isFertilized = isFertilized;
        this.numberOfPumpkins = numberOfPumpkins;
    }

    public Boolean getIsFertilized(){
        return this.isFertilized;
    }

    public Integer getNumberOfPumpkins(){
        return this.numberOfPumpkins;
    }

    public void setIsFertilized(Boolean isFertilized){
        this.isFertilized = isFertilized;
    }

    public void setNumberOfPumpkins (Integer numberOfPumpkins){
        this.numberOfPumpkins = numberOfPumpkins;
    }

    @Override
    public Pumpkin yield(){
        return null;
    }

}
