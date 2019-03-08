package com.zipcodewilmington.froilansfarm.producers.producerFactories;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;

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

    public void setIsFertilized(Boolean isFertilized){}

    public void setNumberOfCorn(Integer numberOfCorn){}

    public void setId(Long id){}

    @Override
    public void yield(){
    }


}
