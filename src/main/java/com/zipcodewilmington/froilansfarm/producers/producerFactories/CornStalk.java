package com.zipcodewilmington.froilansfarm.producers.producerFactories;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.produce.ProduceInterface;

public class CornStalk extends Crop {
    private Boolean isFertilized;

    public CornStalk(){}

    public CornStalk(Boolean isFertilized, Integer numberOfCorn, Long id){}

    public Boolean getIsFertilized(){
        return null;
    }

    public Integer getNumberOfCorn(){
        return null;
    }

    public Long getId(){
        return null;
    }

    @Override
    public Corn yield(){
        return null;
    }


}
