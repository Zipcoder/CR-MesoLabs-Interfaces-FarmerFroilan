package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;

import java.util.ArrayList;

public class CropRow {
    private ArrayList<Crop> row;

    public CropRow(Crop ... cropsToPlant){
        this.row = new ArrayList<>(0);
        for(Crop c : cropsToPlant){
            row.add(c);
        }
    }

    public void addCrop(Crop cropToPlant){
        this.row.add(cropToPlant);

    }

    public void removeCrop(Crop cropToRemove){
        this.row.remove(cropToRemove);

    }

    public Crop getCrop(Crop cropToGet){
        return this.row.get(this.row.indexOf(cropToGet));
    }

    public Crop getCrop(int cropIndex){
        return this.row.get(cropIndex);
    }

    public ArrayList<Crop> getAllCrops(){
        return this.row;
    }

    public int getRowSize(){
        return this.row.size();
    }

}
