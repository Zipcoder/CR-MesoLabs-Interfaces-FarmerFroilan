package com.zipcodewilmington.froilansfarm.producers.producerFactories;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.storage.CornSilo;

public class CornStalk extends Crop {
    private Boolean isFertilized;
    private Integer numberOfCorn;

    public CornStalk(){
        this.isFertilized = false;
        this.numberOfCorn = 0;
    }

    public CornStalk(Boolean isFertilized, Integer numberOfCorn){
        this.isFertilized = isFertilized;
        this.numberOfCorn = numberOfCorn;
    }

    public Boolean getIsFertilized(){
        return this.isFertilized;
    }

    public Integer getNumberOfCorn(){
        return this.numberOfCorn;
    }

    public void setIsFertilized(Boolean isFertilized){
        this.isFertilized = isFertilized;
    }

    public void setNumberOfCorn(Integer numberOfCorn){
        this.numberOfCorn = numberOfCorn;
    }

    @Override
    public void yield(){
        this.numberOfCorn = numberOfCorn + 1;
    }


}
