package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import com.zipcodewilmington.froilansfarm.storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class CropRows implements Storage<Crop> {
    private Crop crops;
    private Integer numberOfCornStalk;
    private Integer numberOfTomatoPlant;
    private List<Crop> cropList = new ArrayList<Crop>();

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
        cropList.add(storageObject);
    }

    public Crop retrieve(Integer objectId) {
        return null;
    }
}
