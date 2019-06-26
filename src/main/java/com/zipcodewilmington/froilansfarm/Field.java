package com.zipcodewilmington.froilansfarm;



import com.zipcodewilmington.froilansfarm.Crops.CropRow;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public  class Field {

    private List<CropRow> field = new ArrayList<>();


    public Field(){

    }

    public Boolean isEmpty() {

        return field.isEmpty();
    }

    public void add(CropRow cropRow) {
        field.add(cropRow);
    }

    public Integer itemCount() {

        return field.size();
    }

    public void remove(CropRow cropRow) {

        field.remove(cropRow);
    }

}

