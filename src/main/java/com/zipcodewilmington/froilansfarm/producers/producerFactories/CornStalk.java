package com.zipcodewilmington.froilansfarm.producers.producerFactories;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.storage.CornSilo;

public class CornStalk extends Crop {
    private Boolean isFertilized;

    public CornStalk(){
        this.isFertilized = false;
    }

    public CornStalk(Boolean isFertilized){
        this.isFertilized = isFertilized;
    }

    public Boolean getIsFertilized(){
        return this.isFertilized;
    }

    public void setIsFertilized(Boolean isFertilized){
        this.isFertilized = isFertilized;
    }

    @Override
    public Corn yield(){
        if (isFertilized) {
            return new Corn();
        }
        return null;
    }


}
