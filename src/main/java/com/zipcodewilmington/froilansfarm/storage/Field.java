package com.zipcodewilmington.froilansfarm.storage;

public class Field implements Storage<CropRows>{
    private   cropRows;
    private Integer numberOfCropRows;

    public Field(){
        this.numberOfCropRows = 0;
    }

    public Field(Integer numberOfCropRows){
        this.numberOfCropRows = numberOfCropRows;
    }

    public Integer getNumberOfCropRows(){
        return numberOfCropRows;
    }

    public void setNumberOfCropRows(Integer numberOfCropRows){
        this.numberOfCropRows = numberOfCropRows;
    }

    public void add(CropRows storageObject) {
        this.numberOfCropRows = numberOfCropRows + 1;
    }
}
