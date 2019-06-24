package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Crops.CropRow;

import java.util.ArrayList;
import java.util.List;


public class Field {
    private CropRow cropRow;
    List<CropRow> field = new ArrayList<>();


    public Boolean isEmpty() {

        return field.isEmpty();
    }


    public void add() {
        field.add(cropRow);
    }

    public Integer itemCount() {

        return field.size();
    }

    public void remove() {

        field.remove(cropRow);
    }
}

