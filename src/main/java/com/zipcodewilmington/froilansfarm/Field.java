package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<CropRow> rows;

    public Field() {
        rows = new ArrayList<>();
    }
    
    public void makeRow() {
        rows.add(new CropRow());
    }

}
