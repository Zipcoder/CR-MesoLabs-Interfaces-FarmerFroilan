package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;

import java.util.ArrayList;

public class Field implements Storage<CropRows>{
    private ArrayList<CropRows> cropRows;
    private Integer numberOfCropRows;

    public Field(){
        cropRows = new ArrayList<CropRows>();
       // this.numberOfCropRows = cropRows.size();
    }

    public Field(Integer numberOfCropRows){
        this.numberOfCropRows = numberOfCropRows;
    }

    public Integer getNumberOfCropRows(){

        //return numberOfCropRows;
        return this.cropRows.size();
    }

    public void setNumberOfCropRows(Integer numberOfCropRows){
        this.numberOfCropRows = numberOfCropRows;
    }

    public void add(CropRows cropRow) {
       // this.numberOfCropRows = numberOfCropRows + 1;
        this.cropRows.add(cropRow);
    }

    public CropRows getCropRow(Integer index){
        return cropRows.get(index);
    }
}
