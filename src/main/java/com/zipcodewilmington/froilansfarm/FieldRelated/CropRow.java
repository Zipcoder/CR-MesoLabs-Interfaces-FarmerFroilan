package com.zipcodewilmington.froilansfarm.FieldRelated;

import java.util.ArrayList;
import java.util.List;

public class CropRow extends Field {


    private Boolean hasBeenFertilized;
    private List<Crop> cropRow;


    public CropRow(){
        hasBeenFertilized=false;
        cropRow= new ArrayList<Crop>();
    }

    public void add(Crop crop){
        cropRow.add(crop);
    }

    public List<Crop> getCropRow(){
        return cropRow;
    }

    public Integer count(){
        return cropRow.size();
    }

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public void remove(){
        //Crop temp = cropRow.get(index);
        cropRow.remove(0);
        //return temp;
    }
    public Crop getCrop() {
        return cropRow.get(0);
    }
    public Boolean getHasBeenFertilized() {
        return this.hasBeenFertilized;
    }
}
