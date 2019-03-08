package com.zipcodewilmington.froilansfarm.producers.producerFactories;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;

public class CornStalk extends Crop {
    private Boolean isFertilized;
    private Integer numberOfCorn;
    private Long id;

    public CornStalk(){}

    public CornStalk(Boolean isFertilized, Integer numberOfCorn, Long id){
        this.isFertilized = isFertilized;
        this.numberOfCorn = numberOfCorn;
        this.id = id;
    }

    public Boolean getIsFertilized(){
        return this.isFertilized;
    }

    public Integer getNumberOfCorn(){
        return this.numberOfCorn;
    }

    public Long getId(){
        return this.id;
    }

    public void setIsFertilized(Boolean isFertilized){
        this.isFertilized = isFertilized;
    }

    public void setNumberOfCorn(Integer numberOfCorn){
        this.numberOfCorn = numberOfCorn;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Override
    public void yield(){
    }


}
