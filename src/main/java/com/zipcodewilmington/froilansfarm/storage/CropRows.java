package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import com.zipcodewilmington.froilansfarm.storage.Storage;

public class CropRows implements Storage<Crop> {
    private Crop crops;
    private Integer numberOfCornStalk;
    private Integer numberOfTomatoPlant;

    public CropRows(Integer numberOfCornStalk, Integer numberOfTomatoPlant){
        this.numberOfCornStalk = numberOfCornStalk;
        this.numberOfTomatoPlant = numberOfTomatoPlant;
    }

    public CropRows(){}

    public CornStalk getNumberOfCornStalks(){
        return null;
    }

    public TomatoPlant getNumberOfTomatoPlants(){
        return null;
    }

    public void setNumberOfCornStalk(){}

    public void add(Crop storageObject) {

    }

    public Crop retrieve(Integer objectId) {
        return null;
    }
}
