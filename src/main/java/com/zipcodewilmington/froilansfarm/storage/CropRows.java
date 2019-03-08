package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.produce.Tomato;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import com.zipcodewilmington.froilansfarm.storage.Storage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class CropRows implements Storage<Crop> {
    private Crop crops;
    private Integer numberOfCornStalk;
    private Integer numberOfTomatoPlant;

    public CropRows(Integer numberOfCornStalk, Integer numberOfTomatoPlant){
        this.numberOfCornStalk = numberOfCornStalk;
        this.numberOfTomatoPlant = numberOfTomatoPlant;
    }

    public CropRows(){
        this.numberOfCornStalk = 0;
        this.numberOfTomatoPlant = 0;
    }

    public Integer getNumberOfCornStalks(){
        return numberOfCornStalk;
    }

    public Integer getNumberOfTomatoPlants(){
        return numberOfTomatoPlant;
    }

    public void setNumberOfCornStalk(Integer numberOfCornStalk){
        this.numberOfCornStalk = numberOfCornStalk;
    }

    public void setNumberOfTomatoPlant(Integer numberOfTomatoPlant){
        this.numberOfTomatoPlant = numberOfTomatoPlant;
    }

    public void add(Crop storageObject) {
        if(storageObject instanceof CornStalk) {
            this.numberOfCornStalk = numberOfCornStalk + 1;
        } else if (storageObject instanceof TomatoPlant){
            this.numberOfTomatoPlant = numberOfTomatoPlant + 1;
        }
    }

    public void remove(Crop crop) {
        if(crop instanceof CornStalk){
            this.numberOfCornStalk = numberOfCornStalk - 1;
        } else if (crop instanceof TomatoPlant){
            this.numberOfTomatoPlant = numberOfTomatoPlant - 1;
        }
    }

}
