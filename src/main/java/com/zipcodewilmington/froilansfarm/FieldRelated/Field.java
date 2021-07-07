package com.zipcodewilmington.froilansfarm.FieldRelated;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<CropRow> cropRows;

    public Field(){
        cropRows = new ArrayList<>();
    }

    public void add(CropRow cropRow) {
        this.cropRows.add(cropRow);
    }

    public void remove(CropRow cropRow) {
        this.cropRows.remove(cropRow);
    }

   // public void remove(Integer Index) {
       // this.cropRows.remove(Index);
   // }

    public List<CropRow> getCropRows() {
        return cropRows;
    }


}
